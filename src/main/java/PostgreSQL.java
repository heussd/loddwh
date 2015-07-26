import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Properties;
import java.util.concurrent.SynchronousQueue;

import com.hp.hpl.jena.vocabulary.DCTerms;

import util.Codes;
import util.Config;
import util.DataObject;
import util.Dataset;
import util.QueryScenario;
import util.dumper.Helpers;

public class PostgreSQL extends Helpers implements Database {

	private Connection connection;
	private PreparedStatement dropTable;
	private PreparedStatement insertStatement;
	private PreparedStatement createTable;
	private HashMap<QueryScenario, PreparedStatement> scenarioQueries = new HashMap<>();

	public static void main(String[] args) throws Exception {

		Dataset dataset = Dataset.hebis_tiny_rdf;

		PostgreSQL postgreSQL = new PostgreSQL();

		// postgreSQL.setUp();

		postgreSQL.initialize();

		// Load first dump, this is time critical
		// postgreSQL.load(dataset);

		postgreSQL.verifyEntityWrite("268876681");
		postgreSQL.query(QueryScenario.CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES);
	}

	private void loadASingleDataObject(DataObject dataObject) {
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
	}

	@Override
	public void load(Dataset dataset) throws Exception {
		readRdf(dataset, dataObject -> {
			loadASingleDataObject(dataObject);
		});
	}

	@Override
	public void setUp() throws Exception {
		String url = "jdbc:postgresql://localhost/postgres";
		Properties props = new Properties();
		props.setProperty("user", Config.USER);
		props.setProperty("password", Config.PASSWORD);
		Connection connection = DriverManager.getConnection(url, props);

		PreparedStatement preparedStatement = connection.prepareStatement("DROP DATABASE " + Config.DATABASE);
		preparedStatement.execute();

		preparedStatement = connection.prepareStatement("CREATE DATABASE " + Config.DATABASE);
		preparedStatement.execute();

		preparedStatement.close();
		connection.close();
	}

	@Override
	public void initialize() throws Exception {
		String url = "jdbc:postgresql://localhost/postgres";
		url = "jdbc:postgresql://localhost/" + Config.DATABASE;
		Properties props = new Properties();
		props.setProperty("user", Config.USER);
		props.setProperty("password", Config.PASSWORD);
		connection = DriverManager.getConnection(url, props);

		dropTable = connection.prepareStatement("DROP TABLE " + Config.TABLE);

		String createQuery = "CREATE TABLE " + Config.TABLE + " ( \n";
		String genericInsertStatement = "insert into " + Config.TABLE + " (";
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
		insertStatement = connection.prepareStatement(genericInsertStatement);
		createTable = connection.prepareStatement(createQuery);

		for (QueryScenario queryScenario : QueryScenario.values()) {
			PreparedStatement preparedStatement = null;

			switch (queryScenario) {
			case ENTITY_RETRIEVAL_BY_ID_CASE1:
				preparedStatement = connection.prepareStatement("select * from " + Config.TABLE + " where " + Codes.DCTERMS_IDENTIFIER + " = '268893950'");
				break;
			case AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10:
				preparedStatement = connection.prepareStatement("select " + Codes.DCTERMS_PUBLISHER + ", count(" + Codes.DCTERMS_PUBLISHER + ") from " + Config.TABLE + " group by "
						+ Codes.DCTERMS_PUBLISHER + " order by count(" + Codes.DCTERMS_PUBLISHER + ") desc limit 10");
				break;
			case AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100:
				preparedStatement = connection.prepareStatement("select " + Codes.DCTERMS_PUBLISHER + ", count(" + Codes.DCTERMS_PUBLISHER + ") from " + Config.TABLE + " group by "
						+ Codes.DCTERMS_PUBLISHER + " order by count(" + Codes.DCTERMS_PUBLISHER + ") desc limit 100");
				break;
			case AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL:
				preparedStatement = connection.prepareStatement("select " + Codes.DCTERMS_PUBLISHER + ", count(" + Codes.DCTERMS_PUBLISHER + ") from " + Config.TABLE + " group by "
						+ Codes.DCTERMS_PUBLISHER + " order by count(" + Codes.DCTERMS_PUBLISHER + ") desc");
				break;
			case AGGREGATE_ISSUES_PER_CENTURY_ALL:
				preparedStatement = connection.prepareStatement("select SUBSTR(" + Codes.DCTERMS_ISSUED + ", 1, 3), count(" + Codes.DCTERMS_IDENTIFIER
						+ ") from justatable group by SUBSTR(" + Codes.DCTERMS_ISSUED + ", 1, 3) order by SUBSTR(" + Codes.DCTERMS_ISSUED + ", 1, 3)");
				break;
			case CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES:
				preparedStatement = connection.prepareStatement("select * from " + Config.TABLE + " where 'http://purl.org/dc/terms/BibliographicResource' = ANY(" + Codes.RDF_TYPE
						+ ") and (LOWER(" + Codes.DCTERMS_TITLE + ") LIKE '%studie%' OR LOWER(" + Codes.DCTERMS_TITLE + ") LIKE '%study%')");
				break;
			default:
				break;
			// throw new RuntimeException("Do not know what to do with
			// QueryScenario " + queryScenario);
			}

			scenarioQueries.put(queryScenario, preparedStatement);
		}

		try {
			dropTable.execute();
		} catch (Exception e) { // Ignore if dropping fails.
		}
		;
		createTable.execute();
	}

	@Override
	public String getName() {
		return "PostgreSQL (Postgres.app)";
	}

	@Override
	public String getVersion() {
		return "9.4.4 / PostGIS 2.1.7 / 9.4-1201-jdbc41";
	}

	@Override
	public void verifyEntityWrite(String id) throws Exception {
		PreparedStatement statement = connection.prepareStatement("select " + Codes.DCTERMS_IDENTIFIER + " from " + Config.TABLE + " where " + Codes.DCTERMS_IDENTIFIER + "=?");

		statement.setString(1, id);

		ResultSet resultSet = statement.executeQuery();

		boolean idFound = false;
		while (resultSet.next()) {
			if (idFound)
				throw new DatabaseException("ID " + id + " found multiple times");

			if (resultSet.getString(1).equals(id)) {
				idFound = true;
			}
		}
		if (!idFound)
			throw new DatabaseException("ID " + id + " not found");
	}

	@Override
	public String query(QueryScenario queryScenario) throws Exception {
		PreparedStatement preparedStatement = scenarioQueries.get(queryScenario);
		if (preparedStatement == null)
			throw new RuntimeException("There is no preparedStatement for QueryScenario " + queryScenario);

		ResultSet resultSet = preparedStatement.executeQuery();

		return null;
	}

}
