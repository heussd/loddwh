package main;

import java.io.Serializable;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;

import database.Database;
import util.QueryResult;
import util.QueryScenario;

public class BenchmarkObject implements Serializable {

	private static final long serialVersionUID = 4448652654178302742L;

	private Hashtable<QueryScenario, Double> prepareQueryScenarioResults;
	private Hashtable<Integer, Hashtable<QueryScenario, Double>> queryQueryScenarioResults;
	private double setUpTime, loadTime;

	private Hashtable<QueryScenario, Integer> queryResults;

	private String name;

	private String version;

	public BenchmarkObject(Database database) {
		super();

		this.name = database.getName();
		this.version = database.getVersion();

		prepareQueryScenarioResults = new Hashtable<QueryScenario, Double>();
		queryQueryScenarioResults = new Hashtable<Integer, Hashtable<QueryScenario, Double>>();

		queryResults = new Hashtable<QueryScenario, Integer>();
	}

	public double getSetUpTime() {
		return setUpTime;
	}

	public void setSetUpTime(double setUpTime) {
		this.setUpTime = setUpTime;
	}

	public double getLoadTime() {
		return loadTime;
	}

	public void setLoadTime(double loadTime) {
		this.loadTime = loadTime;
	}

	public String getVersion() {
		return this.version;
	}

	public String getTitle() {
		return this.name;
	}

	// public Database getDatabase() {
	// return database;
	// }

	public Integer getQueryResults(QueryScenario queryScenario) {
		return queryResults.get(queryScenario);
	}

	public Hashtable<QueryScenario, Double> getPrepareQueryScenarioResults() {
		return prepareQueryScenarioResults;
	}

	public Hashtable<Integer, Hashtable<QueryScenario, Double>> getQueryQueryScenarioResults() {
		return queryQueryScenarioResults;
	}

	@Override
	public String toString() {
		return "BenchmarkObject [database=" + name + ", prepareQueryScenarioResults=" + prepareQueryScenarioResults + ", queryQueryScenarioResults="
				+ queryQueryScenarioResults + ", setUpTime=" + setUpTime + ", loadTime=" + loadTime + ", queryResults=" + "Way to much for print" + "]";
	}

	public void InvalidateQueryScenarioResults(QueryScenario queryScenario) {
		prepareQueryScenarioResults.put(queryScenario, (double) -1);
		InvalidateQueryScenarioResultsForAllExecutions(queryScenario, queryQueryScenarioResults);
		queryResults.remove(queryScenario);
	}

	private void InvalidateQueryScenarioResultsForAllExecutions(QueryScenario queryScenario,
			Hashtable<Integer, Hashtable<QueryScenario, Double>> executionsResults) {
		Iterator<Entry<Integer, Hashtable<QueryScenario, Double>>> iterator = executionsResults.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Integer, Hashtable<QueryScenario, Double>> entry = iterator.next();
			entry.getValue().put(queryScenario, (double) -1);
		}
	}

	public void InvalidateBenchmarkResults() {
		setUpTime = -1;
		loadTime = -1;

		for (QueryScenario queryScenario : QueryScenario.values()) {
			InvalidateQueryScenarioResults(queryScenario);
		}
	}

	public void putQueryResult(QueryScenario queryScenario, Integer result) {
		this.queryResults.put(queryScenario, result);
	}
}
