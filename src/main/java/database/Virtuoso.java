package database;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.GZIPInputStream;

import com.google.common.base.Joiner;

import arq.cmd.TerminationException;
import util.Codes;
import util.Config;
import util.DataObject;
import util.Dataset;
import util.QueryResult;
import util.QueryScenario;
import util.Templates;
import util.dumper.Helpers;

public class Virtuoso implements Database {

	public static void main(String[] args) throws Throwable {
		Virtuoso testVirtuoso = new Virtuoso();
		testVirtuoso.setUp();
		// testVirtuoso.load(Dataset.hebis_10147116_13050073_rdf_gz);
		testVirtuoso.load(Dataset.hebis_10000_records);

		// testVirtuoso.buildRdfLoaderCommand(Dataset.hebis_1000_records);

		QueryScenario queryScenario = QueryScenario.ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES;
		// QueryScenario queryScenario =
		// QueryScenario.AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10;
		testVirtuoso.prepare(queryScenario);
		QueryResult queryResult = testVirtuoso.query(queryScenario);
		System.out.println(queryResult);

	}

	private String graphId, vAD, vADRtVE;
	private Connection connection;
	private Statement stmt;
	private Templates templates;
	private ArrayList<PreparedStatement> scenarioStatements;
	private QueryScenario queryScenario;

	public Virtuoso() {
		graphId = Config.DATABASE;
		vAD = Config.VIRTUOSO_ACCESSIBLE_DIRECTORY;
		vADRtVE = Config.VIRTUOSO_ACCESSIBLE_DIRECTORY_RELATIVE_TO_VIRTUOSO_T_EXE;

		templates = new Templates("virtuoso", ".sql");
	}

	@Override
	public String getName() {
		return "Virtuoso";
	}

	@Override
	public String getVersion() {
		return "07.20.3214 / Virtuoso JDBC 4.1";
	}

	@Override
	public void setUp() throws Exception {
		connection = DriverManager.getConnection("jdbc:virtuoso://127.0.0.1/CHARSET=UTF-8", "dba", "dba");
		stmt = connection.createStatement();
		// Load RDF Loader - this might fail
		try {
			stmt.executeQuery("LOAD " + new File(this.getClass().getResource("/queries/virtuoso/rdfloader.sql").getFile()).getAbsolutePath() + ";");
		} catch (Exception e) {

		}
	}

	private String GetInsertStatement() {
		String insertStatement = "sparql\n";
		insertStatement += "PREFIX rdf:<http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n";
		insertStatement += "PREFIX picaplus:<http://lod.hebis.uni-frankfurt.de/daten/terms/>\n";
		insertStatement += "PREFIX dbpedia:<http://localhost:8080/resource/>\n";
		insertStatement += "PREFIX skos:<http://www.w3.org/2004/02/skos/core#>\n";
		insertStatement += "PREFIX rel:<http://opendata.hbz-nrw.de/rel/1.0/>\n";
		insertStatement += "PREFIX geonames:<http://www.geonames.org/ontology#>\n";
		insertStatement += "PREFIX yago:<http://localhost:8080/class/yago/>\n";
		insertStatement += "PREFIX units:<http://dbpedia.org/units/>\n";
		insertStatement += "PREFIX p:<http://localhost:8080/property/>\n";
		insertStatement += "PREFIX auth:<http://opendata.hbz-nrw.de/auth/1.0/>\n";
		insertStatement += "PREFIX prvTypes:<http://purl.org/net/provenance/types#>\n";
		insertStatement += "PREFIX bibo:<http://purl.org/ontology/bibo/>\n";
		insertStatement += "PREFIX foaf:<http://xmlns.com/foaf/0.1/>\n";
		insertStatement += "PREFIX j.0:<http://spinrdf.org/sp#>\n";
		insertStatement += "PREFIX frbr:<http://purl.org/vocab/frbr/core#>\n";
		insertStatement += "PREFIX owl:<http://www.w3.org/2002/07/owl#>\n";
		insertStatement += "PREFIX dcterms:<http://purl.org/dc/terms/>\n";
		insertStatement += "PREFIX meta:<http://example.org/metadata#>\n";
		insertStatement += "PREFIX xsd:<http://www.w3.org/2001/XMLSchema#>\n";
		insertStatement += "PREFIX j.1:<http://www.w3.org/2004/03/trix/rdfg-1/>\n";
		insertStatement += "PREFIX wdrs:<http://www.w3.org/2007/05/powder-s#>\n";
		insertStatement += "PREFIX prv:<http://purl.org/net/provenance/ns#>\n";
		insertStatement += "PREFIX isbd:<http://iflastandards.info/ns/isbd/elements/>\n";
		insertStatement += "PREFIX rdfs:<http://www.w3.org/2000/01/rdf-schema#>\n";
		insertStatement += "PREFIX geo:<http://www.w3.org/2003/01/geo/wgs84_pos#>\n";
		insertStatement += "PREFIX rda:<http://RDVocab.info/Elements/>\n";
		// insertStatement += String.format("INSERT DATA { GRAPH <%s> {%s %s %s}
		// }", /*graphId*/"MYINSERTTESTS");
		insertStatement += "INSERT DATA { GRAPH <%s> {<%s> %s %s} }";
		return insertStatement;
	}

