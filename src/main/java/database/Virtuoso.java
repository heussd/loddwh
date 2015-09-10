package database;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.List;
import java.util.stream.Collectors;
import java.util.zip.GZIPInputStream;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.NotImplementedException;

import util.Codes;
import util.Config;
import util.Dataset;
import util.QueryResult;
import util.QueryResult.Type;
import util.QueryScenario;
import util.Templates;

public class Virtuoso implements Database {

	public static void main(String[] args) throws Throwable {
		Virtuoso testVirtuoso = new Virtuoso("hebis_1000_test", Dataset.hebis_tiny_rdf, "C:\\RDSTUDIES\\db\\virtuoso-opensource", "..");
		for (QueryScenario qs : QueryScenario.values()) {
			System.out.println(String.format(testVirtuoso.templates.resolve(qs), "GRAPH_ID"));
		}
	}

	// TODO graphId irrelevant, immer denselben Graphen l�schen und neu aufbauen, �berall anpassen, in query und den templates
	private String graphId, fpTGZ, vAD, vADRtVE;
	private Connection c;
	private Statement stmt;
	private Templates templates;

	public Virtuoso(String identifier, Dataset filePathToGZ,
			String virtuosoAccessibleDir,
			String virtuosoAccessibleDirRelativeToVirtuosoTExe) {
		graphId = identifier;
		fpTGZ = filePathToGZ.string;
		vAD = virtuosoAccessibleDir;
		vADRtVE = virtuosoAccessibleDirRelativeToVirtuosoTExe;
		
		templates = new Templates("virtuoso", ".sql");
	}

	@Override
	public String getName() {
		return "Virtuoso";
	}

	@Override
	public String getVersion() {
		return "7.2.1";
	}

	@Override
	public void setUp() throws Exception {
		c = DriverManager.getConnection("jdbc:virtuoso://127.0.0.1", "dba",
				"dba");
		stmt = c.createStatement();

		// Drop auf evtl. alten Identifier
		stmt.execute(String.format("SPARQL CLEAR GRAPH <%s>", graphId));
	}

	@Override
	public void load(Dataset dataset) throws Exception {
		// Aktuell:
		// 1. UnGzip to virtuosoAccessibleDir
		// 2. Remove Line 1
		// 3. Load Data into Graph

		// 1.
		byte[] buffer = new byte[1024];
		GZIPInputStream gzis = new GZIPInputStream(new FileInputStream(fpTGZ));
		FileOutputStream out = new FileOutputStream(String.format("%s//%s",
				vAD, graphId));
		int len;
		while ((len = gzis.read(buffer)) > 0) {
			out.write(buffer, 0, len);
		}
		gzis.close();
		out.close();

		// 2.
		List<String> lines = FileUtils.readLines(new File(String.format(
				"%s//%s", vAD, graphId)));
		List<String> updatedLines = lines.stream()
				.filter(s -> !s.startsWith("Content-Type"))
				.collect(Collectors.toList()); // iterate lines und aufh�ren
												// sobald <?xml kommt alles
												// vorher l�schen w�re
												// effizienter (also wenn nicht alle lines auf einmal gelesen w�rden)
		FileUtils.writeLines(new File(String.format("%s//%s", vAD, graphId)),
				"utf-8", updatedLines, false);

		// 3.
		stmt.executeQuery(String
				.format("DB.DBA.RDF_LOAD_RDFXML_MT (file_to_string_output ('%s/%s'), '', '%s')",
						vADRtVE, graphId, graphId));
	}

	@Override
	public void prepare(QueryScenario queryScenario) throws Exception {
	}

	@Override
	public QueryResult query(QueryScenario queryScenario) throws Exception {
		
		stmt.execute(String.format(templates.resolve(queryScenario), graphId));
		
		// TODO 
		return new QueryResult(Type.NONE);
	}

	@Override
	public void clear(QueryScenario queryScenario) throws Exception {
		// not needed any more ... ?
	}

	@Override
	public String toString() {
		return "Virtuoso [getName()=" + getName() + ", getVersion()="
				+ getVersion() + "]";
	}

	
}
