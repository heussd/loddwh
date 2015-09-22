package report;

import java.util.ArrayList;
import java.util.List;

import freemarker.template.SimpleCollection;
import freemarker.template.SimpleScalar;
import freemarker.template.TemplateHashModel;
import freemarker.template.TemplateModel;
import freemarker.template.TemplateModelException;

public class VerifyResultsReportModelRow implements TemplateHashModel{

	private String QueryScenario;
	private List<Integer> HashCodes;
	
	public VerifyResultsReportModelRow(String queryScenario,
			List<Integer> hashCodes) {
		super();
		QueryScenario = queryScenario;
		HashCodes = hashCodes;
	}

	@Override
	public TemplateModel get(String key) throws TemplateModelException {
		switch (key) {
		case "queryscenario":
			return new SimpleScalar(QueryScenario);
		case "hashcodes":
			List<String> ret = new ArrayList<String>();
			for (Integer l : HashCodes) {
				if(l == null) ret.add(""); else ret.add(l.toString());
			}
			return new SimpleCollection(ret);
		case "hashcodesok":
			if(HashCodes.size() < 2) return new SimpleScalar("ok");
			Integer check = HashCodes.get(0);
			for(int i = 1; i < HashCodes.size(); i++){
				if( (check == null && HashCodes.get(i) != null) || (check != null && HashCodes.get(i) == null) || (check != null && !check.equals(HashCodes.get(i))) )
					return new SimpleScalar("notok");
			}
			return new SimpleScalar("ok");
		}
		return new SimpleScalar("Error");
	}

	@Override
	public boolean isEmpty() throws TemplateModelException {
		return false;
	}
	
}
