package database;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.zip.GZIPInputStream;

import util.Codes;
import util.Config;
import util.DataObject;
import util.Dataset;
import util.QueryResult;
import util.QueryScenario;
import util.Templates;

public class Virtuoso implements Database {

	public static void main(String[] args) throws Throwable {
		Virtuoso testVirtuoso = new Virtuoso();
		testVirtuoso.setUp();
		testVirtuoso.load(Dataset.hebis_1000_records);

		QueryScenario queryScenario = QueryScenario.SCHEMA_CHANGE_MIGRATE_RDF_TYPE;
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
		connection = DriverManager.getConnection("jdbc:virtuoso://127.0.0.1", "dba", "dba");
		stmt = connection.createStatement();

		// Drop auf evtl. alten Identifier
		stmt.execute(String.format("SPARQL CLEAR GRAPH <%s>", graphId));
	}

	@Override
	public void load(Dataset dataset) throws Exception {
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
	}

	@Override
	public void prepare(QueryScenario queryScenario) throws Exception {
		if (scenarioStatements == null)
			scenarioStatements = new ArrayList<>();

		scenarioStatements.clear();

		switch (queryScenario) {
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
	public void clear(QueryScenario queryScenario) throws Exception {
		// not needed any more ... ?
	}

	@Override
	public String toString() {
		return "Virtuoso [getName()=" + getName() + ", getVersion()=" + getVersion() + "]";
	}

}
