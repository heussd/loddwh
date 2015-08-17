import java.io.File;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import freemarker.ext.beans.BeansWrapper;
import freemarker.ext.beans.BeansWrapperBuilder;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateExceptionHandler;
import freemarker.template.TemplateHashModel;
import util.QueryScenario;

public class FreeMarker {

	public static void main(String[] args) throws Exception {
		// Create your Configuration instance, and specify if up to what
		// FreeMarker
		// version (here 2.3.22) do you want to apply the fixes that are not
		// 100%
		// backward-compatible. See the Configuration JavaDoc for details.
		Configuration cfg = new Configuration(Configuration.VERSION_2_3_22);

		// Specify the source where the template files come from. Here I set a
		// plain directory for it, but non-file-system sources are possible too:
		cfg.setDirectoryForTemplateLoading(new File(FreeMarker.class.getResource("/queries/").getFile()));

		// Set the preferred charset template files are stored in. UTF-8 is
		// a good choice in most applications:
		cfg.setDefaultEncoding("UTF-8");

		// Sets how errors will appear.
		// During web page *development*
		// TemplateExceptionHandler.HTML_DEBUG_HANDLER is better.
		cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);

		// http://freemarker.org/docs/pgui_misc_beanwrapper.html#autoid_53

		BeansWrapperBuilder beansWrapperBuilder = new BeansWrapperBuilder(Configuration.VERSION_2_3_22);
		BeansWrapper wrapper = beansWrapperBuilder.build();
		TemplateHashModel staticModels = wrapper.getStaticModels();
		TemplateHashModel fileStatics = (TemplateHashModel) staticModels.get("util.Config");
		TemplateHashModel enumModels = wrapper.getEnumModels();
		TemplateHashModel Codes = (TemplateHashModel) enumModels.get("util.Codes");

		Map<String, Object> root = new HashMap<>();
		// Put string ``user'' into the root
		root.put("Config", fileStatics);
		root.put("Codes", Codes);

		Template temp = cfg.getTemplate("postgres/" + QueryScenario.AGGREGATE_ISSUES_PER_CENTURY_ALL + ".sql.ftl");

		Writer out = new OutputStreamWriter(System.out);
		temp.process(root, out);
	}

}
