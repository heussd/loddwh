package report;

import freemarker.template.SimpleScalar;
import freemarker.template.TemplateHashModel;
import freemarker.template.TemplateModel;
import freemarker.template.TemplateModelException;
import util.Dataset;

public class TestSeriesInformationReportModelRow implements TemplateHashModel {

	public Dataset Dataset;
	public String Size;
	
	public TestSeriesInformationReportModelRow(Dataset dataset, String size) {
		super();
		Dataset = dataset;
		Size = size;
	}

	@Override
	public TemplateModel get(String key) throws TemplateModelException {
		switch (key) {
		case "dataset":
			return new SimpleScalar(Dataset.toString());
		case "size":
			return new SimpleScalar(Size);
		}
		return new SimpleScalar("Error");
	}

	@Override
	public boolean isEmpty() throws TemplateModelException {
		return false;
	}
}
