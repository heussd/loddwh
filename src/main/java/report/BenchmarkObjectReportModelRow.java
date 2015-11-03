package report;

import util.Config;
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
	private boolean targetCsv;

	public BenchmarkObjectReportModelRow(String queryScenario, String phase, Double firstOrOne, Double avg, Double min, Double max, int sort,
			boolean targetCsv) {
		super();
		QueryScenario = queryScenario;
		Phase = phase;
		FirstOrOne = firstOrOne;
		Avg = avg;
		Min = min;
		Max = max;
		Sort = sort;
		this.targetCsv = targetCsv;
	}

	@Override
	public TemplateModel get(String key) throws TemplateModelException {

		switch (key) {
		case "queryscenario":
			return new SimpleScalar(QueryScenario);
		case "phase":
			return new SimpleScalar(Phase);
		case "firstorone":
			if (FirstOrOne == null || FirstOrOne == -1)
				return new SimpleScalar("Error");
			else
				return new SimpleScalar(
						Helpers.DoubleToStringNDecimals(FirstOrOne, 2, !targetCsv && FirstOrOne >= Config.BORDER_FOR_SCIENTIFIC_NOTATION_REPORT_RESULT)
								+ (targetCsv ? "" : " ms"));
		case "avg":
			if (Avg == null || Avg == -1)
				return new SimpleScalar("Error");
			else
				return new SimpleScalar(Helpers.DoubleToStringNDecimals(Avg, 2, !targetCsv && Avg >= Config.BORDER_FOR_SCIENTIFIC_NOTATION_REPORT_RESULT)
						+ (targetCsv ? "" : " ms"));
		case "min":
			if (Min == null || Min == -1)
				return new SimpleScalar("Error");
			else
				return new SimpleScalar(Helpers.DoubleToStringNDecimals(Min, 2, !targetCsv && Min >= Config.BORDER_FOR_SCIENTIFIC_NOTATION_REPORT_RESULT)
						+ (targetCsv ? "" : " ms"));
		case "max":
			if (Max == null || Max == -1)
				return new SimpleScalar("Error");
			else
				return new SimpleScalar(Helpers.DoubleToStringNDecimals(Max, 2, !targetCsv && Max >= Config.BORDER_FOR_SCIENTIFIC_NOTATION_REPORT_RESULT)
						+ (targetCsv ? "" : " ms"));
		}
		return new SimpleScalar("Error");
	}

	@Override
	public boolean isEmpty() throws TemplateModelException {
		return false;
	}

}
