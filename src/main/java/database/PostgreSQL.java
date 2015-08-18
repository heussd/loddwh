package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

import util.Codes;
import util.Config;
import util.Dataset;
import util.QueryScenario;
import util.Templates;
import util.dumper.Helpers;

public class PostgreSQL extends Helpers implements Database {

	private Connection connection;
	private Properties props;
	private String createQuery;
	private String genericInsertStatement;
	private ArrayList<PreparedStatement> scenarioStatements;
	private QueryScenario queryScenario;
	private Templates templates;

	@Override
	public String getName() {
		return "PostgreSQL (Postgres.app)";
	}

	@Override
	public String getVersion() {
		return "9.4.4 / PostGIS 2.1.7 / 9.4-1201-jdbc41";
	}

	// public static void main(String[] args) throws Exception {
	//
	// PostgreSQL postgreSQL = new PostgreSQL();
	//
	// Dataset dataset = Dataset.hebis_medium_rdf;
	//
	// QueryScenario queryScenario =
	// QueryScenario.SCHEMA_CHANGE_MIGRATE_RDF_TYPE;
	//
	// postgreSQL.setUp();
	// postgreSQL.load(dataset);
	// postgreSQL.clear(queryScenario);
	// postgreSQL.prepare(queryScenario);
	// postgreSQL.query(queryScenario);
	//
	// }

	public PostgreSQL() {
		props = new Properties();
		props.setProperty("user", Config.USER);
		props.setProperty("password", Config.PASSWORD);

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

	/**
	 * Create the database in local PostgreSQL
	 */
	@Override
	public void setUp() throws Exception {
		Connection connection = DriverManager.getConnection("jdbc:postgresql://" + Config.HOST_POSTGRES + "/postgres", props);

		PreparedStatement preparedStatement = connection.prepareStatement("DROP DATABASE IF EXISTS " + Config.DATABASE);
		// try {
		preparedStatement.execute();
		// } catch (Exception e) {
		// }

		preparedStatement = connection.prepareStatement("CREATE DATABASE " + Config.DATABASE);
		preparedStatement.execute();

		templates = new Templates("postgres", ".sql");

		preparedStatement.close();
		connection.close();

		// clear(null);
	}

	@Override
	public void clear(QueryScenario queryScenario) throws Exception {
		reopenConnection(false);

		// dropTable = connection.prepareStatement("DROP TABLE " +
		// Config.TABLE);
		//
		// try {
		// dropTable.execute();
		// } catch (Exception e) { // Ignore if dropping fails.
		// }
		connection.createStatement().executeUpdate("alter table " + Config.TABLE + " drop column if exists manifestation");
	}

	@Override
	public void load(Dataset dataset) throws Exception {
		reopenConnection(false);

		PreparedStatement createTable = connection.prepareStatement(createQuery);
		createTable.execute();

		PreparedStatement insertStatement = connection.prepareStatement(genericInsertStatement);

		readRdf(dataset, dataObject -> {
			try {
				for (int i = 0; i < Codes.values().length; i++) {
					Codes code = Codes.values()[i];
					if (dataObject.get(code) == null) {
						if (code.IS_MULTIPLE) {
							insertStatement.setArray(i + 1, connection.createArrayOf("text", new String[] {}));
						} else {
							insertStatement.setNull(i + 1, java.sql.Types.VARCHAR);
						}
					} else {
						if (code.IS_MULTIPLE) {
							insertStatement.setArray(i + 1, connection.createArrayOf("text", ((ArrayList<String>) dataObject.get(code)).toArray()));
						} else {
							insertStatement.setString(i + 1, (String) dataObject.get(code));
						}
					}
				}
				insertStatement.execute();
				insertStatement.clearParameters();
			} catch (Exception e) {
				throw new RuntimeException("Cannot insert DataObject: " + dataObject, e);
			}
		});
	}

	@Override
	public void prepare(QueryScenario queryScenario) throws Exception {
		reopenConnection(queryScenario.isReadOnly);

		if (scenarioStatements == null)
			scenarioStatements = new ArrayList<>();

		scenarioStatements.clear();

		// SQL queries / prepared statements to be executed before the actual
		// QueryScenario statement
		Statement statement = connection.createStatement();
		switch (queryScenario) {
		case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP:
			statement.executeUpdate(templates.resolve(queryScenario + "_prepare"));
			break;
		default:
			// No special pre-executions for remaining cases.
		}

		// Resolves the template associated with this queryScenario
		scenarioStatements.add(connection.prepareStatement(templates.resolve(queryScenario)));

		this.queryScenario = queryScenario;
	}

	@Override
	public void query(QueryScenario queryScenario) throws Exception {
		if (scenarioStatements == null || this.queryScenario != queryScenario)
			throw new RuntimeException("There is no preparedStatement for QueryScenario " + queryScenario);

		for (PreparedStatement preparedStatement : scenarioStatements) {
			if (queryScenario.isReadOnly) {
				System.out.println(preparedStatement);
				preparedStatement.executeQuery();
			} else {
				preparedStatement.executeUpdate();
			}
		}

	}

	private void reopenConnection(boolean readonly) throws Exception {
		props.setProperty("ReadOnly", readonly ? "true" : "false");

		if (connection != null && !connection.isClosed())
			connection.close();

		if (connection == null || connection.isClosed())
			connection = DriverManager.getConnection("jdbc:postgresql://" + Config.HOST_POSTGRES + "/" + Config.DATABASE, props);
	}

	private void dropConnections() throws Exception {
		connection.createStatement().executeQuery("select pg_terminate_backend(pid) from pg_stat_activity where datname='loddwhbench';");
	}

	@Override
	public String toString() {
		return "PostgreSQL [getName()=" + getName() + ", getVersion()=" + getVersion() + "]";
	}

}
