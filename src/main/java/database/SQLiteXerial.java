package database;

import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;
import org.json.JSONArray;
import org.sqlite.SQLiteConfig;

import com.google.common.base.Joiner;

import util.Codes;
import util.Config;
import util.DataObject;
import util.Dataset;
import util.QueryResult;
import util.QueryResult.Type;
import util.QueryScenario;
import util.Templates;
import util.dumper.Helpers;

public class SQLiteXerial extends Helpers implements Database {

	private static final Integer COMMIT_EVERY_N_RECORDS = Config.COMMIT_EVERY_N_RECORDS;
	private Connection connection;
	private String createQuery;
	private String genericInsertStatement;
	private ArrayList<PreparedStatement> scenarioStatements;
	private QueryScenario queryScenario;
	private Templates templates;
	private ArrayList<Dataset> lastLoadedDatasets = new ArrayList<>();
	private boolean graphStructurePrepared = false;
	private ArrayList<String> scenarioQueries = new ArrayList<>();
	private ArrayList<String> ids;
	private String queryString;

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

		templates = new Templates("sqlite", ".sql");
	}

	@Override
	public String getName() {
		return "SQLite-Xerial";
	}

	@Override
	public String getVersion() {
		return "3.8.11";
	}

	@Override
	public void setUp() throws Exception {
		clean();
		reopenConnection(false);

		PreparedStatement createTable = connection.prepareStatement(createQuery);
		createTable.execute();
		lastLoadedDatasets.clear();
	}

	@Override
	public void load(Dataset dataset) throws Exception {
		connection.setAutoCommit(false);

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
		} , counter -> {
			if (counter % COMMIT_EVERY_N_RECORDS == 0)
				try {
					connection.commit();
				} catch (Exception e) {
					throw new RuntimeException(e);
				}
		});
		connection.commit();
		this.lastLoadedDatasets.add(dataset);
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
		case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY:
		case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES:
		case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES:
			// case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY:
			// case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES:
			// case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES:
			if (!this.graphStructurePrepared) {
				connection.createStatement().executeUpdate("drop table if exists subjects");
				connection.createStatement().executeUpdate("create table subjects (id text, subject text)");

				for (Dataset lastLoadedDataset : lastLoadedDatasets) {
					// Resolve multiple dcterms_subject in a new table
					readRdf(lastLoadedDataset, dataObject -> {
						try {
							if (dataObject.get(Codes.DCTERMS_SUBJECT) != null) {
								for (String oneSubject : (ArrayList<String>) dataObject.get(Codes.DCTERMS_SUBJECT)) {
									connection.createStatement()
											.executeUpdate("insert into subjects values ('" + dataObject.getId() + "','" + oneSubject + "')");
								}
							}
						} catch (Exception e) {
							throw new RuntimeException("Cannot insert", e);
						}

					} , counter -> {
						if (counter % COMMIT_EVERY_N_RECORDS == 0)
							try {
								connection.commit();
							} catch (Exception e) {
							}
					});
				}

				connection.createStatement().executeUpdate("create index if not exists idxid on subjects (id)");
				connection.createStatement().executeUpdate("create index if not exists idxsubjects on subjects (subject)");
				this.graphStructurePrepared = true;
			}
			break;
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
		PreparedStatement preparedStatement = connection.prepareStatement(templates.resolve(queryScenario));

		// Prepare IDs for ENTITY_RETRIEVAL scenarios
		if (queryScenario.equals(QueryScenario.ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY) || queryScenario.equals(QueryScenario.ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES)
				|| queryScenario.equals(QueryScenario.ENTITY_RETRIEVAL_BY_ID_100_ENTITIES)) {
			String query = "select DCTERMS_IDENTIFIER from justatable order by dcterms_medium, isbd_p1008, dcterm_contributor, dcterms_issued, dcterms_identifier limit";
			switch (queryScenario) {
			case ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY:
				query += " 1;";
				break;
			case ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES:
				query += " 10;";
				break;
			case ENTITY_RETRIEVAL_BY_ID_100_ENTITIES:
				query += " 100;";
				break;
			default:
			}

			ResultSet resultSet = connection.createStatement().executeQuery(query);
			ArrayList<String> ids = new ArrayList<>();
			while (resultSet.next()) {
				ids.add("'" + resultSet.getString(1) + "'");
			}

			// I have no idea why this does not work...
			// preparedStatement.setString(1, Joiner.on(",").join(ids));
			this.ids = ids;
			preparedStatement = connection.prepareStatement("select * from justatable where dcterms_identifier in (?)");
		} else if (queryScenario.queryResultType == Type.GRAPH) {
			// Prepare IDs for ENTITY_RETRIEVAL scenarios

			String query = "select DCTERMS_IDENTIFIER from justatable where dcterms_subject not null order by dcterms_medium, isbd_p1008, dcterm_contributor, dcterms_issued, dcterms_identifier limit";
			switch (queryScenario) {
			// case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES:
			case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES:
				query += " 100;";
				break;
			case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES:
				// case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES:
				query += " 10;";
				break;
			case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY:
				// case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY:
				query += " 1;";
				break;
			default:
				throw new RuntimeException("Dont know how to limit " + queryScenario);
			}

			ResultSet resultSet = connection.createStatement().executeQuery(query);
			ArrayList<String> ids = new ArrayList<>();
			while (resultSet.next()) {
				ids.add("'" + resultSet.getString(1) + "'");
			}

			// I have no idea why this does not work...
			// preparedStatement.setString(1, Joiner.on(",").join(ids));

			String queryString = templates.resolve(queryScenario);
//			queryString += " where level0.id in (?)";
			preparedStatement = connection.prepareStatement(queryString);
			this.ids = ids;
			this.queryString = queryString;
		} else if (queryScenario.toString().startsWith("SCHEMA_")) {
			// System.out.println(queryScenario);
			scenarioQueries.clear();
			String queries = templates.resolve(queryScenario);
			for (String query : queries.split(";")) {
				if (query != null)
					scenarioQueries.add(query);
			}

		}

		this.queryScenario = queryScenario;
		this.scenarioStatements.add(preparedStatement);
	}

	@Override
	public QueryResult query(QueryScenario queryScenario) throws Exception {
		if (scenarioStatements == null || this.queryScenario != queryScenario)
			throw new RuntimeException("There is no preparedStatement for QueryScenario " + queryScenario);

		QueryResult queryResult = new QueryResult(queryScenario.queryResultType);

		for (PreparedStatement preparedStatement : scenarioStatements) {
			ResultSet resultSet;
			switch (queryScenario.queryResultType) {
			case GRAPH:
//				preparedStatement.setString(1, Joiner.on(",").join(ids));
				preparedStatement = connection.prepareStatement(queryString + " where level0.id in (" + Joiner.on(",").join(ids) + ")");

				resultSet = preparedStatement.executeQuery();
				while (resultSet.next()) {
					switch (resultSet.getMetaData().getColumnCount()) {
					case 3:
						queryResult.push(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3));
						break;
					case 5:
						queryResult.push(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4),
								resultSet.getString(5));
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
				if (queryScenario.toString().startsWith("ENTITY_RETRIEVAL")) {
					// preparing does not work :/
					preparedStatement = connection.prepareStatement("select * from justatable where dcterms_identifier in (" + Joiner.on(",").join(ids) + ")");
				}
				resultSet = preparedStatement.executeQuery();
				while (resultSet.next()) {
					DataObject dataObject = new DataObject();
					for (Codes code : Codes.values()) {
						if (resultSet.getObject(code.ordinal() + 1) == null) {
							dataObject.set(code, null);
							continue;
						}
						if (code.IS_MULTIPLE) {
							// https://stackoverflow.com/questions/3395729/convert-json-array-to-normal-java-array
							JSONArray jsonArray = new JSONArray(resultSet.getString(code.ordinal() + 1));
							if (jsonArray != null) {
								int len = jsonArray.length();
								for (int i = 0; i < len; i++) {
									dataObject.putMultiple(code, jsonArray.get(i).toString());
								}
							}
						} else {
							dataObject.set(code, resultSet.getString(code.ordinal() + 1));
						}
					}
					queryResult.push(dataObject);
				}
				break;

			case NONE:
			default:
				if (queryScenario.toString().startsWith("SCHEMA_")) {
					for (String query : scenarioQueries) {
						// System.out.println("EXEC : " + query);
						connection.createStatement().executeUpdate(query);
					}

				} else {
					preparedStatement.executeUpdate();
				}
				break;
			}
		}
		connection.commit();
		return queryResult;
	}

	public static void main(String[] args) throws Exception {
		Database database = new SQLiteXerial();
		database.start();
		database.clean();
		database.setUp();
		database.load(Dataset.hebis_100000_records);

		QueryScenario queryScenario = QueryScenario.ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY;
//		 queryScenario = QueryScenario.GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY;
		database.prepare(queryScenario);
		QueryResult queryResult = database.query(queryScenario);
		System.out.println(queryResult);

		queryScenario = QueryScenario.ENTITY_RETRIEVAL_BY_ID_100_ENTITIES;
//		 queryScenario = QueryScenario.GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES;
		database.prepare(queryScenario);
		queryResult = database.query(queryScenario);
		System.out.println(queryResult);

		// queryScenario = QueryScenario.GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY;
		// database.prepare(queryScenario);
		// queryResult = database.query(queryScenario);
		// System.out.println(queryResult);

		database.stop();
	}

	@Override
	public void clean() throws Exception {
		FileUtils.deleteQuietly(new File("sqlitexerial.db"));
		// reopenConnection(false);
		// connection.prepareStatement("drop table if exists " +
		// Config.TABLE).executeUpdate();
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub

	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "SQLiteXerial [getName()=" + getName() + ", getVersion()=" + getVersion() + "]";
	}
}
