package main;

import java.util.Hashtable;

import util.Dataset;
import util.QueryScenario;
import database.Database;

public class BenchmarkObject {
	
	private String title;
	private Database database;
	
	private Dataset loadDataset;
	
	private Hashtable<QueryScenario, Long> prepareQueryScenarioResults, queryQueryScenarioResults, clearQueryScenarioResults;
	private long setUpTime, loadTime;
	
	public BenchmarkObject(String title, Database database, Dataset loadDataset) {
		super();
		this.title = title;
		this.database = database;
		this.loadDataset = loadDataset;
		
		prepareQueryScenarioResults = new Hashtable<QueryScenario, Long>();
		queryQueryScenarioResults = new Hashtable<QueryScenario, Long>();
		clearQueryScenarioResults = new Hashtable<QueryScenario, Long>();
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

	public Hashtable<QueryScenario, Long> getPrepareQueryScenarioResults() {
		return prepareQueryScenarioResults;
	}

	public Hashtable<QueryScenario, Long> getQueryQueryScenarioResults() {
		return queryQueryScenarioResults;
	}

	public Hashtable<QueryScenario, Long> getClearQueryScenarioResults() {
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
		prepareQueryScenarioResults.put(queryScenario, (long)-1);
		queryQueryScenarioResults.put(queryScenario, (long)-1);
		clearQueryScenarioResults.put(queryScenario, (long)-1);
	}
	
	public void InvalidateBenchmarkResults(){
		setUpTime = -1;
		loadTime = -1;
		
		for (QueryScenario queryScenario : QueryScenario.values()) {
			InvalidateQueryScenarioResults(queryScenario);
		}
	}
}
