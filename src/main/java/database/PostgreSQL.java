package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

import util.Codes;
import util.Config;
import util.Dataset;
import util.QueryScenario;
import util.dumper.Helpers;

public class PostgreSQL extends Helpers implements Database {

	private Connection connection;
	private PreparedStatement dropTable;
	private PreparedStatement insertStatement;
	private PreparedStatement createTable;
	private PreparedStatement preparedScenarioStatement;
	private Properties props;
	private String createQuery;
	private String genericInsertStatement;

	@Override
	public String getName() {
		return "PostgreSQL (Postgres.app)";
	}

	@Override
	public String getVersion() {
		return "9.4.4 / PostGIS 2.1.7 / 9.4-1201-jdbc41";
	}

	public static void main(String[] args) throws Exception {

		PostgreSQL postgreSQL = new PostgreSQL();

		Dataset dataset = Dataset.hebis_medium_rdf;
		QueryScenario queryScenario = QueryScenario.UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM;

		// postgreSQL.setUp();
		// postgreSQL.load(dataset);

		postgreSQL.prepare(queryScenario);
		postgreSQL.query(queryScenario);
	}

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

		PreparedStatement preparedStatement = connection.prepareStatement("DROP DATABASE " + Config.DATABASE);
		try {
			preparedStatement.execute();
		} catch (Exception e) {
		}

		preparedStatement = connection.prepareStatement("CREATE DATABASE " + Config.DATABASE);
		preparedStatement.execute();

		preparedStatement.close();
		connection.close();

		clear();
	}

	@Override
	public void clear() throws Exception {
		reopenConnection(false);

		dropTable = connection.prepareStatement("DROP TABLE " + Config.TABLE);

		try {
			dropTable.execute();
		} catch (Exception e) { // Ignore if dropping fails.
		}
	}

	@Override
	public void load(Dataset dataset) throws Exception {
		reopenConnection(false);

		createTable = connection.prepareStatement(createQuery);
		createTable.execute();

		insertStatement = connection.prepareStatement(genericInsertStatement);

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

		Statement statement = connection.createStatement();
		switch (queryScenario) {
		case ENTITY_RETRIEVAL_BY_ID_CASE1:
			preparedScenarioStatement = connection.prepareStatement("select * from " + Config.TABLE + " where " + Codes.DCTERMS_IDENTIFIER + " = '268893950'");
			break;
		case AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10:
			preparedScenarioStatement = connection.prepareStatement("select " + Codes.DCTERMS_PUBLISHER + ", count(" + Codes.DCTERMS_PUBLISHER + ") from " + Config.TABLE
					+ " group by " + Codes.DCTERMS_PUBLISHER + " order by count(" + Codes.DCTERMS_PUBLISHER + ") desc limit 10");
			break;
		case AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100:
			preparedScenarioStatement = connection.prepareStatement("select " + Codes.DCTERMS_PUBLISHER + ", count(" + Codes.DCTERMS_PUBLISHER + ") from " + Config.TABLE
					+ " group by " + Codes.DCTERMS_PUBLISHER + " order by count(" + Codes.DCTERMS_PUBLISHER + ") desc limit 100");
			break;
		case AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL:
			preparedScenarioStatement = connection.prepareStatement("select " + Codes.DCTERMS_PUBLISHER + ", count(" + Codes.DCTERMS_PUBLISHER + ") from " + Config.TABLE
					+ " group by " + Codes.DCTERMS_PUBLISHER + " order by count(" + Codes.DCTERMS_PUBLISHER + ") desc");
			break;
		case AGGREGATE_ISSUES_PER_CENTURY_ALL:
			preparedScenarioStatement = connection.prepareStatement("select SUBSTR(" + Codes.DCTERMS_ISSUED + ", 1, 3), count(" + Codes.DCTERMS_IDENTIFIER
					+ ") from justatable group by SUBSTR(" + Codes.DCTERMS_ISSUED + ", 1, 3) order by SUBSTR(" + Codes.DCTERMS_ISSUED + ", 1, 3)");
			break;
		case CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES:
			preparedScenarioStatement = connection.prepareStatement("select * from " + Config.TABLE + " where 'http://purl.org/dc/terms/BibliographicResource' = ANY("
					+ Codes.RDF_TYPE + ") and (LOWER(" + Codes.DCTERMS_TITLE + ") LIKE '%studie%' OR LOWER(" + Codes.DCTERMS_TITLE + ") LIKE '%study%')");
			break;
		case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP:

			// XXX: @Timm The select statement does not use this index :/
			statement.execute("DROP INDEX IF EXISTS idx_identifier");
			statement.execute("CREATE INDEX idx_identifier on \"" + Config.TABLE + "\" (\"" + Codes.DCTERMS_IDENTIFIER.toString().toLowerCase() + "\")");

			statement.execute("DROP INDEX IF EXISTS idx_subjects");
			statement.execute("CREATE INDEX idx_subjects on \"" + Config.TABLE + "\" USING GIN (\"" + Codes.DCTERMS_SUBJECT.toString().toLowerCase() + "\")");

			// http://www.postgresql.org/docs/8.3/static/functions-array.html
			preparedScenarioStatement = connection.prepareStatement(
					"select * from (SELECT dcterms_identifier, unnest(dcterms_subject) subject FROM justatable) level0 inner join (SELECT dcterms_identifier, unnest(dcterms_subject) subject FROM justatable) level1 on level0.subject = level1.subject and level0.dcterms_identifier != level1.dcterms_identifier");
			break;
		case UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM:
			statement = connection.createStatement();
			// XXX: @Timm The select statement does not use this index :/
			statement.execute("DROP INDEX IF EXISTS idx_types");
			statement.execute("CREATE INDEX idx_types on \"" + Config.TABLE + "\" USING GIN (\"" + Codes.DCTERMS_SUBJECT.toString().toLowerCase() + "\")");

			preparedScenarioStatement = connection.prepareStatement("select * from justatable where 'http://purl.org/dc/terms/BibliographicResource' = ANY(rdf_type)");
			break;

		default:
			throw new RuntimeException("Do not know what to do with QueryScenario " + queryScenario);
		}
	}

	@Override
	public String query(QueryScenario queryScenario) throws Exception {
		if (preparedScenarioStatement == null)
			throw new RuntimeException("There is no preparedStatement for QueryScenario " + queryScenario);

		ResultSet resultSet = preparedScenarioStatement.executeQuery();

		return null;
	}

	private void reopenConnection(boolean readonly) throws Exception {
		props.setProperty("ReadOnly", readonly ? "true" : "false");

		if (connection != null && !connection.isClosed())
			connection.close();

		if (connection == null || connection.isClosed())
			connection = DriverManager.getConnection("jdbc:postgresql://" + Config.HOST_POSTGRES + "/" + Config.DATABASE, props);
	}

}
