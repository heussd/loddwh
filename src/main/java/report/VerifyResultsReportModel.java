package report;

import java.util.ArrayList;
import java.util.List;

import util.QueryScenario;
import main.BenchmarkObject;

public class VerifyResultsReportModel {

	public List<String> databases;
	public List<VerifyResultsReportModelRow> entrys;
	
	public VerifyResultsReportModel(List<BenchmarkObject> dataModels){
		databases = new ArrayList<String>();
		entrys = new ArrayList<VerifyResultsReportModelRow>();
		BuildReport(dataModels);
	}
	
	private void BuildReport(List<BenchmarkObject> dataModels){
		for (BenchmarkObject benchmarkObject : dataModels) {
			databases.add(benchmarkObject.getTitle());
		}
		
		for (QueryScenario queryScenario : QueryScenario.values()) {
			List<Integer> hashCodes = new ArrayList<Integer>();
			for (String db : databases) {
				BenchmarkObject bmo = findFirstByName(dataModels, db);
				
				if(bmo.getQueryResults().containsKey(queryScenario) && bmo.getQueryResults().get(queryScenario) != null)
					hashCodes.add(bmo.getQueryResults().get(queryScenario).hashCode());
				else
					hashCodes.add(null);
			}
			
			entrys.add(new VerifyResultsReportModelRow(queryScenario.toString(), hashCodes));
		}
	}
	
	private BenchmarkObject findFirstByName(List<BenchmarkObject> benchmarkObjects, String name){
		for (BenchmarkObject benchmarkObject : benchmarkObjects) {
			if(benchmarkObject.getTitle().equals(name))
				return benchmarkObject;
		}
		return null;
	}
}
