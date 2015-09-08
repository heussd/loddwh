package database;

import java.io.File;
import java.util.ArrayList;

import org.json.JSONArray;

import com.almworks.sqlite4java.SQLiteConnection;
import com.almworks.sqlite4java.SQLiteJob;
import com.almworks.sqlite4java.SQLiteQueue;
import com.almworks.sqlite4java.SQLiteStatement;

import util.Codes;
import util.Config;
import util.DataObject;
import util.Dataset;
import util.QueryResult;
import util.QueryScenario;
import util.Templates;
import util.dumper.Helpers;

public class SQLite4Java extends Helpers implements Database {

	private static final File DATABASE_FILE = new File("sqlite4java.db");
	private SQLiteConnection connection;
	private String createQuery;
	private String genericInsertStatement;
	private ArrayList<SQLiteStatement> scenarioStatements;
	private QueryScenario queryScenario;
	private Templates templates;
	private SQLiteQueue queue;

	public SQLite4Java() {
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
		return "sqlite4java";
	}

	@Override
	public String getVersion() {
		return "392 with SQLite 3.8.7";
	}

	@Override
	public void setUp() throws Exception {
		reopenConnection(false);

		connection.exec("drop table if exists " + Config.TABLE);
		templates = new Templates("sqlite", ".sql");
	}

	@Override
	public void load(Dataset dataset) throws Exception {
		// reopenConnection(false);

		// Auto commit setting:
		// https://stackoverflow.com/questions/4998630/how-to-disable-autocommit-in-sqlite4java#5005785
		connection.exec("BEGIN");

		connection.exec(createQuery);

		readRdf(dataset, dataObject -> {
			try {
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
				// insertStatement.execute();
				//
				insertStatement.step();
				insertStatement.clearBindings();
			} catch (Exception e) {
				throw new RuntimeException("Cannot insert DataObject: " + dataObject, e);
			}
		});
		connection.exec("COMMIT");
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
		case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP:
		case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS:
			System.out.println("Not implemented: " + queryScenario);
			return;
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

		scenarioStatements.add(connection.prepare(templates.resolve(queryScenario)));

		this.queryScenario = queryScenario;
	}

	@Override
	public QueryResult query(QueryScenario queryScenario) throws Exception {
		if (scenarioStatements == null || this.queryScenario != queryScenario)
			throw new RuntimeException("There is no preparedStatement for QueryScenario " + queryScenario);

		QueryResult queryResult = new QueryResult(queryScenario.queryResultType);

		// Auto commit setting:
		// https://stackoverflow.com/questions/4998630/how-to-disable-autocommit-in-sqlite4java#5005785
		connection.exec("BEGIN");

		switch (queryScenario) {
		case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP:
		case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS:
			System.out.println("WARNING: " + queryScenario + " not yet implemented");
			break;
		default:

			for (SQLiteStatement preparedStatement : scenarioStatements) {
				switch (queryScenario.queryResultType) {
				case TWO_COLUMNS:
					while (preparedStatement.step()) {
						queryResult.push(preparedStatement.columnString(0), preparedStatement.columnString(1));
					}
					break;
				case COMPLETE_ENTITIES:
					while (preparedStatement.step()) {
						DataObject dataObject = new DataObject();
						for (Codes code : Codes.values()) {
							if (preparedStatement.columnNull(code.ordinal()))
								continue;
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
		}

		connection.exec("COMMIT");
		return queryResult;
	}

	@Override
	public void clear(QueryScenario queryScenario) throws Exception {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) throws Exception {

		SQLite4Java sqLiteXerial = new SQLite4Java();
		sqLiteXerial.setUp();
		sqLiteXerial.load(Dataset.hebis_tiny_rdf);

		QueryScenario queryScenario = QueryScenario.AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100;
		sqLiteXerial.prepare(queryScenario);
		System.out.println(sqLiteXerial.query(queryScenario));

		queryScenario = QueryScenario.AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10;
		sqLiteXerial.prepare(queryScenario);
		System.out.println(sqLiteXerial.query(queryScenario));

	}

}
