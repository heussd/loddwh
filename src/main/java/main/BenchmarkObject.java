package main;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import util.Dataset;
import util.QueryResult;
import util.QueryScenario;
import database.Database;

public class BenchmarkObject {
	
	private Database database;
	
	private Hashtable<Integer, Hashtable<QueryScenario, Double>> prepareQueryScenarioResults, queryQueryScenarioResults, clearQueryScenarioResults;
	private double setUpTime, loadTime;
	
	private Hashtable<QueryScenario, QueryResult> queryResults;
	
	public BenchmarkObject(Database database) {
		super();
		
		this.database = database;
		
		prepareQueryScenarioResults = new Hashtable<Integer, Hashtable<QueryScenario, Double>>();
		queryQueryScenarioResults = new Hashtable<Integer, Hashtable<QueryScenario, Double>>();
		clearQueryScenarioResults = new Hashtable<Integer, Hashtable<QueryScenario, Double>>();
		
		queryResults = new Hashtable<QueryScenario, QueryResult>();
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

	public String getTitle() {
		return database.getName();
	}

	public Database getDatabase() {
		return database;
	}
	
	public Hashtable<QueryScenario, QueryResult> getQueryResults(){
		return queryResults;
	}

	public Hashtable<Integer, Hashtable<QueryScenario, Double>> getPrepareQueryScenarioResults() {
		return prepareQueryScenarioResults;
	}

	public Hashtable<Integer, Hashtable<QueryScenario, Double>> getQueryQueryScenarioResults() {
		return queryQueryScenarioResults;
	}

	public Hashtable<Integer, Hashtable<QueryScenario, Double>> getClearQueryScenarioResults() {
		return clearQueryScenarioResults;
	}

	@Override
	public String toString() {
		return "BenchmarkObject [database=" + database
				+ ", prepareQueryScenarioResults="
				+ prepareQueryScenarioResults + ", queryQueryScenarioResults="
				+ queryQueryScenarioResults + ", clearQueryScenarioResults="
				+ clearQueryScenarioResults + ", setUpTime=" + setUpTime
				+ ", loadTime=" + loadTime + ", queryResults=" + "Way to much for print"
				+ "]";
	}

	public void InvalidateQueryScenarioResults(QueryScenario queryScenario){
		InvalidateQueryScenarioResultsForAllExecutions(queryScenario, prepareQueryScenarioResults);
		InvalidateQueryScenarioResultsForAllExecutions(queryScenario, queryQueryScenarioResults);
		InvalidateQueryScenarioResultsForAllExecutions(queryScenario, clearQueryScenarioResults);
		queryResults.remove(queryScenario);
	}
	private void InvalidateQueryScenarioResultsForAllExecutions(QueryScenario queryScenario, Hashtable<Integer, Hashtable<QueryScenario, Double>> executionsResults){
		Iterator<Entry<Integer, Hashtable<QueryScenario, Double>>> iterator = executionsResults.entrySet().iterator();
		while(iterator.hasNext()){
			Entry<Integer, Hashtable<QueryScenario, Double>> entry = iterator.next();
			entry.getValue().put(queryScenario, (double)-1);
		}
	}

	public void InvalidateBenchmarkResults(){
		setUpTime = -1;
		loadTime = -1;
		
		for (QueryScenario queryScenario : QueryScenario.values()) {
			InvalidateQueryScenarioResults(queryScenario);
		}
	}
}
