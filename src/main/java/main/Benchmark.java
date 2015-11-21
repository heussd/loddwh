package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import database.ArangoDB;
import database.Database;
import database.Fuseki;
import database.MongoDB;
import database.PostgreSQL;
import database.SQLite4Java;
import database.SQLiteXerial;
import database.Virtuoso;
import util.Config;
import util.Dataset;
import util.QueryResult;
import util.QueryScenario;
import util.TestSeries;

public class Benchmark {

	public static void main(String[] args) throws Exception {

		List<TestSeries> testSeries = new ArrayList<>();
		testSeries.add(TestSeries.TINY);
		// testSeries.add(TestSeries.SMALL);
		// testSeries.add(TestSeries.MEDIUM);
		// testSeries.add(TestSeries.LARGE);

		List<Database> testDatabases = new ArrayList<>();
		testDatabases.add(new SQLite4Java());
		// testDatabases.add(new SQLiteXerial());
		// testDatabases.add(new PostgreSQL());
		// testDatabases.add(new ArangCoDB());
		// testDatabases.add(new MongoDB());
		// testDatabases.add(new Virtuoso());
		// testDatabases.add(new Fuseki());

		for (TestSeries testSerie : testSeries) {
			new File("results/serialisedBenchmarkObjects/" + testSerie + "/").mkdirs();

			List<BenchmarkObject> benchmarkObjects = new ArrayList<>();
			for (Database db : testDatabases) {
				// benchmarkObjects.add(new BenchmarkObject(database));
				// }

				// for (BenchmarkObject benchmarkObject : benchmarkObjects) {
				File bo = new File("results/serialisedBenchmarkObjects/" + testSerie + "/" + db.getName() + ".ser");
				BenchmarkObject benchmarkObject;
				if (bo.exists()) {
					FileInputStream fis = new FileInputStream(bo);
					ObjectInputStream ois = new ObjectInputStream(fis);
					benchmarkObject = (BenchmarkObject) ois.readObject();
					ois.close();
				} else {
					benchmarkObject = new BenchmarkObject(db);
				}

				benchmarkObjects.add(benchmarkObject);

				// Database db = benchmarkObject.getDatabase();
				// Database db = testDatabases.get(0);
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
							System.out.println(queryScenario);

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

								double executionTime = nanoExecutionTimeInMilliseconds(queryStart, queryEnd);
								setResultInResultset(execution, queryScenario, executionTime, benchmarkObject.getQueryQueryScenarioResults());

								if ((execution + 1) <= executions && executionTime >= Config.BORDER_FOR_QUERYEXECUTION_TIME_IN_MS) {
									System.out.println(String.format(
											"Testserie %s, %s: QueryScenario %s took too long (over %sms) to finish at execution %s. Cancelling the remaining executions.",
											testSerie.toString(), db.getName(), queryScenario.toString(), Config.BORDER_FOR_QUERYEXECUTION_TIME_IN_MS,
											execution));
									break;
								}
							}

							benchmarkObject.putQueryResult(queryScenario, result.hashCode());
							benchmarkObject.getPrepareQueryScenarioResults().put(queryScenario, nanoExecutionTimeInMilliseconds(prepareStart, prepareEnd));

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

				FileOutputStream fos = new FileOutputStream("results/serialisedBenchmarkObjects/" + testSerie + "/" + benchmarkObject.getTitle() + ".ser");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(benchmarkObject);
				oos.close();
			}
			Report.makeReports(testSerie, benchmarkObjects);
		}
	}

	private static void setResultInResultset(int execution, QueryScenario queryScenario, double result,
			Hashtable<Integer, Hashtable<QueryScenario, Double>> resultSet) {
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
		double result = (double) (end - start) / (double) 1000000;
		return result;
	}

}
