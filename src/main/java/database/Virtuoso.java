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
import util.QueryScenario;
import util.Templates;

public class Virtuoso implements Database {

//	public static void main(String[] args) throws Throwable {
//		Virtuoso testVirtuoso = new Virtuoso(
//				"hebis_1000_test",
//				"C:\\RDSTUDIES\\src\\loddwhbench\\src\\main\\resources\\hebis_1000_rdf.gz",
//				"C:\\RDSTUDIES\\db\\virtuoso-opensource", "..");
//
//		testVirtuoso.setUp();
//		testVirtuoso.load(null);
//	}

	private String graphId, fpTGZ, vAD, vADRtVE;
	private Connection c;
	private Statement stmt;
	private Templates templates;

	public Virtuoso(String identifier, String filePathToGZ,
			String virtuosoAccessibleDir,
			String virtuosoAccessibleDirRelativeToVirtuosoTExe) {
		graphId = identifier;
		fpTGZ = filePathToGZ;
		vAD = virtuosoAccessibleDir;
		vADRtVE = virtuosoAccessibleDirRelativeToVirtuosoTExe;
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
		
		templates = new Templates("virtuoso", ".sql");
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
		FileOutputStream out = new FileOutputStream(String.format("%s\\%s",
				vAD, graphId));
		int len;
		while ((len = gzis.read(buffer)) > 0) {
			out.write(buffer, 0, len);
		}
		gzis.close();
		out.close();

		// 2.
		List<String> lines = FileUtils.readLines(new File(String.format(
				"%s\\%s", vAD, graphId)));
		List<String> updatedLines = lines.stream()
				.filter(s -> !s.startsWith("Content-Type"))
				.collect(Collectors.toList()); // iterate lines und aufh�ren
												// sobald <?xml kommt alles
												// vorher l�schen w�re
												// effizienter (also wenn nicht alle lines auf einmal gelesen w�rden)
		FileUtils.writeLines(new File(String.format("%s\\%s", vAD, graphId)),
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
	public void query(QueryScenario queryScenario) throws Exception {

		// IN DEN ABFRAGEN IM STRING KEIN SEMIKOLON AM ENDE MACHEN! DER BRICHT SONST EINFACH OHNE FEHLERMELDUNG AB! UNFASSBAR!
		switch (queryScenario) {
		case ENTITY_RETRIEVAL_BY_ID_CASE1:
			stmt.execute(String.format("sparql select * from <%s> where {	?s <http://purl.org/dc/terms/identifier> '268876681' ; 	<http://purl.org/dc/terms/medium> ?medium ;		<http://purl.org/dc/terms/format> ?format ;		<http://purl.org/dc/terms/issued> ?issued ;		<http://purl.org/dc/terms/title> ?title ; 	<http://purl.org/dc/terms/contributor> ?contributor ; 	<http://purl.org/dc/terms/publisher> ?publisher ; 	<http://purl.org/dc/terms/identifier> ?id ; 	<http://iflastandards.info/ns/isbd/elements/P1018> ?P1018 ; 	<http://iflastandards.info/ns/isbd/elements/P1004> ?P1004 ; 	<http://iflastandards.info/ns/isbd/elements/P1006> ?P1006 ; 	<http://iflastandards.info/ns/isbd/elements/P1016> ?P1016 ; 	<http://iflastandards.info/ns/isbd/elements/P1017> ?P1017 ; 	<http://purl.org/ontology/bibo/oclcnum> ?oclcnum }", graphId));
			break;
			
		case AGGREGATE_ISSUES_PER_DECADE_TOP10:
			stmt.execute(String.format("sparql select ?century, (count(*) as ?count) from <%s> where {	?a <http://purl.org/dc/terms/issued> ?century} group by ?century order by desc(?count) limit 10", graphId));
			break;
			
		case AGGREGATE_ISSUES_PER_DECADE_TOP100:
			stmt.execute(String.format("sparql select ?century, (count(*) as ?count) from <%s> where {	?a <http://purl.org/dc/terms/issued> ?century} group by ?century order by desc(?count) limit 100", graphId));
			break;
			
		case AGGREGATE_ISSUES_PER_DECADE_ALL:
			stmt.execute(String.format("sparql select ?century, (count(*) as ?count) from <%s> where {	?a <http://purl.org/dc/terms/issued> ?century} group by ?century order by desc(?count)", graphId));
			break;
			
		case AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10:
			stmt.execute(String.format("sparql select ?publisher, (count(*) as ?count) from <%s> where {	?a <http://purl.org/dc/terms/publisher> ?publisher} group by ?publisher order by desc(?count) limit 10", graphId));
			break;
			
		case AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100:
			stmt.execute(String.format("sparql select ?publisher, (count(*) as ?count) from <%s> where {	?a <http://purl.org/dc/terms/publisher> ?publisher} group by ?publisher order by desc(?count) limit 100", graphId));
			break;
			
		case AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL:
			stmt.execute(String.format("sparql select ?publisher, (count(*) as ?count) from <%s> where {	?a <http://purl.org/dc/terms/publisher> ?publisher} group by ?publisher order by desc(?count)", graphId));
			break;
			
		case CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES:
			break;
			
		case CONDITIONAL_TABLE_SCAN_ALL_STUDIES:
			stmt.execute(String.format("sparql select * from <%s> where {	?s <http://purl.org/dc/terms/title> ?title 	filter regex(?title, 'stud(ie|y)', 'i') . 	optional{?s <http://purl.org/ontology/bibo/oclcnum> ?oclcnum}	optional{?s <http://purl.org/dc/terms/identifier> ?id}	optional{?s <http://purl.org/dc/terms/publisher> ?publisher}	optional{?s <http://iflastandards.info/ns/isbd/elements/P1017> ?P1017}	optional{?s <http://iflastandards.info/ns/isbd/elements/P1016> ?P1016}	optional{?s <http://iflastandards.info/ns/isbd/elements/P1008> ?P1008}	optional{?s <http://iflastandards.info/ns/isbd/elements/P1006> ?P1006}	optional{?s <http://iflastandards.info/ns/isbd/elements/P1004> ?P1004}	optional{?s <http://iflastandards.info/ns/isbd/elements/P1018> ?P1018}	optional{?s <http://purl.org/dc/terms/issued> ?issued}	optional{?s <http://www.w3.org/2002/07/owl#sameAs> ?sameAs}	optional{?s <http://purl.org/dc/terms/medium> ?medium}	optional{?s <http://purl.org/dc/terms/format> ?format}	optional{?s <http://purl.org/ontology/bibo/edition> ?edition}	optional{?s <http://purl.org/dc/terms/subject> ?subject}	optional{?s <http://purl.org/dc/terms/contributor> ?contributor}}", graphId));
			break;
			
		case CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES:
			break;
			
		case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP:
			break;
			
		case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS:
			break;
			
		case SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY:
			stmt.execute(String.format("sparql insert data into <%s> {<http://www.w3.org/1999/02/22-rdf-syntax-ns#Description> <http://my.schema/change> 'cheesecake'}", graphId));
			break;
			
		case SCHEMA_CHANGE_INTRODUCE_STRING_OP:
			break;
			
		case SCHEMA_CHANGE_MIGRATE_RDF_TYPE:
			break;
			
		case SCHEMA_CHANGE_REMOVE_RDF_TYPE:
			stmt.execute(String.format("sparql delete from <%s> {?s <http://www.w3.org/1999/02/22-rdf-syntax-ns#type> ?v} where {?s a <http://www.w3.org/1999/02/22-rdf-syntax-ns#Description>}", graphId));
			break;
			
		case UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM:
			stmt.execute(String.format("sparql delete data from <%s> {<http://www.w3.org/1999/02/22-rdf-syntax-ns#Description> <http://purl.org/dc/terms/medium> 'paper'}", graphId));
			stmt.execute(String.format("sparql insert data into <%s> {<http://www.w3.org/1999/02/22-rdf-syntax-ns#Description> <http://purl.org/dc/terms/medium> 'recycled trees'}", graphId));
			break;
			
		case UPDATE_HIGH_SELECTIVITY_NON_ISSUED:
			break;
			
		case DELETE_LOW_SELECTIVITY_PAPER_MEDIUM:
			break;
			
		case DELETE_HIGH_SELECTIVIY_NON_ISSUED:
			break;
			
		default:
			throw new RuntimeException("Do not know what to do with QueryScenario "	+ queryScenario);
		}

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