	@Override
	public void load(Dataset dataset) throws Exception {
		PreparedStatement rdfDumpLoadInstruction = connection.prepareStatement("ld_dir(?, ?, ?)");
		rdfDumpLoadInstruction.setString(1, dataset.file.getParentFile().getAbsolutePath());
		rdfDumpLoadInstruction.setString(2, dataset.file.getName());
		rdfDumpLoadInstruction.setString(3, Config.DATABASE);

		rdfDumpLoadInstruction.executeQuery();
		connection.createStatement().executeQuery("rdf_loader_run()");
	}

	public void theoldload(Dataset dataset) throws Exception {

		// DIE KLEINEN DATEIEN
		if (dataset == Dataset.hebis_10147116_13050073_rdf_gz || dataset == Dataset.hebis_1000_records || dataset == Dataset.hebis_10000_records
				|| dataset == Dataset.hebis_100000_records) {
			// 1. UnGzip to virtuosoAccessibleDir
			// 2. Load Data into Graph
			// 1.
			byte[] buffer = new byte[1024];
			GZIPInputStream gzis = new GZIPInputStream(new FileInputStream(dataset.string));
			FileOutputStream out = new FileOutputStream(String.format("%s//%s", vAD, graphId));
			int len;
			while ((len = gzis.read(buffer)) > 0) {
				out.write(buffer, 0, len);
			}
			gzis.close();
			out.close();
			// 2.
			stmt.executeQuery(String.format("DB.DBA.RDF_LOAD_RDFXML_MT (file_to_string_output ('%s/%s'), '', '%s')", vADRtVE, graphId, graphId));

			return;
		}

		// DIE GRO�EN DATEIEN

		// PreparedStatement pstmt =
		// connection.prepareStatement(insertStatement);
		Statement statement = connection.createStatement();

		// Load DataObjects
		boolean autoCommitBackup = connection.getAutoCommit();
		connection.setAutoCommit(false);
		Helpers.readRdf(dataset, dataObject -> {
			try {
				for (int i = 0; i < Codes.values().length; i++) {

					Codes code = Codes.values()[i];
					if (code != Codes.RDF_ABOUT && dataObject.get(code) != null) {
						String subject = dataObject.get(Codes.RDF_ABOUT).toString(), predicate, object;

						if (code.rdfProperty.contains(" "))
							predicate = code.rdfProperty.substring(0, code.rdfProperty.indexOf(" ")); // "wdrs:describedby
																										// rdf:resource"
																										// =>
																										// "wdrs:describedby"
						else
							predicate = code.rdfProperty;

						if (code.IS_MULTIPLE) {
							List<String> entries = (ArrayList<String>) dataObject.get(code);
							for (String string : entries) {
								String achehrlich = string;

								// Ach, ehrlich ...
								achehrlich = achehrlich.replace('"', '\'');
								achehrlich = achehrlich.replace('\\', '-');

								String objectVal = code.attributeValue ? "<%s>" : "\"%s\"";
								object = String.format(objectVal, achehrlich);
								String insertStatement = GetInsertStatement();
								String update = String.format(insertStatement, graphId, subject, predicate, object);
								statement.executeUpdate(update);
							}
						} else {
							String achehrlich = dataObject.get(code).toString();

							// Ach, ehrlich ...
							achehrlich = achehrlich.replace('"', '\'');
							achehrlich = achehrlich.replace('\\', '-');

							String objectVal = code.attributeValue ? "<%s>" : "\"%s\"";
							object = String.format(objectVal, achehrlich);
							String insertStatement = GetInsertStatement();
							String update = String.format(insertStatement, graphId, subject, predicate, object);
							statement.executeUpdate(update);
						}

						// pstmt.setString(1, subject);
						// pstmt.setString(2, predicate);
						// pstmt.setString(3, object);
						// //System.out.println(dataObject);
						//
						// pstmt.execute();
						// pstmt.clearParameters();
					}
				}
			} catch (Exception e) {
				throw new RuntimeException("Cannot insert DataObject:\n" + dataObject, e);
			}
		} , counter -> {
			if (counter % 50000 == 0) {
				System.out.println(counter + " records so far... (Virtuoso Load())");
				try {
					connection.commit();
				} catch (Exception e) {
					throw new RuntimeException("Commit gone wrong");
				}
			}
		});
		connection.commit();
		connection.setAutoCommit(autoCommitBackup);
	}

