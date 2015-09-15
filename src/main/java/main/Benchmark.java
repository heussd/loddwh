package main;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.pegdown.Extensions;
import org.pegdown.PegDownProcessor;

import com.hp.hpl.jena.query.Query;

import database.*;
import util.*;

public class Benchmark {

	public static void main(String[] args) throws IOException {

		List<BenchmarkObject> benchmarkObjects = new ArrayList<BenchmarkObject>();

	// OBJECTS
		// POSTGRESQL
		//benchmarkObjects.add(new BenchmarkObject(new PostgreSQL(), Dataset.hebis_small_rdf));

		// SQLite (Xerial)
		//benchmarkObjects.add(new BenchmarkObject(new SQLite4Java(), Dataset.hebis_small_rdf));

		// SQLite (Xerial)
		//benchmarkObjects.add(new BenchmarkObject(new SQLiteXerial(), Dataset.hebis_small_rdf));

		// VIRTUOSO
		benchmarkObjects.add(new BenchmarkObject(new Virtuoso("hebis_1000_test"), Dataset.hebis_tiny_rdf));
		benchmarkObjects.add(new BenchmarkObject(new Virtuoso("hebis_10000_test"), Dataset.hebis_small_rdf));
		//benchmarkObjects.add(new BenchmarkObject(new Virtuoso("hebis_100000_test"), Dataset.hebis_medium_rdf));
	// OBJECTS
		
		
		for(BenchmarkObject benchmarkObject : benchmarkObjects){
			Database db = benchmarkObject.getDatabase();
			long setUpStart, setUpEnd, loadStart, loadEnd;

			try {
				setUpStart = System.currentTimeMillis();
				db.setUp();
				setUpEnd = System.currentTimeMillis();

				loadStart = System.currentTimeMillis();
				db.load(benchmarkObject.getLoadDataset());
				loadEnd = System.currentTimeMillis();

				for (QueryScenario queryScenario : QueryScenario.values()) {
					long prepareStart, prepareEnd, queryStart, queryEnd, clearStart, clearEnd;

					try {
						prepareStart = System.currentTimeMillis();
						db.prepare(queryScenario);
						prepareEnd = System.currentTimeMillis();

						queryStart = System.currentTimeMillis();
						db.query(queryScenario);
						queryEnd = System.currentTimeMillis();

						clearStart = System.currentTimeMillis();
						db.clear(queryScenario);
						clearEnd = System.currentTimeMillis();

						benchmarkObject.getPrepareQueryScenarioResults().put(queryScenario, prepareEnd - prepareStart);
						benchmarkObject.getQueryQueryScenarioResults().put(queryScenario, queryEnd - queryStart);
						benchmarkObject.getClearQueryScenarioResults().put(queryScenario, clearEnd - clearStart);

					} catch (Exception e) { // TODO genauer spezifizieren?
						// Abort only current QueryScenario
						benchmarkObject.InvalidateQueryScenarioResults(queryScenario);

						// TODO log or something
						System.err.println("Fehler bei " + benchmarkObject.getTitle() + ", " + queryScenario);
						e.printStackTrace(System.err);

						continue;
					}
				}

				benchmarkObject.setSetUpTime(setUpEnd - setUpStart);
				benchmarkObject.setLoadTime(loadEnd - loadStart);

			} catch (Exception e) { // TODO genauer spezifizieren?
				// Abort only current BenchmarkObject
				benchmarkObject.InvalidateBenchmarkResults();

				// TODO log or something
				System.err.println("Fehler bei " + benchmarkObject.getTitle());
				e.printStackTrace(System.err);

				continue;
			}

			// TODO _persist_ current BenchmarkObject (Results) instant
			System.out.println(benchmarkObject);
		}

		makeReports(benchmarkObjects);		
	}

	private static void makeReports(List<BenchmarkObject> benchmarkObjects) throws IOException {
		int rows = QueryScenario.values().length + 2 + 1, columns = benchmarkObjects.size() + 1;
		Hashtable<QueryScenario, Integer> qsreportrowmapping = new Hashtable<QueryScenario, Integer>();
		int temp = 3;
		for (QueryScenario qs : QueryScenario.values()) {
			qsreportrowmapping.put(qs, temp);
			temp++;
		}
		String[][] reportmatrix = new String[rows][columns];
		reportmatrix[0][0] = "TESTCASE";
		reportmatrix[1][0] = "SETUP";
		reportmatrix[2][0] = "LOAD";		
		for (QueryScenario qs : QueryScenario.values()) {
			reportmatrix[qsreportrowmapping.get(qs)][0] = qs.toString();
		}
		
		int curcol = 1;
		for (BenchmarkObject bmo : benchmarkObjects) {
			reportmatrix[0][curcol] = bmo.getTitle();
			reportmatrix[1][curcol] = Long.toString(bmo.getSetUpTime());
			reportmatrix[2][curcol] = Long.toString(bmo.getLoadTime());
			for (QueryScenario qs : QueryScenario.values()) {
				reportmatrix[qsreportrowmapping.get(qs)][curcol] = Long.toString(bmo.getPrepareQueryScenarioResults().get(qs) + bmo.getQueryQueryScenarioResults().get(qs) + bmo.getClearQueryScenarioResults().get(qs)); 
			}
			
			curcol++;
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append("|");
		for(int c=0;c<columns;c++)
			sb.append(" " + reportmatrix[0][c] + " |");
		sb.append(System.lineSeparator());
		sb.append("| :- | :-: | :-: |" + System.lineSeparator());
		for(int i=1;i<rows;i++){
			sb.append("|");
			for(int j=0;j<columns;j++) {
				String val = reportmatrix[i][j];
				if(j>0) val += " ms";
				sb.append(" " + val + " |");
			}
			if(i+1<rows) sb.append(System.lineSeparator());
		}
		//sb.append(System.lineSeparator() + "[Prototype table][reference_table]");
		
		FileUtils.writeStringToFile(new File(Config.WHERE_THE_RESULTS_AT + "results.md"), sb.toString());
		
		PegDownProcessor pdp = new PegDownProcessor(Extensions.ALL);
		String htmlResult = pdp.markdownToHtml(sb.toString());
		FileUtils.writeStringToFile(new File(Config.WHERE_THE_RESULTS_AT + "results.html"), htmlResult);
	}

}
