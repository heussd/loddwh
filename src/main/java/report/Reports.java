package report;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import util.Dataset;
import util.TestSeries;
import util.dumper.Helpers;
import main.BenchmarkObject;
import freemarker.core.ParseException;
import freemarker.template.Configuration;
import freemarker.template.MalformedTemplateNameException;
import freemarker.template.SimpleCollection;
import freemarker.template.SimpleSequence;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;
import freemarker.template.TemplateNotFoundException;

public class Reports {

	Configuration cfg;
	
	public Reports() throws Exception{
		cfg = new Configuration(Configuration.VERSION_2_3_22);
		cfg.setDirectoryForTemplateLoading(new File(Reports.class.getResource("/reports/").getFile()));
		cfg.setDefaultEncoding("UTF-8");
		cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);				
	}
	
	
	public String MakeBenchmarkObjectReport(BenchmarkObject benchmarkObject, TestSeries testSerie, String tocIndex) throws Exception{
		
		BenchmarkObjectReportModel viewModel = new BenchmarkObjectReportModel(benchmarkObject, testSerie);
		
		Map<String, Object> root = new HashMap<>();
		root.put("name", viewModel.Name);
		root.put("linkname", Helpers.GetLinkConformString(viewModel.Name));
		root.put("version", viewModel.Version);
		root.put("testserie", viewModel.Testserie);
		root.put("tocindex", tocIndex);
		root.put("initialize", new SimpleCollection(viewModel.initialize));
		root.put("readOnly", new SimpleCollection(viewModel.readOnly));
		root.put("notReadOnly", new SimpleCollection(viewModel.notReadOnly));
		
		Template tmp = cfg.getTemplate("BenchmarkObject.ftl");
		StringWriter stringWriter = new StringWriter();
		tmp.process(root, stringWriter);
		
		return stringWriter.toString();
	}
	
	public String MakeTestSeriesReport(TestSeries testSerie) throws Exception {
		Map<String, Object> root = new HashMap<>();
		root.put("name", testSerie.toString());
		
		ArrayList<TestSeriesInformationReportModelRow> datasets = new ArrayList<>();
		for (Dataset dataset : testSerie.datasets) {
			String size;
			
			try {
				size = Helpers.DoubleToString4Digits((double)dataset.file.length() / 1024 / 1024) + " MB";
			} catch (Exception e) {
				size = "ERROR";
			}
			
			datasets.add(new TestSeriesInformationReportModelRow(dataset, size));
		}
		
		root.put("datasets", new SimpleCollection(datasets));
		
		Template tmp = cfg.getTemplate("TestSeriesInformation.ftl");
		StringWriter stringWriter = new StringWriter();
		tmp.process(root, stringWriter);
		
		return stringWriter.toString();
	}
	
	public String MakeBenchmarkReport(List<BenchmarkObject> benchmarkObjects, TestSeries testSerie) throws Exception{
		List<BenchmarkObjectReportModel> dataModels = new ArrayList<BenchmarkObjectReportModel>();
		for (BenchmarkObject benchmarkObject : benchmarkObjects) {
			dataModels.add(new BenchmarkObjectReportModel(benchmarkObject, testSerie));
		}
		
		SumUpReportModel viewModel = new SumUpReportModel(dataModels, testSerie);
		
		Map<String, Object> root = new HashMap<>();
		root.put("testserie", viewModel.Testserie);
		root.put("databases", new SimpleCollection(viewModel.databases));
		root.put("entrys", new SimpleCollection(viewModel.entrys));
		
		Template tmp = cfg.getTemplate("SumUp.ftl");
		StringWriter stringWriter = new StringWriter();
		tmp.process(root, stringWriter);
		
		return stringWriter.toString();
	}
	
	public String MakeTableOfContents(ArrayList<DatabaseReportObject> databases) throws Exception {
		Map<String, Object> root = new HashMap<>();
		root.put("databases", new SimpleCollection(databases));
		
		Template tmp = cfg.getTemplate("TableOfContents.ftl");
		StringWriter stringWriter = new StringWriter();
		tmp.process(root, stringWriter);
		
		return stringWriter.toString();
	}
	
	public String MakeVerifyResultsReport(List<BenchmarkObject> benchmarkObjects) throws Exception{
		VerifyResultsReportModel viewModel = new VerifyResultsReportModel(benchmarkObjects);
		
		Map<String, Object> root = new HashMap<>();
		root.put("databases", new SimpleCollection(viewModel.databases));
		root.put("entrys", new SimpleCollection(viewModel.entrys));
		
		Template tmp = cfg.getTemplate("VerifyResults.ftl");
		StringWriter stringWriter = new StringWriter();
		tmp.process(root, stringWriter);
		
		return stringWriter.toString();
	}
}
