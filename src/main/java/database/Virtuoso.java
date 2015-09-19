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

import util.Config;
import util.Dataset;
import util.QueryResult;
import util.QueryResult.Type;
import util.QueryScenario;
import util.Templates;

public class Virtuoso implements Database {

	public static void main(String[] args) throws Throwable {
		Virtuoso testVirtuoso = new Virtuoso();
		testVirtuoso.setUp();
		testVirtuoso.load(Dataset.hebis_1000_records);

		QueryScenario queryScenario = QueryScenario.ENTITY_RETRIEVAL_BY_ID_100_ENTITIES;
		testVirtuoso.prepare(queryScenario);
		testVirtuoso.query(queryScenario);

	}

	// TODO graphId irrelevant, immer denselben Graphen l�schen und neu
	// aufbauen, �berall anpassen, in query und den templates
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
		return "7.2.1 / Virtuoso JDBC 4.1";
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

		scenarioStatements.add(connection.prepareStatement("sparql " + String.format(templates.resolve(queryScenario), graphId)));
		this.queryScenario = queryScenario;
	}

	@Override
	public QueryResult query(QueryScenario queryScenario) throws Exception {
		// scenarioStatements.add(connection.prepareStatement(templates.resolve(queryScenario)));

		// stmt.executeQuery(stmt.execute(String.format(templates.resolve(queryScenario),
		// graphId))
		for (PreparedStatement preparedStatement : scenarioStatements) {
			ResultSet resultSet;
//			System.out.println(preparedStatement);
			switch (queryScenario.queryResultType) {
			case GRAPH:
				resultSet = preparedStatement.executeQuery();
				while (resultSet.next()) {
//					System.out.println(resultSet.getString(1));
					// switch (resultSet.getMetaData().getColumnCount()) {
					// case 3:
					// queryResult.push(resultSet.getString(1),
					// resultSet.getString(2), resultSet.getString(3));
					// break;
					// case 5:
					// queryResult.push(resultSet.getString(1),
					// resultSet.getString(2), resultSet.getString(3),
					// resultSet.getString(4), resultSet.getString(5));
					// break;
					// default:
					// throw new RuntimeException("Cannot parse " +
					// resultSet.getMetaData().getColumnCount() + " columns in
					// result set");
					// }
				}
				break;
			case TWO_COLUMNS:
				resultSet = preparedStatement.executeQuery();
				while (resultSet.next()) {
					// queryResult.push(resultSet.getString(1),
					// resultSet.getString(2));
					String s = "";
					for (int i = 1; i <= resultSet.getMetaData().getColumnCount(); i++) {
						s += resultSet.getMetaData().getColumnLabel(i) + ": " + resultSet.getString(i) + " ";
					}
//					System.out.println(s);
				}
				break;
			case COMPLETE_ENTITIES:
				resultSet = preparedStatement.executeQuery();

				while (resultSet.next()) {
					String s = "";
					for (int i = 1; i <= resultSet.getMetaData().getColumnCount(); i++) {
						s += resultSet.getMetaData().getColumnLabel(i) + ": " + resultSet.getString(i) + " ";
					}
					// System.out.println(s);
					// System.out.println(resultSet.getString(1) + " " +
					// resultSet.getString(2) + " " + resultSet.getString(3) + "
					// " + resultSet.getString(4));
					// DataObject dataObject = new DataObject();
					// for (Codes code : Codes.values()) {
					// if (code.IS_MULTIPLE) {
					// for (String value : (String[])
					// resultSet.getArray(code.ordinal() + 1).getArray()) {
					// dataObject.putMultiple(code, value);
					// }
					//
					// } else {
					// dataObject.set(code, resultSet.getString(code.ordinal() +
					// 1));
					// }
					// }
					// queryResult.push(dataObject);
				}
				break;
			case NONE:
			default:
				// This will only work for non-readOnly-scenarios!
				preparedStatement.executeUpdate();
				break;
			}
		}
		// TODO
		return new QueryResult(Type.NONE);
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
