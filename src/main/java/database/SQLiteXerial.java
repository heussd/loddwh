package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.json.JSONArray;
import org.sqlite.SQLiteConfig;

import util.Codes;
import util.Config;
import util.Dataset;
import util.QueryResult;
import util.QueryScenario;
import util.Templates;
import util.dumper.Helpers;

public class SQLiteXerial extends Helpers implements Database {

	private Connection connection;
	private String createQuery;
	private String genericInsertStatement;
	private ArrayList<PreparedStatement> scenarioStatements;
	private QueryScenario queryScenario;
	private Templates templates;

	public SQLiteXerial() {
		// Produce some queries based on Config / Codes enums - do not prepare
		// statements as PreparedStatements is part of the load() or prepare().
		createQuery = "CREATE TABLE " + Config.TABLE + " ( \n";
		genericInsertStatement = "insert into " + Config.TABLE + " (";
		for (int i = 0; i < Codes.values().length; i++) {
			Codes code = Codes.values()[i];
			createQuery += " " + code.toString() + " " + (code.IS_MULTIPLE ? "text ARRAY" : "text");
			genericInsertStatement += code.toString();
			// Last one?
			createQuery += (Codes.values().length - 1 == i ? "\n)" : ",\n");
			genericInsertStatement += (Codes.values().length - 1 == i ? ")" : ",");
		}
		genericInsertStatement += "\nVALUES(";
		for (int i = 0; i < Codes.values().length; i++) {
			genericInsertStatement += "?" + (Codes.values().length - 1 == i ? ")" : ",");
		}
	}

	@Override
	public String getName() {
		return "SQLite JDBC Xerial";
	}

	@Override
	public String getVersion() {
		return "3.8.11";
	}

	@Override
	public void setUp() throws Exception {
		reopenConnection(false);
		connection.prepareStatement("drop table if exists " + Config.TABLE).executeUpdate();

		templates = new Templates("sqlite", ".sql");
	}

	@Override
	public void load(Dataset dataset) throws Exception {
		connection.setAutoCommit(false);
		PreparedStatement createTable = connection.prepareStatement(createQuery);
		createTable.execute();

		PreparedStatement insertStatement = connection.prepareStatement(genericInsertStatement);

		readRdf(dataset, dataObject -> {
			try {
				for (int i = 0; i < Codes.values().length; i++) {
					Codes code = Codes.values()[i];
					if (dataObject.get(code) == null) {
						// if (code.IS_MULTIPLE) {
						//// insertStatement.setArray(i + 1,
						// connection.createArrayOf("text", new String[] {}));
						// } else {
						insertStatement.setNull(i + 1, java.sql.Types.VARCHAR);
						// }
					} else {
						Object value = dataObject.get(code);

						if (code.IS_MULTIPLE) {
							value = new JSONArray((ArrayList) value).toString();
						}
						// else {
						insertStatement.setString(i + 1, (String) value);
						// }
					}
				}
				insertStatement.execute();
				insertStatement.clearParameters();
			} catch (Exception e) {
				throw new RuntimeException("Cannot insert DataObject: " + dataObject, e);
			}
		});
		connection.commit();
	}

	private void reopenConnection(boolean readonly) {
		try {
			if (connection != null && !connection.isClosed()) {
				connection.close();
			}

			// connection = DriverManager.getConnection("jdbc:sqlite:" +
			// Config.DATABASE + ".db");

			SQLiteConfig sqLiteConfig = new SQLiteConfig();
			sqLiteConfig.setReadOnly(readonly);
			connection = sqLiteConfig.createConnection("jdbc:sqlite:sqlitexerial.db");
		} catch (SQLException e) {
			throw new RuntimeException("Cannot open connection", e);
		}
	}

	@Override
	public void prepare(QueryScenario queryScenario) throws Exception {
		reopenConnection(false);

		if (scenarioStatements == null)
			scenarioStatements = new ArrayList<>();

		scenarioStatements.clear();

		// SQL queries / prepared statements to be executed before the actual
		// QueryScenario statement
		connection.setAutoCommit(false);
		Statement statement = connection.createStatement();

		switch (queryScenario) {
		case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP:
		case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS:
			System.out.println("Not implemented: " + queryScenario);
			return;
		case SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY:
		case SCHEMA_CHANGE_REMOVE_RDF_TYPE:
			break;
		default:
			statement.executeUpdate(templates.resolve(queryScenario + "_prepare"));
		}
		connection.commit();

		
		reopenConnection(queryScenario.isReadOnly);
		connection.setAutoCommit(false);
		// Resolves the template associated with this queryScenario
		scenarioStatements.add(connection.prepareStatement(templates.resolve(queryScenario)));

		this.queryScenario = queryScenario;
	}

	@Override
	public QueryResult query(QueryScenario queryScenario) throws Exception {
		if (scenarioStatements == null || this.queryScenario != queryScenario)
			throw new RuntimeException("There is no preparedStatement for QueryScenario " + queryScenario);
		
		for (PreparedStatement preparedStatement : scenarioStatements) {
			if (queryScenario.isReadOnly) {
				ResultSet resultSet = preparedStatement.executeQuery();
				// while (resultSet.next()) {
				// System.out.println(resultSet.getString(1) + " " +
				// resultSet.getString(2));
				// System.out.println();
				// // read the result set
				// System.out.println("name = " + rs.getString("name"));
				// System.out.println("id = " + rs.getInt("id"));
				// }
			} else {
				preparedStatement.executeUpdate();
			}
		}
		connection.commit();
	}

	@Override
	public void clear(QueryScenario queryScenario) throws Exception {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) throws Exception {

		SQLiteXerial sqLiteXerial = new SQLiteXerial();
		sqLiteXerial.setUp();
		sqLiteXerial.load(Dataset.hebis_tiny_rdf);

		QueryScenario queryScenario = QueryScenario.CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES;
		sqLiteXerial.prepare(queryScenario);
		sqLiteXerial.query(queryScenario);

		queryScenario = QueryScenario.ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY;
		sqLiteXerial.prepare(queryScenario);
		sqLiteXerial.query(queryScenario);

		// sqLiteXerial.

		// Connection connection = null;
		// try {
		// // create a database connection
		// connection = DriverManager.getConnection("jdbc:sqlite:" +
		// Config.DATABASE + ".db");
		// Statement statement = connection.createStatement();
		// statement.setQueryTimeout(30); // set timeout to 30 sec.
		//
		// statement.executeUpdate("drop table if exists person");
		// statement.executeUpdate("create table person (id integer, name
		// string)");
		// statement.executeUpdate("insert into person values(1, 'leo')");
		// statement.executeUpdate("insert into person values(2, 'yui')");
		// ResultSet rs = statement.executeQuery("select * from person");
		// while (rs.next()) {
		// // read the result set
		// System.out.println("name = " + rs.getString("name"));
		// System.out.println("id = " + rs.getInt("id"));
		// }
		// } catch (SQLException e) {
		// // if the error message is "out of memory",
		// // it probably means no database file is found
		// System.err.println(e.getMessage());
		// } finally {
		// try {
		// if (connection != null)
		// connection.close();
		// } catch (SQLException e) {
		// // connection close failed.
		// System.err.println(e);
		// }
		// }
	}

}
