package report;

import java.util.ArrayList;
import java.util.List;

import util.Config;
import util.dumper.Helpers;
import freemarker.template.SimpleCollection;
import freemarker.template.SimpleScalar;
import freemarker.template.TemplateHashModel;
import freemarker.template.TemplateModel;
import freemarker.template.TemplateModelException;

public class SumUpReportModelRow implements TemplateHashModel {

	private String QueryScenario, Phase;
	private List<Double> AvgValues;
	private int Sort;
	private boolean targetCsv;

	public SumUpReportModelRow(String queryScenario, String phase,
			List<Double> avgValues, int sort, boolean targetCsv) {
		super();
		QueryScenario = queryScenario;
		Phase = phase;
		AvgValues = avgValues;
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
		case "avgvalues":
			List<String> ret = new ArrayList<String>();
			for (Double l : AvgValues) {
				if(l == null || l == -1) ret.add("Error"); else ret.add(Helpers.DoubleToStringNDecimals(l, 2, !targetCsv && l >= Config.BORDER_FOR_SCIENTIFIC_NOTATION_REPORT_RESULT) + " ms");
			}
			return new SimpleCollection(ret);
		case "lowest":
			Double lowest = GetLowestAvgValue();
			return new SimpleScalar(lowest == null ? "" : Helpers.DoubleToStringNDecimals(lowest, 2, !targetCsv && lowest >= Config.BORDER_FOR_SCIENTIFIC_NOTATION_REPORT_RESULT) + " ms");
		}
		return new SimpleScalar("Error");
	}

	@Override
	public boolean isEmpty() throws TemplateModelException {
		return false;
	}
	
	private Double GetLowestAvgValue(){
		Double lowest = null;
		for (Double long1 : AvgValues) {
			if(long1 != null && long1 >= 0){
				lowest = long1;
				break;
			}
		}
		if(lowest == null) return null;		
		for(int i = 0; i < AvgValues.size(); i++)
			if(AvgValues.get(i) != null && AvgValues.get(i) >= 0 && AvgValues.get(i) < lowest)
				lowest = AvgValues.get(i);
		return lowest;
	}
	
}
