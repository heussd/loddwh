package database;

import java.io.File;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.json.JSONArray;

import com.almworks.sqlite4java.SQLiteConnection;
import com.almworks.sqlite4java.SQLiteStatement;

import util.Codes;
import util.Config;
import util.Dataset;
import util.QueryScenario;
import util.Templates;
import util.dumper.Helpers;

public class SQLite4Java extends Helpers implements Database {

	private SQLiteConnection connection;
	private String createQuery;
	private String genericInsertStatement;
	private ArrayList<SQLiteStatement> scenarioStatements;
	private QueryScenario queryScenario;
	private Templates templates;

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
		reopenConnection(false);

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
	}

	private void reopenConnection(boolean readonly) {
		try {
			// if (connection != null && connection.isOpen())
			//// connection.c;
			//
			// // connection = DriverManager.getConnection("jdbc:sqlite:" +
			// // Config.DATABASE + ".db");
			if (connection == null) {
				connection = new SQLiteConnection(new File("sqlite4java.db"));

				// if (readonly)
				// connection.openReadonly();
				// else
				connection.open(true);
			}

			// connection.is
			// connection = sqLiteConfig.createConnection("jdbc:sqlite:" +
			// Config.DATABASE + ".db");
		} catch (Exception e) {
			throw new RuntimeException("Cannot open connection", e);
		}
	}

	@Override
	public void prepare(QueryScenario queryScenario) throws Exception {
		reopenConnection(queryScenario.isReadOnly);

		if (scenarioStatements == null)
			scenarioStatements = new ArrayList<>();

		scenarioStatements.clear();

		// SQL queries / prepared statements to be executed before the actual
		// QueryScenario statement
		// Statement statement = connection.createStatement();
		switch (queryScenario) {
		case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP:
		case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS:
			System.out.println("WARNING: " + queryScenario + " not yet implemented");
			break;
		default:
			// Resolves the template associated with this queryScenario
			scenarioStatements.add(connection.prepare(templates.resolve(queryScenario)));
		}

		this.queryScenario = queryScenario;
	}

	@Override
	public void query(QueryScenario queryScenario) throws Exception {
		if (scenarioStatements == null || this.queryScenario != queryScenario)
			throw new RuntimeException("There is no preparedStatement for QueryScenario " + queryScenario);

		switch (queryScenario) {
		case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP:
		case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS:
			System.out.println("WARNING: " + queryScenario + " not yet implemented");
			break;
		default:
			for (SQLiteStatement preparedStatement : scenarioStatements) {
				preparedStatement.step();
			}
		}

	}

	@Override
	public void clear(QueryScenario queryScenario) throws Exception {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) throws Exception {

		SQLite4Java sqLiteXerial = new SQLite4Java();
		sqLiteXerial.setUp();
		sqLiteXerial.load(Dataset.hebis_tiny_rdf);

		QueryScenario queryScenario = QueryScenario.SCHEMA_CHANGE_REMOVE_RDF_TYPE;
		sqLiteXerial.prepare(queryScenario);
		sqLiteXerial.query(queryScenario);

	}

}
