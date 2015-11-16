package report;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;

import main.BenchmarkObject;
import util.QueryScenario;
import util.TestSeries;

public class BenchmarkObjectReportModel {

	public String Name, Version, Testserie;
	public List<BenchmarkObjectReportModelRow> initialize, readOnly, notReadOnly;
	private boolean targetCsv;
	private double second;
	private double third;

	public BenchmarkObjectReportModel(BenchmarkObject benchmarkObject, TestSeries testSerie, boolean targetCsv) {
		initialize = new ArrayList<BenchmarkObjectReportModelRow>();
		readOnly = new ArrayList<BenchmarkObjectReportModelRow>();
		notReadOnly = new ArrayList<BenchmarkObjectReportModelRow>();
		Testserie = testSerie.toString();
		this.targetCsv = targetCsv;
		BuildModel(benchmarkObject);
	}

	private void BuildModel(BenchmarkObject benchmarkObject) {
		Name = benchmarkObject.getTitle();
		Version = benchmarkObject.getVersion();

		initialize.add(new BenchmarkObjectReportModelRow("Set up", null, benchmarkObject.getSetUpTime(), null, null, null, null, null, 0, targetCsv));
		initialize.add(new BenchmarkObjectReportModelRow("Load", null, benchmarkObject.getLoadTime(), null, null, null, null, null, 1, targetCsv));

		int sort = 2;
		for (QueryScenario queryScenario : QueryScenario.values()) {
			double firstOrOne;

			// Prepare
			try {
				firstOrOne = benchmarkObject.getPrepareQueryScenarioResults().get(queryScenario);
			} catch (NullPointerException e) {
				firstOrOne = -1;
			}
			if (queryScenario.isReadOnly)
				readOnly.add(new BenchmarkObjectReportModelRow(queryScenario.toString(), "Prepare", firstOrOne, null, null, null, null, null, sort, targetCsv));
			else
				notReadOnly
						.add(new BenchmarkObjectReportModelRow(queryScenario.toString(), "Prepare", firstOrOne, null, null, null, null, null, sort, targetCsv));
			sort++;

			// Query
			double max, min, avg;
			max = GetMax(queryScenario, benchmarkObject.getQueryQueryScenarioResults());
			min = GetMin(queryScenario, benchmarkObject.getQueryQueryScenarioResults());
			avg = GetAvg(queryScenario, benchmarkObject.getQueryQueryScenarioResults());
			firstOrOne = GetFirstOrOne(queryScenario, benchmarkObject.getQueryQueryScenarioResults());
			if (queryScenario.isReadOnly) {
				second = getNth(queryScenario, benchmarkObject.getQueryQueryScenarioResults(), 2);
				third = getNth(queryScenario, benchmarkObject.getQueryQueryScenarioResults(), 3);

				readOnly.add(new BenchmarkObjectReportModelRow(queryScenario.toString(), "Query", firstOrOne, second, third, avg, min, max, sort, targetCsv));
			} else
				notReadOnly
						.add(new BenchmarkObjectReportModelRow(queryScenario.toString(), "Query", firstOrOne, second, third, avg, min, max, sort, targetCsv));
			sort++;
		}
	}

	private double GetFirstOrOne(QueryScenario queryScenario, Hashtable<Integer, Hashtable<QueryScenario, Double>> scenarioResults) {
		try {
			return scenarioResults.get(1).get(queryScenario);
		} catch (NullPointerException e) {
			return -1;
		}
	}

	private double GetMax(QueryScenario queryScenario, Hashtable<Integer, Hashtable<QueryScenario, Double>> scenarioResults) {
		try {
			double val = scenarioResults.get(1).get(queryScenario);
			Enumeration<Hashtable<QueryScenario, Double>> e = scenarioResults.elements();
			if (e.hasMoreElements())
				e.nextElement(); // Skip 1
			while (e.hasMoreElements()) {
				Hashtable<QueryScenario, Double> cur = e.nextElement();
				if (!cur.containsKey(queryScenario))
					continue;
				if (cur.get(queryScenario) > val)
					val = cur.get(queryScenario);
			}
			return val;
		} catch (NullPointerException e) {
			return -1;
		}
	}

	private double GetMin(QueryScenario queryScenario, Hashtable<Integer, Hashtable<QueryScenario, Double>> scenarioResults) {
		try {
			double val = scenarioResults.get(1).get(queryScenario);
			Enumeration<Hashtable<QueryScenario, Double>> e = scenarioResults.elements();
			if (e.hasMoreElements())
				e.nextElement(); // Skip 1
			while (e.hasMoreElements()) {
				Hashtable<QueryScenario, Double> cur = e.nextElement();
				if (!cur.containsKey(queryScenario))
					continue;
				if (cur.get(queryScenario) < val)
					val = cur.get(queryScenario);
			}
			return val;
		} catch (NullPointerException e) {
			return -1;
		}
	}

	private double GetAvg(QueryScenario queryScenario, Hashtable<Integer, Hashtable<QueryScenario, Double>> scenarioResults) {
		// Double sum = 0.0;
		// Double count = 0.0;
		// for (int i = 1; i <= scenarioResults.size(); i++) {
		// if (scenarioResults.get(i) != null)
		// if (scenarioResults.get(i).get(scenarioResults) != null) {
		// count++;
		// sum += scenarioResults.get(i).get(scenarioResults);
		// }
		// }
		// System.out.println(sum);
		// return (sum / count);
		double val = 0;
		int teiler = 0;
		Enumeration<Hashtable<QueryScenario, Double>> e = scenarioResults.elements();
		while (e.hasMoreElements()) {
			Hashtable<QueryScenario, Double> cur = e.nextElement();
			if (!cur.containsKey(queryScenario))
				continue;
			teiler++;
			val += cur.get(queryScenario);
		}
		if (teiler == 0)
			return -1;
		return val / teiler;
	}

	private Double getNth(QueryScenario queryScenario, Hashtable<Integer, Hashtable<QueryScenario, Double>> scenarioResults, int n) {
		if (scenarioResults.size() < n)
			return -1.0;

		Hashtable<QueryScenario, Double> nthExecution = scenarioResults.get(n);
		if (nthExecution == null)
			return -1.0;

		Double d = nthExecution.get(queryScenario);

		if (d == null)
			return -1.0;

		return d;

	}
}
