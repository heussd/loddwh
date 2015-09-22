package report;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;

import util.QueryScenario;
import main.BenchmarkObject;

public class BenchmarkObjectReportModel {

	public String Name;
	public List<BenchmarkObjectReportModelRow> initialize, readOnly, notReadOnly;
	
	public BenchmarkObjectReportModel(BenchmarkObject benchmarkObject){
		initialize = new ArrayList<BenchmarkObjectReportModelRow>();
		readOnly = new ArrayList<BenchmarkObjectReportModelRow>();
		notReadOnly = new ArrayList<BenchmarkObjectReportModelRow>();
		BuildModel(benchmarkObject);
	}
	
	private void BuildModel(BenchmarkObject benchmarkObject){
		Name = benchmarkObject.getTitle();
		
		initialize.add(new BenchmarkObjectReportModelRow("Set up", null, benchmarkObject.getSetUpTime(), null, null, null, 0));
		initialize.add(new BenchmarkObjectReportModelRow("Load", null, benchmarkObject.getLoadTime(), null, null, null, 1));
		
		int sort = 2;
		for (QueryScenario queryScenario : QueryScenario.values()) {
			long max,min,avg,firstOrOne;
			
			// Prepare
			max = GetMax(queryScenario, benchmarkObject.getPrepareQueryScenarioResults());
			min = GetMin(queryScenario, benchmarkObject.getPrepareQueryScenarioResults());
			avg = GetAvg(queryScenario, benchmarkObject.getPrepareQueryScenarioResults());
			firstOrOne = GetFirstOrOne(queryScenario, benchmarkObject.getPrepareQueryScenarioResults());
			if(queryScenario.isReadOnly)
				readOnly.add(new BenchmarkObjectReportModelRow(queryScenario.toString(), "Prepare", firstOrOne, avg, min, max, sort));
			else
				notReadOnly.add(new BenchmarkObjectReportModelRow(queryScenario.toString(), "Prepare", firstOrOne, avg, min, max, sort));
			sort++;
			
			// Query
			max = GetMax(queryScenario, benchmarkObject.getQueryQueryScenarioResults());
			min = GetMin(queryScenario, benchmarkObject.getQueryQueryScenarioResults());
			avg = GetAvg(queryScenario, benchmarkObject.getQueryQueryScenarioResults());
			firstOrOne = GetFirstOrOne(queryScenario, benchmarkObject.getQueryQueryScenarioResults());
			if(queryScenario.isReadOnly)
				readOnly.add(new BenchmarkObjectReportModelRow(queryScenario.toString(), "Query", firstOrOne, avg, min, max, sort));
			else
				notReadOnly.add(new BenchmarkObjectReportModelRow(queryScenario.toString(), "Query", firstOrOne, avg, min, max, sort));
			sort++;
		}
	}
	
	private long GetFirstOrOne(QueryScenario queryScenario,	Hashtable<Integer, Hashtable<QueryScenario, Long>> scenarioResults) {
		return scenarioResults.get(1).get(queryScenario);
	}

	private long GetMax(QueryScenario queryScenario, Hashtable<Integer, Hashtable<QueryScenario, Long>> scenarioResults){
		long val = scenarioResults.get(1).get(queryScenario);
		 Enumeration<Hashtable<QueryScenario, Long>> e = scenarioResults.elements();
		 if(e.hasMoreElements()) e.nextElement(); // Skip 1
		 while(e.hasMoreElements()){
			 Hashtable<QueryScenario, Long> cur = e.nextElement();
			 if(!cur.containsKey(queryScenario)) continue;
			 if(cur.get(queryScenario) > val)
				 val = cur.get(queryScenario);
		 }
		return val;
	}
	
	private long GetMin(QueryScenario queryScenario, Hashtable<Integer, Hashtable<QueryScenario, Long>> scenarioResults){
		long val = scenarioResults.get(1).get(queryScenario);
		 Enumeration<Hashtable<QueryScenario, Long>> e = scenarioResults.elements();
		 if(e.hasMoreElements()) e.nextElement(); // Skip 1
		 while(e.hasMoreElements()){
			 Hashtable<QueryScenario, Long> cur = e.nextElement();
			 if(!cur.containsKey(queryScenario)) continue;
			 if(cur.get(queryScenario) < val)
				 val = cur.get(queryScenario);
		 }
		return val;
	}
	
	private long GetAvg(QueryScenario queryScenario, Hashtable<Integer, Hashtable<QueryScenario, Long>> scenarioResults){
		long val = 0; 
		 Enumeration<Hashtable<QueryScenario, Long>> e = scenarioResults.elements();
		 while(e.hasMoreElements()){
			 Hashtable<QueryScenario, Long> cur = e.nextElement();
			 if(!cur.containsKey(queryScenario)) continue;
			 val += cur.get(queryScenario);
		 }		 
		return val / scenarioResults.size(); // TODO size() immer sicher in diesem Kontext?
	}
}


