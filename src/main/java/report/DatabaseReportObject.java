package report;

import freemarker.template.SimpleScalar;
import freemarker.template.TemplateHashModel;
import freemarker.template.TemplateModel;
import freemarker.template.TemplateModelException;
import util.dumper.Helpers;

public class DatabaseReportObject implements TemplateHashModel {

	private String Name;

	public DatabaseReportObject(String name) {
		Name = name;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getLinkConformName() {
		return Helpers.GetLinkConformString(Name);
	}

	@Override
	public TemplateModel get(String key) throws TemplateModelException {
		switch (key) {
		case "name":
			return new SimpleScalar(Name);
		case "linkconformname":
			return new SimpleScalar(getLinkConformName());
		}
		return new SimpleScalar("ERROR");
	}
	
	@Override
	public boolean isEmpty() throws TemplateModelException {
		return false;
	}
}
