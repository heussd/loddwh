package report;

import java.util.ArrayList;
import java.util.List;

import util.QueryScenario;
import util.TestSeries;

public class SumUpReportModel {

	public List<DatabaseReportObject> databases;
	public List<SumUpReportModelRow> entrys;
	public String Testserie;
	private boolean targetCsv;
	
	public SumUpReportModel(List<BenchmarkObjectReportModel> dataModels, TestSeries testSerie, boolean targetCsv){
		databases = new ArrayList<>();
		entrys = new ArrayList<SumUpReportModelRow>();
		Testserie = testSerie.toString();
		this.targetCsv = targetCsv;
		BuildReport(dataModels);
	}
	
	private void BuildReport(List<BenchmarkObjectReportModel> benchmarkObjectReportModels){
		for (BenchmarkObjectReportModel benchmarkObjectReportModel : benchmarkObjectReportModels) {
			databases.add(new DatabaseReportObject(benchmarkObjectReportModel.Name));
		}
		
		// Setup
		List<Double> setUpVals = new ArrayList<Double>();
		//databases.forEach(db -> benchmarkObjectReportModels.stream().filter(bmo -> bmo.Name.equals(db)).findFirst().get().initialize.stream().);
		for (DatabaseReportObject db : databases) {
			BenchmarkObjectReportModel report = findFirstByName(benchmarkObjectReportModels, db.getName());
			setUpVals.add(report.initialize.stream().filter(s -> s.QueryScenario.equals("Set up")).findFirst().get().FirstOrOne);
		}
		entrys.add(new SumUpReportModelRow("Set up", null, setUpVals, 0, targetCsv));
		
		// Load
		List<Double> loadVals = new ArrayList<Double>();
		for (DatabaseReportObject db : databases) {
			BenchmarkObjectReportModel report = findFirstByName(benchmarkObjectReportModels, db.getName());
			loadVals.add(report.initialize.stream().filter(s -> s.QueryScenario.equals("Load")).findFirst().get().FirstOrOne);
		}
		entrys.add(new SumUpReportModelRow("Load", null, loadVals, 1, targetCsv));
		
		// QueryScenarios
		int sort = 2;
		for (QueryScenario queryScenario : QueryScenario.values()) {			
			// Prepare
			List<Double> prepVals = new ArrayList<Double>();
			for (DatabaseReportObject db : databases) {
				BenchmarkObjectReportModel report = findFirstByName(benchmarkObjectReportModels, db.getName());
				List<BenchmarkObjectReportModelRow> target = queryScenario.isReadOnly ? report.readOnly : report.notReadOnly;
				if(target.stream().noneMatch(s -> s.QueryScenario.equals(queryScenario.toString()) && s.Phase.equals("Prepare"))){
					prepVals.add(null);
					continue;
				}
				prepVals.add(target.stream().filter(s -> s.QueryScenario.equals(queryScenario.toString()) && s.Phase.equals("Prepare")).findFirst().get().FirstOrOne);
			}
			entrys.add(new SumUpReportModelRow(queryScenario.toString(), "Prepare", prepVals, sort, targetCsv));
			sort++;
			
			// Query
			List<Double> queryVals = new ArrayList<Double>();
			for (DatabaseReportObject db : databases) {
				BenchmarkObjectReportModel report = findFirstByName(benchmarkObjectReportModels, db.getName());
				List<BenchmarkObjectReportModelRow> target = queryScenario.isReadOnly ? report.readOnly : report.notReadOnly;
				if(target.stream().noneMatch(s -> s.QueryScenario.equals(queryScenario.toString()) && s.Phase.equals("Query"))){
					queryVals.add(null);
					continue;
				}
				if(queryScenario.isReadOnly)
					queryVals.add(target.stream().filter(s -> s.QueryScenario.equals(queryScenario.toString()) && s.Phase.equals("Query")).findFirst().get().Avg);
				else
					queryVals.add(target.stream().filter(s -> s.QueryScenario.equals(queryScenario.toString()) && s.Phase.equals("Query")).findFirst().get().FirstOrOne);
			}
			entrys.add(new SumUpReportModelRow(queryScenario.toString(), "Query", queryVals, sort, targetCsv));
			sort++;
		}
	}
	
	private BenchmarkObjectReportModel findFirstByName(List<BenchmarkObjectReportModel> benchmarkObjectReportModels, String name){
		for (BenchmarkObjectReportModel benchmarkObjectReportModel : benchmarkObjectReportModels) {
			if(benchmarkObjectReportModel.Name.equals(name))
				return benchmarkObjectReportModel;
		}
		return null;
	}
}
