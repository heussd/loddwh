package main;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import util.Dataset;
import util.QueryScenario;
import database.Database;

public class BenchmarkObject {
	
	private String title;
	private Database database;
	
	private Dataset loadDataset;
	
	private Hashtable<Integer, Hashtable<QueryScenario, Long>> prepareQueryScenarioResults, queryQueryScenarioResults, clearQueryScenarioResults;
	private long setUpTime, loadTime;
	
	public BenchmarkObject(Database database, Dataset loadDataset) {
		super();
		this.title = database.getName() + " " + loadDataset.datasetName;
		this.database = database;
		this.loadDataset = loadDataset;
		
		prepareQueryScenarioResults = new Hashtable<Integer, Hashtable<QueryScenario, Long>>();
		queryQueryScenarioResults = new Hashtable<Integer, Hashtable<QueryScenario, Long>>();
		clearQueryScenarioResults = new Hashtable<Integer, Hashtable<QueryScenario, Long>>();
	}

	public long getSetUpTime() {
		return setUpTime;
	}

	public void setSetUpTime(long setUpTime) {
		this.setUpTime = setUpTime;
	}

	public long getLoadTime() {
		return loadTime;
	}

	public void setLoadTime(long loadTime) {
		this.loadTime = loadTime;
	}

	public String getTitle() {
		return title;
	}

	public Database getDatabase() {
		return database;
	}

	public Dataset getLoadDataset() {
		return loadDataset;
	}

	public Hashtable<Integer, Hashtable<QueryScenario, Long>> getPrepareQueryScenarioResults() {
		return prepareQueryScenarioResults;
	}

	public Hashtable<Integer, Hashtable<QueryScenario, Long>> getQueryQueryScenarioResults() {
		return queryQueryScenarioResults;
	}

	public Hashtable<Integer, Hashtable<QueryScenario, Long>> getClearQueryScenarioResults() {
		return clearQueryScenarioResults;
	}
	
	@Override
	public String toString() {
		return "BenchmarkObject [title=" + title + ", database=" + database
				+ ", loadDataset=" + loadDataset + ", setUpTime=" + setUpTime
				+ ", loadTime=" + loadTime + ", prepareQueryScenarioResults="
				+ prepareQueryScenarioResults + ", queryQueryScenarioResults="
				+ queryQueryScenarioResults + ", clearQueryScenarioResults="
				+ clearQueryScenarioResults + "]";
	}

	public void InvalidateQueryScenarioResults(QueryScenario queryScenario){
		InvalidateQueryScenarioResultsForAllExecutions(queryScenario, prepareQueryScenarioResults);
		InvalidateQueryScenarioResultsForAllExecutions(queryScenario, queryQueryScenarioResults);
		InvalidateQueryScenarioResultsForAllExecutions(queryScenario, clearQueryScenarioResults);
	}
	private void InvalidateQueryScenarioResultsForAllExecutions(QueryScenario queryScenario, Hashtable<Integer, Hashtable<QueryScenario, Long>> executionsResults){
		Iterator<Entry<Integer, Hashtable<QueryScenario, Long>>> iterator = executionsResults.entrySet().iterator();
		while(iterator.hasNext()){
			Entry<Integer, Hashtable<QueryScenario, Long>> entry = iterator.next();
			entry.getValue().put(queryScenario, (long)-1);
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
