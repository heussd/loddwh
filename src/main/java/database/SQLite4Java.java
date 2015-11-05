package database;

import java.io.File;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;
import org.json.JSONArray;

import com.almworks.sqlite4java.SQLiteConnection;
import com.almworks.sqlite4java.SQLiteJob;
import com.almworks.sqlite4java.SQLiteQueue;
import com.almworks.sqlite4java.SQLiteStatement;
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

public class SQLite4Java extends Helpers implements Database {

	private static final int COMMIT_EVERY_N_RECORDS = Config.COMMIT_EVERY_N_RECORDS;
	private static final File DATABASE_FILE = new File("sqlite4java.db");
	private SQLiteConnection connection;
	private String createQuery;
	private String genericInsertStatement;
	private ArrayList<SQLiteStatement> scenarioStatements;
	private QueryScenario queryScenario;
	private Templates templates;
	private SQLiteQueue queue;
	private ArrayList<Dataset> lastLoadedDatasets = new ArrayList<>();
	private boolean graphStructurePrepared = false;

	public SQLite4Java() {
		// Disable logging of sqlite4java
		java.util.logging.Logger.getLogger("com.almworks.sqlite4java").setLevel(java.util.logging.Level.OFF);

		// Produce some queries based on Config / Codes enums - do not prepare
		// statements as PreparedStatements is part of the load() or prepare().
		createQuery = "CREATE TABLE " + Config.TABLE + " ( \n";
		genericInsertStatement = "insert into " + Config.TABLE + " (";
		for (int i = 0; i < Codes.values().length; i++) {
			Codes code = Codes.values()[i];
			createQuery += " " + code.toString() + " text";
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

	private SQLiteStatement makeInsertStatement(DataObject dataObject) throws Exception {
		SQLiteStatement insertStatement = connection.prepare(genericInsertStatement);

		for (int i = 0; i < Codes.values().length; i++) {
			Codes code = Codes.values()[i];
			if (dataObject.get(code) != null) {
				Object value = dataObject.get(code);

				if (code.IS_MULTIPLE) {
					value = new JSONArray((ArrayList) value).toString();
				}
				insertStatement.bind(i + 1, (String) value);
			}
		}
		return insertStatement;
	}

	@Override
	public String getName() {
		return "sqlite4java";
	}

	@Override
	public String getVersion() {
		return "392 with SQLite 3.8.7";
	}

	@Override
	public void setUp() throws Exception {
		clean();
		reopenConnection(false);

		connection.exec(createQuery);
		lastLoadedDatasets.clear();
	}

	@Override
	public void load(Dataset dataset) throws Exception {
		// Auto commit setting:
		// https://stackoverflow.com/questions/4998630/how-to-disable-autocommit-in-sqlite4java#5005785
		connection.exec("BEGIN");

		readRdf(dataset, dataObject -> {
			try {
				SQLiteStatement insertStatement = makeInsertStatement(dataObject);
				insertStatement.step();
				insertStatement.clearBindings();
			} catch (Exception e) {
				throw new RuntimeException("Cannot insert DataObject: " + dataObject, e);
			}
		} , counter -> {
			try {
				if (counter % COMMIT_EVERY_N_RECORDS == 0) {
					connection.exec("COMMIT");
					connection.exec("BEGIN");
				}
			} catch (Exception e) {
				throw new RuntimeException("Cannot commit at " + counter + " entities", e);
			}
		});

		connection.exec("COMMIT");
		this.lastLoadedDatasets.add(dataset);
	}

	private void reopenConnection(boolean readonly) {
		try {
			// if (connection != null && connection.isOpen())
			//// connection.c;
			//
			// // connection = DriverManager.getConnection("jdbc:sqlite:" +
			// // Config.DATABASE + ".db");
			if (connection == null) {
				connection = new SQLiteConnection(DATABASE_FILE);

				// if (readonly)
				// connection.openReadonly();
				// else
				connection.open(true);
			}
			queue = new SQLiteQueue(DATABASE_FILE);

			// connection.is
			// connection = sqLiteConfig.createConnection("jdbc:sqlite:" +
			// Config.DATABASE + ".db");
		} catch (Exception e) {
			throw new RuntimeException("Cannot open connection", e);
		}
	}

	@Override
	public void prepare(QueryScenario queryScenario) throws Exception {
		// reopenConnection(queryScenario.isReadOnly);

		if (scenarioStatements == null)
			scenarioStatements = new ArrayList<>();

		scenarioStatements.clear();

		queue.start();
		queue.execute(new SQLiteJob<Object>() {

			@Override
			protected Object job(SQLiteConnection connection) throws Throwable {
				connection.exec("BEGIN");
				return null;
			}
		});
		// SQL queries / prepared statements to be executed before the actual
		// QueryScenario statement
		switch (queryScenario) {
		case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY:
		case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES:
		case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES:
			// case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY:
			// case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES:
			// case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES:
			if (!this.graphStructurePrepared) {
				connection.exec("drop table if exists subjects");
				connection.exec("create table subjects (id text, subject text)");
				connection.exec("create index if not exists idxid on subjects (id)");
				connection.exec("create index if not exists idxsubjects on subjects (subject)");

				connection.exec("BEGIN");

				// Resolve multiple dcterms_subject in a new table
				for (Dataset lastLoadedDataset : lastLoadedDatasets) {
					readRdf(lastLoadedDataset, dataObject -> {
						try {
							if (dataObject.get(Codes.DCTERMS_SUBJECT) != null) {
								for (String oneSubject : (ArrayList<String>) dataObject.get(Codes.DCTERMS_SUBJECT)) {
									connection.exec("insert into subjects values ('" + dataObject.getId() + "','" + oneSubject + "')");
								}
							}
						} catch (Exception e) {
							throw new RuntimeException("Cannot insert", e);
						}

					} , counter -> {
						if (counter % COMMIT_EVERY_N_RECORDS == 0) {
							try {
								connection.exec("COMMIT");
								connection.exec("BEGIN");
							} catch (Exception e) {
							}
						}
					});
				}
				connection.exec("COMMIT");
				this.graphStructurePrepared = true;
			}
			break;
		case SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY:
		case SCHEMA_CHANGE_REMOVE_RDF_TYPE:
			break;
		default:
			queue.execute(new SQLiteJob<Object>() {

				@Override
				protected Object job(SQLiteConnection connection) throws Throwable {
					connection.exec(templates.resolve(queryScenario + "_prepare"));
					return null;
				}
			});
		}

		queue.execute(new SQLiteJob<Object>() {

			@Override
			protected Object job(SQLiteConnection connection) throws Throwable {
				connection.exec("COMMIT");
				return null;
			}
		});

		queue.stop(true).join();

		SQLiteStatement preparedStatement = connection.prepare(templates.resolve(queryScenario));

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

			SQLiteStatement statement = connection.prepare(query);
			ArrayList<String> ids = new ArrayList<>();
			while (statement.step()) {
				ids.add("'" + statement.columnString(0) + "'");
			}

			// I have no idea why this does not work...
			// preparedStatement.bind(1, Joiner.on(",").join(ids));
			preparedStatement = connection.prepare("select * from justatable where dcterms_identifier in (" + Joiner.on(",").join(ids) + ")");
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

			SQLiteStatement statement = connection.prepare(query);
			ArrayList<String> ids = new ArrayList<>();
			while (statement.step()) {
				ids.add("'" + statement.columnString(0) + "'");
			}

			// I have no idea why this does not work...
			// preparedStatement.setString(1, Joiner.on(",").join(ids));

			String queryString = templates.resolve(queryScenario);
			queryString += " where level0.id in (" + Joiner.on(",").join(ids) + ")";
			preparedStatement = connection.prepare(queryString);
		}

		this.queryScenario = queryScenario;
		this.scenarioStatements.add(preparedStatement);
	}

	@Override
	public QueryResult query(QueryScenario queryScenario) throws Exception {
		if (scenarioStatements == null || this.queryScenario != queryScenario)
			throw new RuntimeException("There is no preparedStatement for QueryScenario " + queryScenario);

		QueryResult queryResult = new QueryResult(queryScenario.queryResultType);

		// Auto commit setting:
		// https://stackoverflow.com/questions/4998630/how-to-disable-autocommit-in-sqlite4java#5005785
		connection.exec("BEGIN");

		for (SQLiteStatement preparedStatement : scenarioStatements) {
			switch (queryScenario.queryResultType) {
			case GRAPH:
				while (preparedStatement.step()) {
					switch (queryScenario) {
					case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY:
					case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES:
						 case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES:
						queryResult.push(preparedStatement.columnString(0), preparedStatement.columnString(1), preparedStatement.columnString(2));
						break;
//					case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY:
//					case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES:
						// case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES:
					// queryResult.push(preparedStatement.columnString(0), preparedStatement.columnString(1), preparedStatement.columnString(2),
					// preparedStatement.columnString(3), preparedStatement.columnString(4));
					// break;
					default:
						throw new RuntimeException("Unknown case");
					}
				}
				break;
			case TWO_COLUMNS:
				while (preparedStatement.step()) {
					queryResult.push(preparedStatement.columnString(0), preparedStatement.columnString(1));
				}
				break;
			case COMPLETE_ENTITIES:
				while (preparedStatement.step()) {
					DataObject dataObject = new DataObject();
					for (Codes code : Codes.values()) {
						if (preparedStatement.columnNull(code.ordinal())) {
							dataObject.set(code, null);
							continue;
						}
						if (code.IS_MULTIPLE) {
							// https://stackoverflow.com/questions/3395729/convert-json-array-to-normal-java-array
							JSONArray jsonArray = new JSONArray(preparedStatement.columnString(code.ordinal()));
							if (jsonArray != null) {
								int len = jsonArray.length();
								for (int i = 0; i < len; i++) {
									dataObject.putMultiple(code, jsonArray.get(i).toString());
								}
							}
						} else {
							dataObject.set(code, preparedStatement.columnString(code.ordinal()));
						}
					}
					queryResult.push(dataObject);
				}
				break;

			case NONE:
			default:
				preparedStatement.step();
				break;
			}

		}

		connection.exec("COMMIT");
		return queryResult;
	}

	public static void main(String[] args) throws Exception {

		SQLite4Java sqLiteXerial = new SQLite4Java();
		sqLiteXerial.start();
		sqLiteXerial.clean();
		sqLiteXerial.setUp();
		sqLiteXerial.load(Dataset.hebis_10000_records);

		QueryScenario queryScenario = QueryScenario.ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY;

		sqLiteXerial.prepare(queryScenario);
		QueryResult queryResult = sqLiteXerial.query(queryScenario);

		// System.out.println(queryResult);
		//
		// queryScenario =
		// QueryScenario.AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10;
		// sqLiteXerial.prepare(queryScenario);
		// System.out.println(sqLiteXerial.query(queryScenario));

		sqLiteXerial.stop();
	}

	@Override
	public void clean() throws Exception {
		// reopenConnection(false);
		// connection.exec("drop table if exists " + Config.TABLE);
		FileUtils.deleteQuietly(DATABASE_FILE);
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
		return "SQLite4Java [getName()=" + getName() + ", getVersion()=" + getVersion() + "]";
	}
}
