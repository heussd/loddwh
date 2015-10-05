package main;

import java.io.File;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.pegdown.Extensions;
import org.pegdown.PegDownProcessor;

import database.Database;
import database.Fuseki;
import database.MongoDB;
import database.PostgreSQL;
import database.SQLite4Java;
import database.SQLiteXerial;
import database.Virtuoso;
import report.Reports;
import util.Config;
import util.Dataset;
import util.QueryResult;
import util.QueryScenario;

public class Benchmark {

	public static void main(String[] args) throws Exception {

		List<BenchmarkObject> benchmarkObjects = new ArrayList<BenchmarkObject>();

		// OBJECTS

		// SQLite (Xerial)
		benchmarkObjects.add(new BenchmarkObject(new SQLite4Java(), Dataset.hebis_1000_records));

		// SQLite (Xerial)
		benchmarkObjects.add(new BenchmarkObject(new SQLiteXerial(), Dataset.hebis_1000_records));

		// POSTGRESQL
		benchmarkObjects.add(new BenchmarkObject(new PostgreSQL(), Dataset.hebis_1000_records));

		// Fuseki
		benchmarkObjects.add(new BenchmarkObject(new Fuseki(), Dataset.hebis_1000_records));

		// VIRTUOSO
		benchmarkObjects.add(new BenchmarkObject(new Virtuoso(), Dataset.hebis_1000_records));
		// benchmarkObjects.add(new BenchmarkObject(new Virtuoso(),
		// Dataset.hebis_10000_records));
		
		// MongoDB
		benchmarkObjects.add(new BenchmarkObject(new MongoDB(), Dataset.hebis_1000_records));
		
		// OBJECTS

		for (BenchmarkObject benchmarkObject : benchmarkObjects) {
			Database db = benchmarkObject.getDatabase();
			long setUpStart, setUpEnd, loadStart, loadEnd;

			try {
				setUpStart = System.nanoTime();
				db.setUp();
				setUpEnd = System.nanoTime();

				loadStart = System.nanoTime();
				db.load(benchmarkObject.getLoadDataset());
				loadEnd = System.nanoTime();

				for (QueryScenario queryScenario : QueryScenario.values()) {
					try {
						long prepareStart, prepareEnd, clearStart, clearEnd;

						prepareStart = System.nanoTime();
						db.prepare(queryScenario);
						prepareEnd = System.nanoTime();

						int executions = queryScenario.isReadOnly ? Config.QUERYSCENARIO_EXECUTIONS : 1;
						QueryResult result = null;
						for (int execution = 1; execution <= executions; execution++) {
							long queryStart, queryEnd;
							queryStart = System.nanoTime();
							result = db.query(queryScenario);
							queryEnd = System.nanoTime();
							setResultInResultset(execution, queryScenario, nanoExecutionTimeInMilliseconds(queryStart, queryEnd), benchmarkObject.getQueryQueryScenarioResults());
						}
						
						clearStart = System.nanoTime();
						db.clear(queryScenario);
						clearEnd = System.nanoTime();
						
						
						benchmarkObject.getQueryResults().put(queryScenario, result);

						setResultInResultset(1, queryScenario, nanoExecutionTimeInMilliseconds(prepareStart, prepareEnd), benchmarkObject.getPrepareQueryScenarioResults());
						setResultInResultset(1, queryScenario, nanoExecutionTimeInMilliseconds(clearStart, clearEnd), benchmarkObject.getClearQueryScenarioResults());
					} catch (Exception e) {
						// Abort only current QueryScenario
						benchmarkObject.InvalidateQueryScenarioResults(queryScenario);
						
						System.err.println("Fehler bei " + benchmarkObject.getTitle() + ", " + queryScenario);
						e.printStackTrace(System.err);
						
						continue;
					}
				}

				benchmarkObject.setSetUpTime(nanoExecutionTimeInMilliseconds(setUpStart, setUpEnd));
				benchmarkObject.setLoadTime(nanoExecutionTimeInMilliseconds(loadStart, loadEnd));

			} catch (Exception e) {
				// Abort only current BenchmarkObject
				benchmarkObject.InvalidateBenchmarkResults();

				System.err.println("Fehler bei " + benchmarkObject.getTitle());
				e.printStackTrace(System.err);

				continue;
			}

			System.out.println("Done with " + benchmarkObject);
		}

		makeReports(benchmarkObjects);
	}

	private static void setResultInResultset(int execution, QueryScenario queryScenario, double result, Hashtable<Integer, Hashtable<QueryScenario, Double>> resultSet) {
		if (resultSet.containsKey(execution)) {
			Hashtable<QueryScenario, Double> r = resultSet.get(execution);
			r.put(queryScenario, result);
		} else {
			Hashtable<QueryScenario, Double> r = new Hashtable<QueryScenario, Double>();
			r.put(queryScenario, result);
			resultSet.put(execution, r);
		}
	}

	private static double nanoExecutionTimeInMilliseconds(long start, long end) {
		double result = (double)(end - start) / (double)1000000;
		return result;
	}

	private static void makeReports(List<BenchmarkObject> benchmarkObjects) throws Exception {
		Reports reports = new Reports();
		StringBuilder sb = new StringBuilder();
		
		sb.append("<style style=\"text/css\">tr:hover{background: #FFFF00;}</style>\n\n");

		for (BenchmarkObject benchmarkObject : benchmarkObjects) {
			sb.append(reports.MakeBenchmarkObjectReport(benchmarkObject));
		}

		sb.append(reports.MakeBenchmarkReport(benchmarkObjects));

		sb.append(reports.MakeVerifyResultsReport(benchmarkObjects));

		FileUtils.writeStringToFile(new File(Config.WHERE_THE_RESULTS_AT + "results.md"), sb.toString());

		PegDownProcessor pdp = new PegDownProcessor(Extensions.ALL);
		String htmlResult = pdp.markdownToHtml(sb.toString());
		FileUtils.writeStringToFile(new File(Config.WHERE_THE_RESULTS_AT + "results.html"), htmlResult);
	}

}