	@Override
	public void prepare(QueryScenario queryScenario) throws Exception {
		if (scenarioStatements == null)
			scenarioStatements = new ArrayList<>();

		scenarioStatements.clear();

		switch (queryScenario) {
		case ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY:
		case ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES:
		case ENTITY_RETRIEVAL_BY_ID_100_ENTITIES:
			String query = templates.resolve("ENTITY_RETRIEVAL_prepare");
			switch (queryScenario) {
			case ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY:
				query += " limit 1";
				break;
			case ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES:
				query += " limit 10";
				break;
			case ENTITY_RETRIEVAL_BY_ID_100_ENTITIES:
				query += " limit 100";
				break;
			default:
			}

			ResultSet resultSet = connection.createStatement().executeQuery("sparql " + query);
			ArrayList<String> ids = new ArrayList<>();
			while (resultSet.next()) {
				ids.add("\"" + resultSet.getString(1) + "\"");
			}
			scenarioStatements.add(connection.prepareStatement("sparql " + templates.resolve("ENTITY_RETRIEVAL").replaceAll("##ids##", Joiner.on(",").join(ids))));
			break;
		case SCHEMA_CHANGE_MIGRATE_RDF_TYPE:
			for (int part = 1; part <= 4; part++)
				scenarioStatements.add(connection.prepareStatement("sparql " + String.format(templates.resolve(queryScenario + "_part" + part), graphId)));
			break;
		default:
			scenarioStatements.add(connection.prepareStatement("sparql " + String.format(templates.resolve(queryScenario), graphId)));
		}

		this.queryScenario = queryScenario;
	}

	@Override
	public QueryResult query(QueryScenario queryScenario) throws Exception {
		// scenarioStatements.add(connection.prepareStatement(templates.resolve(queryScenario)));

		// stmt.executeQuery(stmt.execute(String.format(templates.resolve(queryScenario),
		// graphId))
		QueryResult queryResult = new QueryResult(queryScenario.queryResultType);
		for (PreparedStatement preparedStatement : scenarioStatements) {
			ResultSet resultSet;
			// System.out.println(preparedStatement);
			switch (queryScenario.queryResultType) {
			case GRAPH:
				resultSet = preparedStatement.executeQuery();
				while (resultSet.next()) {
					switch (resultSet.getMetaData().getColumnCount()) {
					case 3:
						queryResult.push(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3));
						break;
					case 5:
						queryResult.push(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getString(5));
						break;
					default:
						throw new RuntimeException("Cannot parse " + resultSet.getMetaData().getColumnCount() + " columns in result set");
					}
				}
				break;
			case TWO_COLUMNS:
				resultSet = preparedStatement.executeQuery();
				while (resultSet.next()) {
					queryResult.push(resultSet.getString(1), resultSet.getString(2));
				}
				break;
			case COMPLETE_ENTITIES:
				resultSet = preparedStatement.executeQuery();

				while (resultSet.next()) {
					DataObject dataObject = new DataObject();
					for (int i = 0; i < Codes.values().length; i++) {
						Codes code = Codes.values()[i];
						String fieldValue = resultSet.getString(i + 1);
						if (fieldValue == null) {
							dataObject.set(code, null);
							continue;
						}

						if (code.IS_MULTIPLE) {
							if (!fieldValue.contains(",")) {
								// Code is defined to be multiple put field only
								// contains a single value
								dataObject.putMultiple(code, fieldValue);
							} else {
								// Assemble the SPARQL-group-concat expressions
								// - workaround for missing efficient describe
								for (String fieldValueIteration : fieldValue.split(",")) {
									dataObject.putMultiple(code, fieldValueIteration);
								}
							}
						} else {
							// Straight forward
							dataObject.set(code, fieldValue);
						}
					}
					queryResult.push(dataObject);
				}
				break;
			case NONE:
			default:
				// This will only work for non-readOnly-scenarios!
				preparedStatement.executeUpdate();
				break;
			}
		}
		return queryResult;
	}

	@Override
	public String toString() {
		return "Virtuoso [getName()=" + getName() + ", getVersion()=" + getVersion() + "]";
	}

	@Override
	public void clean() throws Exception {
		stmt = connection.createStatement();
		// Drop auf evtl. alten Identifier
		stmt.execute(String.format("SPARQL CLEAR GRAPH <%s>", graphId));
	}

	@Override
	public void start() throws Exception {
		Helpers.terminalLaunch("virtuoso.sh", 12);
	}

	@Override
	public void stop() throws Exception {
		// TODO Auto-generated method stub
		
	}

}
