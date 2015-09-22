package report;

import freemarker.template.SimpleNumber;
import freemarker.template.SimpleScalar;
import freemarker.template.TemplateHashModel;
import freemarker.template.TemplateModel;
import freemarker.template.TemplateModelException;

public class BenchmarkObjectReportModelRow implements TemplateHashModel {

	public String QueryScenario, Phase;
	public Long FirstOrOne, Avg, Min, Max;
	public int Sort;
	
	public BenchmarkObjectReportModelRow(String queryScenario, String phase,
			Long firstOrOne, Long avg, Long min, Long max, int sort) {
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
			if(FirstOrOne == null) return new SimpleScalar(""); else return new SimpleNumber(FirstOrOne);
		case "avg":
			if(Avg == null) return new SimpleScalar(""); else return new SimpleNumber(Avg);
		case "min":
			if(Min == null) return new SimpleScalar(""); else return new SimpleNumber(Min);
		case "max":
			if(Max == null) return new SimpleScalar(""); else return new SimpleNumber(Max);
		}
		return new SimpleScalar("Error");
	}

	@Override
	public boolean isEmpty() throws TemplateModelException {
		return false;
	}
	
	
}
