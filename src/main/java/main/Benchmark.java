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
import util.TestSeries;

public class Benchmark {

	public static void main(String[] args) throws Exception {
		
		List<TestSeries> testSeries = new ArrayList<>();
		testSeries.add(TestSeries.TINY);
//		testSeries.add(TestSeries.SMALL);
//		testSeries.add(TestSeries.MEDIUM);
//		testSeries.add(TestSeries.LARGE);
		
		for (TestSeries testSerie : testSeries) {
			List<BenchmarkObject> benchmarkObjects = new ArrayList<BenchmarkObject>();
			
			// SQLite (Xerial)
			benchmarkObjects.add(new BenchmarkObject(new SQLite4Java()));
	
			// SQLite (Xerial)
			benchmarkObjects.add(new BenchmarkObject(new SQLiteXerial()));
	
			// POSTGRESQL
			//benchmarkObjects.add(new BenchmarkObject(new PostgreSQL()));
	
			// Fuseki
			//benchmarkObjects.add(new BenchmarkObject(new Fuseki()));
	
			// Virtuoso
			//benchmarkObjects.add(new BenchmarkObject(new Virtuoso()));
			
			// MongoDB
			benchmarkObjects.add(new BenchmarkObject(new MongoDB()));
			
	
			for (BenchmarkObject benchmarkObject : benchmarkObjects) {
				Database db = benchmarkObject.getDatabase();
				long setUpStart, setUpEnd, loadStart, loadEnd;
				
				try {
					db.start();
					db.clean();
					
					setUpStart = System.nanoTime();
					db.setUp();
					setUpEnd = System.nanoTime();
					
					loadStart = System.nanoTime();
					for (Dataset dataset : testSerie.datasets) {
						db.load(dataset);
					}
					loadEnd = System.nanoTime();					
					
					for (QueryScenario queryScenario : QueryScenario.values()) {
						try {
							long prepareStart, prepareEnd;
	
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
							
							benchmarkObject.getQueryResults().put(queryScenario, result);
	
							setResultInResultset(1, queryScenario, nanoExecutionTimeInMilliseconds(prepareStart, prepareEnd), benchmarkObject.getPrepareQueryScenarioResults());
							
						} catch (Exception e) {
							// Abort only current QueryScenario
							benchmarkObject.InvalidateQueryScenarioResults(queryScenario);
							
							System.err.println("Fehler bei " + benchmarkObject.getTitle() + ", " + queryScenario);
							e.printStackTrace(System.err);
							
							continue;
						}
					}
					
					db.stop();
					
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
	
			makeReports(testSerie, benchmarkObjects);
		}
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

	private static void makeReports(TestSeries testSerie, List<BenchmarkObject> benchmarkObjects) throws Exception {
		Reports reports = new Reports();
		StringBuilder sb = new StringBuilder();
		
		sb.append("<style style=\"text/css\">tr:hover{background: #FFFF00;}</style>\n\n");
		sb.append(String.format("# Report for Testserie \"%s\"\n\n", testSerie.toString()));

		sb.append(reports.MakeBenchmarkReport(benchmarkObjects));
		
		for (BenchmarkObject benchmarkObject : benchmarkObjects) {
			sb.append(reports.MakeBenchmarkObjectReport(benchmarkObject));
		}

		sb.append(reports.MakeVerifyResultsReport(benchmarkObjects));

		String filename = String.format("Results-Testserie_%s", testSerie.toString());
		FileUtils.writeStringToFile(new File(Config.WHERE_THE_RESULTS_AT + filename + ".md"), sb.toString());

		PegDownProcessor pdp = new PegDownProcessor(Extensions.ALL);
		String htmlResult = pdp.markdownToHtml(sb.toString());
		FileUtils.writeStringToFile(new File(Config.WHERE_THE_RESULTS_AT + filename + ".html"), htmlResult);
		
		System.out.println("Wrote Report for Testserie " + testSerie.toString());
	}

}
