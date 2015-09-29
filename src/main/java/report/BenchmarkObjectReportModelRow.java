package report;

import util.dumper.Helpers;
import freemarker.template.SimpleNumber;
import freemarker.template.SimpleScalar;
import freemarker.template.TemplateHashModel;
import freemarker.template.TemplateModel;
import freemarker.template.TemplateModelException;

public class BenchmarkObjectReportModelRow implements TemplateHashModel {

	public String QueryScenario, Phase;
	public Double FirstOrOne, Avg, Min, Max;
	public int Sort;
	
	public BenchmarkObjectReportModelRow(String queryScenario, String phase,
			Double firstOrOne, Double avg, Double min, Double max, int sort) {
		super();
		QueryScenario = queryScenario;
		Phase = phase;
		FirstOrOne = firstOrOne;
		Avg = avg;
		Min = min;
		Max = max;
		Sort = sort;
	}

	@Override
	public TemplateModel get(String key) throws TemplateModelException {
				
		switch (key) {
		case "queryscenario":
			return new SimpleScalar(QueryScenario);
		case "phase":
			return new SimpleScalar(Phase);
		case "firstorone":
			if(FirstOrOne == null || FirstOrOne == -1) return new SimpleScalar("Error"); else return new SimpleScalar(Helpers.DoubleToString3Digits(FirstOrOne) + " ms");// return new SimpleNumber(FirstOrOne);
		case "avg":
			if(Avg == null || Avg == -1) return new SimpleScalar("Error"); else return new SimpleScalar(Helpers.DoubleToString3Digits(Avg) + " ms");// return new SimpleNumber(Avg);
		case "min":
			if(Min == null || Min == -1) return new SimpleScalar("Error"); else return new SimpleScalar(Helpers.DoubleToString3Digits(Min) + " ms");// return new SimpleNumber(Min);
		case "max":
			if(Max == null || Max == -1) return new SimpleScalar("Error"); else return new SimpleScalar(Helpers.DoubleToString3Digits(Max) + " ms");// return new SimpleNumber(Max);
		}
		return new SimpleScalar("Error");
	}

	@Override
	public boolean isEmpty() throws TemplateModelException {
		return false;
	}
	
	
}
