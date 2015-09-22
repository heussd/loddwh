package report;

import java.util.ArrayList;
import java.util.List;

import freemarker.template.SimpleCollection;
import freemarker.template.SimpleScalar;
import freemarker.template.TemplateHashModel;
import freemarker.template.TemplateModel;
import freemarker.template.TemplateModelException;

public class SumUpReportModelRow implements TemplateHashModel {

	private String QueryScenario, Phase;
	private List<Long> AvgValues;
	private int Sort;

	public SumUpReportModelRow(String queryScenario, String phase,
			List<Long> avgValues, int sort) {
		super();
		QueryScenario = queryScenario;
		Phase = phase;
		AvgValues = avgValues;
		Sort = sort;
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
			for (Long l : AvgValues) {
				if(l == null) ret.add(""); else ret.add(l.toString());
			}
			return new SimpleCollection(ret);
		case "lowest":
			Long lowest = GetLowestAvgValue();
			return new SimpleScalar(lowest == null ? "" : lowest.toString());			
		}
		return new SimpleScalar("Error");
	}

	@Override
	public boolean isEmpty() throws TemplateModelException {
		return false;
	}
	
	private Long GetLowestAvgValue(){
		Long lowest = null;
		for (Long long1 : AvgValues) {
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
