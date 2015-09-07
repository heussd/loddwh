package main;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import database.*;
import util.*;

public class Benchmark {

	public static void main(String[] args) {

		List<BenchmarkObject> benchmarkObjects = new ArrayList<BenchmarkObject>();

		// OBJECTS
		// benchmarkObjects.add(new BenchmarkObject("Dummy Object", new
		// DummyDatabase(), null));

		// POSTGRESQL
		// benchmarkObjects.add(new BenchmarkObject("PostgreSQL Medium", new
		// PostgreSQL(), Dataset.hebis_small_rdf));

		// SQLite (Xerial)
		benchmarkObjects.add(new BenchmarkObject("sqlite4java Medium", new SQLite4Java(), Dataset.hebis_small_rdf));

		// SQLite (Xerial)
		benchmarkObjects.add(new BenchmarkObject("SQLite Xerial Medium", new SQLiteXerial(), Dataset.hebis_small_rdf));

		// VIRTUOSO
		benchmarkObjects.add(new BenchmarkObject("Virtuoso 1.000", new Virtuoso("hebis_1000_test", Dataset.hebis_tiny_rdf, "C:\\RDSTUDIES\\db\\virtuoso-opensource", ".."), null));
		benchmarkObjects.add(new BenchmarkObject("Virtuoso 10.000", new Virtuoso("hebis_10000_test", Dataset.hebis_small_rdf, "C:\\RDSTUDIES\\db\\virtuoso-opensource", ".."), null));
		//benchmarkObjects.add(new BenchmarkObject("Virtuoso 100.000", new Virtuoso("hebis_100000_test", Dataset.hebis_medium_rdf, "C:\\RDSTUDIES\\db\\virtuoso-opensource", ".."), null));
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

	}

}
