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
import util.dumper.Helpers;

public class PostgreSQL extends Helpers implements Database {

	private Connection connection;
	private Properties props;
	private String createQuery;
	private String genericInsertStatement;
	private ArrayList<PreparedStatement> scenarioStatements;
	private QueryScenario queryScenario;

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

		QueryScenario queryScenario = QueryScenario.SCHEMA_CHANGE_MIGRATE_RDF_TYPE;

		postgreSQL.setUp();
		postgreSQL.load(dataset);
		postgreSQL.clear(queryScenario);
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

		PreparedStatement preparedStatement = connection.prepareStatement("DROP DATABASE IF EXISTS " + Config.DATABASE);
		// try {
		preparedStatement.execute();
		// } catch (Exception e) {
		// }

		preparedStatement = connection.prepareStatement("CREATE DATABASE " + Config.DATABASE);
		preparedStatement.execute();

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

		Statement statement = connection.createStatement();
		if (scenarioStatements == null)
			scenarioStatements = new ArrayList<>();

		scenarioStatements.clear();
		switch (queryScenario) {
		case ENTITY_RETRIEVAL_BY_ID_CASE1:
			scenarioStatements.add(connection.prepareStatement("select * from " + Config.TABLE + " where " + Codes.DCTERMS_IDENTIFIER + " = '268893950'"));
			break;
		case AGGREGATE_ISSUES_PER_CENTURY_TOP10:
			// https://stackoverflow.com/questions/13674031/how-to-get-the-top-10-values-in-postgresql
			scenarioStatements.add(connection.prepareStatement("select SUBSTR(" + Codes.DCTERMS_ISSUED + ", 1, 3), count(" + Codes.DCTERMS_IDENTIFIER
					+ ") from justatable group by SUBSTR(" + Codes.DCTERMS_ISSUED + ", 1, 3) order by SUBSTR(" + Codes.DCTERMS_ISSUED + ", 1, 3) top 10"));
			break;
		case AGGREGATE_ISSUES_PER_CENTURY_TOP100:
			scenarioStatements.add(connection.prepareStatement("select SUBSTR(" + Codes.DCTERMS_ISSUED + ", 1, 3), count(" + Codes.DCTERMS_IDENTIFIER
					+ ") from justatable group by SUBSTR(" + Codes.DCTERMS_ISSUED + ", 1, 3) order by SUBSTR(" + Codes.DCTERMS_ISSUED + ", 1, 3) top 100"));
			break;
		case AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10:
			scenarioStatements.add(connection.prepareStatement("select " + Codes.DCTERMS_PUBLISHER + ", count(" + Codes.DCTERMS_PUBLISHER + ") from " + Config.TABLE + " group by "
					+ Codes.DCTERMS_PUBLISHER + " order by count(" + Codes.DCTERMS_PUBLISHER + ") desc limit 10"));
			break;
		case AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100:
			scenarioStatements.add(connection.prepareStatement("select " + Codes.DCTERMS_PUBLISHER + ", count(" + Codes.DCTERMS_PUBLISHER + ") from " + Config.TABLE + " group by "
					+ Codes.DCTERMS_PUBLISHER + " order by count(" + Codes.DCTERMS_PUBLISHER + ") desc limit 100"));
			break;
		case AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL:
			scenarioStatements.add(connection.prepareStatement("select " + Codes.DCTERMS_PUBLISHER + ", count(" + Codes.DCTERMS_PUBLISHER + ") from " + Config.TABLE + " group by "
					+ Codes.DCTERMS_PUBLISHER + " order by count(" + Codes.DCTERMS_PUBLISHER + ") desc"));
			break;
		case AGGREGATE_ISSUES_PER_CENTURY_ALL:
			scenarioStatements.add(connection.prepareStatement("select SUBSTR(" + Codes.DCTERMS_ISSUED + ", 1, 3), count(" + Codes.DCTERMS_IDENTIFIER
					+ ") from justatable group by SUBSTR(" + Codes.DCTERMS_ISSUED + ", 1, 3) order by SUBSTR(" + Codes.DCTERMS_ISSUED + ", 1, 3)"));
			break;
		case CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES:
			scenarioStatements.add(connection.prepareStatement("select * from " + Config.TABLE + " where 'http://purl.org/dc/terms/BibliographicResource' = ANY(" + Codes.RDF_TYPE
					+ ") and (LOWER(" + Codes.DCTERMS_TITLE + ") LIKE '%studie%' OR LOWER(" + Codes.DCTERMS_TITLE + ") LIKE '%study%')"));
			break;
		case CONDITIONAL_TABLE_SCAN_ALL_STUDIES:
			scenarioStatements.add(connection.prepareStatement(
					"select * from " + Config.TABLE + " where (LOWER(" + Codes.DCTERMS_TITLE + ") LIKE '%studie%' OR LOWER(" + Codes.DCTERMS_TITLE + ") LIKE '%study%')"));
			break;
		case CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES:
			scenarioStatements
					.add(connection.prepareStatement("select * from " + Config.TABLE + " where 'http://purl.org/dc/terms/BibliographicResource' = ANY(" + Codes.RDF_TYPE + ")"));
			break;
		case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP:
			// XXX: @Timm The select statement does not use this index :/
			statement.execute("DROP INDEX IF EXISTS idx_identifier");
			statement.execute("CREATE INDEX idx_identifier on \"" + Config.TABLE + "\" (\"" + Codes.DCTERMS_IDENTIFIER.toString().toLowerCase() + "\")");

			statement.execute("DROP INDEX IF EXISTS idx_subjects");
			statement.execute("CREATE INDEX idx_subjects on \"" + Config.TABLE + "\" USING GIN (\"" + Codes.DCTERMS_SUBJECT.toString().toLowerCase() + "\")");

			// http://www.postgresql.org/docs/8.3/static/functions-array.html
			scenarioStatements.add(connection.prepareStatement(
					"select * from (SELECT dcterms_identifier, unnest(dcterms_subject) subject FROM justatable) level0 inner join (SELECT dcterms_identifier, unnest(dcterms_subject) subject FROM justatable) level1 on level0.subject = level1.subject and level0.dcterms_identifier != level1.dcterms_identifier"));
			break;
		case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS:
			break;
		case SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY:
			scenarioStatements.add(connection.prepareStatement("alter table " + Config.TABLE + " add column " + Config.NEWCOLUMN + " text default 'cheesecake'"));
			break;
		case SCHEMA_CHANGE_INTRODUCE_STRING_OP:
			scenarioStatements.add(connection.prepareStatement("alter table " + Config.TABLE + " add column " + Config.NEWCOLUMN + " text"));
			scenarioStatements.add(connection.prepareStatement("update " + Config.TABLE + " set RDF_ABOUT=substring(RDF_ABOUT from '........$')"));
			break;
		case SCHEMA_CHANGE_MIGRATE_RDF_TYPE:
			scenarioStatements.add(connection.prepareStatement("alter table " + Config.TABLE + " add column manifestation boolean default false"));
			scenarioStatements
					.add(connection.prepareStatement("update " + Config.TABLE + " set manifestation = true where 'http://purl.org/vocab/frbr/core#Manifestation' = ANY(RDF_TYPE)"));
			scenarioStatements.add(connection.prepareStatement("alter table " + Config.TABLE + " add column bibliographicresource boolean default false"));
			scenarioStatements.add(connection
					.prepareStatement("update " + Config.TABLE + " set bibliographicresource = true where 'http://purl.org/dc/terms/BibliographicResource' = ANY(RDF_TYPE)"));
			scenarioStatements.add(connection.prepareStatement("alter table " + Config.TABLE + " add column book boolean default false"));
			scenarioStatements.add(connection.prepareStatement("update " + Config.TABLE + " set book = true where 'http://purl.org/ontology/bibo/Book' = ANY(RDF_TYPE)"));
			scenarioStatements.add(connection.prepareStatement("alter table " + Config.TABLE + " drop column RDF_TYPE"));
			break;
		case SCHEMA_CHANGE_REMOVE_RDF_TYPE:
			scenarioStatements.add(connection.prepareStatement("alter table " + Config.TABLE + " drop column RDF_TYPE"));
			break;
		case UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM:
			statement = connection.createStatement();
			// XXX: @Timm The select statement does not use this index :/
			statement.execute("DROP INDEX IF EXISTS idx_types");
			statement.execute("CREATE INDEX idx_types on \"" + Config.TABLE + "\" USING GIN (\"" + Codes.DCTERMS_SUBJECT.toString().toLowerCase() + "\")");

			scenarioStatements.add(connection.prepareStatement("select * from " + Config.TABLE + " where 'http://purl.org/dc/terms/BibliographicResource' = ANY(rdf_type)"));
			break;
		case UPDATE_HIGH_SELECTIVITY_NON_ISSUED:
			scenarioStatements.add(connection.prepareStatement("update " + Config.TABLE + " set dcterms_issued = '0' where dcterms_issued is null"));
			break;
		case DELETE_LOW_SELECTIVITY_PAPER_MEDIUM:
			scenarioStatements.add(connection.prepareStatement("delete from " + Config.TABLE + " where DCTERMS_MEDIUM = 'paper'"));
			break;
		case DELETE_HIGH_SELECTIVIY_NON_ISSUED:
			scenarioStatements.add(connection.prepareStatement("delete from " + Config.TABLE + " where DCTERMS_ISSUED is null"));
			break;
		default:
			throw new RuntimeException("Do not know what to do with QueryScenario " + queryScenario);
		}
		this.queryScenario = queryScenario;
	}

	@Override
	public String query(QueryScenario queryScenario) throws Exception {
		if (scenarioStatements == null || this.queryScenario != queryScenario)
			throw new RuntimeException("There is no preparedStatement for QueryScenario " + queryScenario);

		for (PreparedStatement preparedStatement : scenarioStatements) {
			if (queryScenario.isReadOnly) {
				preparedStatement.executeQuery();
			} else {
				preparedStatement.executeUpdate();
			}
		}

		return null;
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
}
