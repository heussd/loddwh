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
			double max,min,avg,firstOrOne;
			
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
	
	private double GetFirstOrOne(QueryScenario queryScenario,	Hashtable<Integer, Hashtable<QueryScenario, Double>> scenarioResults) {
		return scenarioResults.get(1).get(queryScenario);
	}

	private double GetMax(QueryScenario queryScenario, Hashtable<Integer, Hashtable<QueryScenario, Double>> scenarioResults){
		double val = scenarioResults.get(1).get(queryScenario);
		 Enumeration<Hashtable<QueryScenario, Double>> e = scenarioResults.elements();
		 if(e.hasMoreElements()) e.nextElement(); // Skip 1
		 while(e.hasMoreElements()){
			 Hashtable<QueryScenario, Double> cur = e.nextElement();
			 if(!cur.containsKey(queryScenario)) continue;
			 if(cur.get(queryScenario) > val)
				 val = cur.get(queryScenario);
		 }
		return val;
	}
	
	private double GetMin(QueryScenario queryScenario, Hashtable<Integer, Hashtable<QueryScenario, Double>> scenarioResults){
		double val = scenarioResults.get(1).get(queryScenario);
		 Enumeration<Hashtable<QueryScenario, Double>> e = scenarioResults.elements();
		 if(e.hasMoreElements()) e.nextElement(); // Skip 1
		 while(e.hasMoreElements()){
			 Hashtable<QueryScenario, Double> cur = e.nextElement();
			 if(!cur.containsKey(queryScenario)) continue;
			 if(cur.get(queryScenario) < val)
				 val = cur.get(queryScenario);
		 }
		return val;
	}
	
	private double GetAvg(QueryScenario queryScenario, Hashtable<Integer, Hashtable<QueryScenario, Double>> scenarioResults){
		double val = 0;
		int teiler = 0;
		 Enumeration<Hashtable<QueryScenario, Double>> e = scenarioResults.elements();
		 while(e.hasMoreElements()){
			 Hashtable<QueryScenario, Double> cur = e.nextElement();
			 if(!cur.containsKey(queryScenario)) continue;
			 teiler++;
			 val += cur.get(queryScenario);
		 }
		if(teiler == 0) return -1; // TODO Praxis?
		return val / teiler;
	}
}


