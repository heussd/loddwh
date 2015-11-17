package util;

import java.io.File;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import database.Database;
import freemarker.ext.beans.BeansWrapper;
import freemarker.ext.beans.BeansWrapperBuilder;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateExceptionHandler;
import freemarker.template.TemplateHashModel;

public class Templates {
	private Configuration configuration;
	private Map<String, Object> root;
	private final String simpleDatabaseName;
	private final String templateIdentifierSuffix;

	/**
	 * Initializes a {@link Templates} instance and warms the retrieval
	 * capabilities up with a demo template. This method should be called once
	 * per {@link Database} implementation, and the performance <b>shall NOT</b>
	 * be part of query time measurements.
	 * 
	 * @param simpleDataBaseName
	 *            - a folder that should be used for every
	 *            {@link Templates#resolve(String)} call, e.g. "postgres". If
	 *            you don't need that, use null.
	 * 
	 * @param templateIdentifierSuffix
	 *            - a file name suffix that should be attached for every
	 *            {@link Templates#resolve(String)} call, e.g. ".sql". If you
	 *            don't need that, use null.
	 * 
	 * @return
	 */
	public Templates(String simpleDataBaseName, String templateIdentifierSuffix) {
		this.simpleDatabaseName = simpleDataBaseName == null ? "" : simpleDataBaseName;
		this.templateIdentifierSuffix = templateIdentifierSuffix == null ? "" : templateIdentifierSuffix;
		try {
			// Create your Configuration instance, and specify if up to what
			// FreeMarker
			// version (here 2.3.22) do you want to apply the fixes that are not
			// 100%
			// backward-compatible. See the Configuration JavaDoc for details.
			configuration = new Configuration(Configuration.VERSION_2_3_22);

			// Specify the source where the template files come from. Here I set
			// a
			// plain directory for it, but non-file-system sources are possible
			// too:
			configuration.setDirectoryForTemplateLoading(new File(Templates.class.getResource("/queries/").toURI()));

			// Set the preferred charset template files are stored in. UTF-8 is
			// a good choice in most applications:
			configuration.setDefaultEncoding("UTF-8");

			// Sets how errors will appear.
			// During web page *development*
			// TemplateExceptionHandler.HTML_DEBUG_HANDLER is better.
			configuration.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);

			// http://freemarker.org/docs/pgui_misc_beanwrapper.html#autoid_53

			BeansWrapperBuilder beansWrapperBuilder = new BeansWrapperBuilder(Configuration.VERSION_2_3_22);
			BeansWrapper wrapper = beansWrapperBuilder.build();

			TemplateHashModel staticModels = wrapper.getStaticModels();
			TemplateHashModel config = (TemplateHashModel) staticModels.get("util.Config");
			
			root = new HashMap<>();
			root.put("Config", config);

			// Warm up with demo template
			resolve("", "demo", "");
		} catch (Exception e) {
			throw new RuntimeException("Cannot initialize QueryTemplates", e);
		}
	}

	/**
	 * Retrieves the specified query template and resolves it to a executable
	 * query. The performance of this method is part of the query times, so it
	 * should be called within {@link Database#query(QueryScenario)} or within
	 * {@link Database#load(QueryScenario)}.
	 * 
	 * @param templateIdentifier
	 *            - The template to be retrieved. Constructer-set variables will
	 *            be added automatically following this scheme:<br>
	 *            <code>simpleDatabaseName + "/" + templateIdentifier + templateIdentifierSuffix + ".ftl"</code>
	 * @return
	 */
	public String resolve(String templateIdentifier) {
		return resolve(this.simpleDatabaseName, templateIdentifier, this.templateIdentifierSuffix);
	}

	/**
	 * Shortcut for {@link #resolve(String)}
	 */
	public String resolve(QueryScenario templateIdentifier) {
		return resolve(this.simpleDatabaseName, templateIdentifier.toString(), this.templateIdentifierSuffix);
	}

	private String resolve(String simpleDatabaseName, String templateIdentifier, String templateIdentifierSuffix) {
		try {
			Template template = configuration.getTemplate(simpleDatabaseName + File.separatorChar + templateIdentifier + templateIdentifierSuffix + ".ftl");
			StringWriter stringWriter = new StringWriter();
			template.process(root, stringWriter);
			return stringWriter.toString();
		} catch (Exception e) {
			throw new RuntimeException("Cannot retrieve query template \"" + templateIdentifier + "\" for database \"" + simpleDatabaseName + "\"", e);
		}
	}

	public static void main(String[] args) {
		Templates templates = new Templates("postgres", ".sql");
		System.out.println(templates.resolve(QueryScenario.ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY));
	}

}
