package database;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import com.google.common.base.Joiner;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.query.QuerySolution;
import com.hp.hpl.jena.query.ResultSet;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.update.UpdateExecutionFactory;
import com.hp.hpl.jena.update.UpdateFactory;
import com.hp.hpl.jena.update.UpdateProcessor;
import com.hp.hpl.jena.update.UpdateRequest;

import util.Dataset;
import util.QueryResult;
import util.QueryScenario;
import util.Templates;
import util.dumper.Helpers;

public class Fuseki extends Helpers implements Database {

	public final String SPARQL_SERVICE_URL = "http://localhost:3030/DB/sparql";
	public final String UPDATE_SERVICE_URL = "http://localhost:3030/DB/update";

	private String queryExecutionString;
	private Templates templates;
	private List<UpdateProcessor> updateProcessors;

	public static void main(String[] args) throws Exception {
		Database database = new Fuseki();

		database.setUp();
		// database.load(Dataset.hebis_21257740_26887667_rdf_gz);
		database.load(Dataset.hebis_10000_records);

		QueryScenario queryScenario = QueryScenario.ENTITY_RETRIEVAL_BY_ID_100_ENTITIES;

		database.prepare(queryScenario);
		QueryResult queryResult = database.query(queryScenario);
		database.query(queryScenario);
		database.query(queryScenario);
		System.out.println(queryResult);

		queryScenario = QueryScenario.CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES;

		database.prepare(queryScenario);
		queryResult = database.query(queryScenario);
		System.out.println(queryResult);
	}

	public Fuseki() {
		this.templates = new Templates("fuseki", ".sql");
	}

	@Override
	public String getName() {
		return "Fuseki";
	}

	@Override
	public String getVersion() {
		return "2.3.0 2015-07-25T17:11:28+0000 / jena-libs 2.13.0";
	}

	@Override
	public void setUp() throws Exception {

	}

	@Override
	public void load(Dataset dataset) throws Exception {
		// Sadly, Fuseki does seem to support loading gz-compressed files when
		// loading via command line - strangely, in contrast to the HTTP-GUI...

		ProcessBuilder gunzipProcess = new ProcessBuilder("gunzip", "-k", dataset.file.getAbsolutePath());

		String extractedFileString = dataset.file.getName();
		extractedFileString = extractedFileString.substring(0, extractedFileString.length() - 3);

		File extractedFile = new File(dataset.file.getParentFile() + File.separator + extractedFileString);
		if (extractedFile.exists()) {
			extractedFile.delete();
		}

		Process p = gunzipProcess.start();
		int errorlevel = p.waitFor();
		if (errorlevel != 0)
			throw new RuntimeException("gunzip returned " + errorlevel);

		// Upload extracted dump via curl
		ProcessBuilder curlProcess = new ProcessBuilder("curl", "-v", "-XPOST", "--data-binary", "@" + extractedFile.getAbsolutePath(), "--header",
				"Content-type: application/rdf+xml", "http://localhost:3030/DB/data?default");

		p = curlProcess.start();
		errorlevel = p.waitFor();

		if (errorlevel != 0)
			throw new RuntimeException("curl returned " + errorlevel);
	}

	@Override
	public void prepare(QueryScenario queryScenario) throws Exception {
		if (queryScenario.isReadOnly) {

			// Prepare IDs for ENTITY_RETRIEVAL scenarios
			switch (queryScenario) {
			case ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY:
			case ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES:
			case ENTITY_RETRIEVAL_BY_ID_100_ENTITIES: {
				String query = templates.resolve("ENTITY_RETRIEVAL_prepare");
				switch (queryScenario) {
				case ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY:
					query += " limit 1";
					break;
				case ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES:
					query += " limit 10";
					break;
				case ENTITY_RETRIEVAL_BY_ID_100_ENTITIES:
					query += " limit 100";
					break;
				default:
				}

				ResultSet resultSet = QueryExecutionFactory.sparqlService(SPARQL_SERVICE_URL, query).execSelect();
				ArrayList<String> ids = new ArrayList<>();
				while (resultSet.hasNext()) {
					QuerySolution querySolution = resultSet.nextSolution();
					ids.add("\"" + querySolution.getLiteral(resultSet.getResultVars().get(0)).getString() + "\"");
				}

				this.queryExecutionString = templates.resolve("ENTITY_RETRIEVAL").replaceAll("##ids##", Joiner.on(",").join(ids));
				break;
			}
			case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY:
			case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES:
			case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES:
			// case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY:
			// case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES:
			// case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES:
			{
				String query = templates.resolve("GRAPH_LIKE_prepare");
				switch (queryScenario) {
				// case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES:
				case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES:
					query += " limit 100";
					break;
				case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES:
					// case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES:
					query += " limit 10";
					break;
				case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY:
					// case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY:
					query += " limit 100";
					break;
				default:
					throw new RuntimeException("Dont know how to limit " + queryScenario);
				}
				ResultSet resultSet = QueryExecutionFactory.sparqlService(SPARQL_SERVICE_URL, query).execSelect();
				ArrayList<String> ids = new ArrayList<>();
				while (resultSet.hasNext()) {
					QuerySolution querySolution = resultSet.nextSolution();
					ids.add("\"" + querySolution.getLiteral(resultSet.getResultVars().get(0)).getString() + "\"");
				}

				String templateName = "GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS";
				switch (queryScenario) {
				case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES:
				case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES:
				case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY:
					templateName = "GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP";
					break;
				}

				this.queryExecutionString = templates.resolve(templateName).replaceAll("##ids##", Joiner.on(",").join(ids));
				break;
			}
			default: {
				this.queryExecutionString = templates.resolve(queryScenario);
			}
			}

		} else {
			if (updateProcessors == null) {
				this.updateProcessors = new ArrayList<UpdateProcessor>();
			}
			updateProcessors.clear();

			if (queryScenario == QueryScenario.SCHEMA_CHANGE_MIGRATE_RDF_TYPE) {
				for (int part = 1; part <= 4; part++) {
					UpdateRequest request = UpdateFactory.create(templates.resolve(queryScenario + "_part" + part));
					updateProcessors.add(UpdateExecutionFactory.createRemote(request, UPDATE_SERVICE_URL));
				}
			} else {
				UpdateRequest request = UpdateFactory.create(templates.resolve(queryScenario));
				updateProcessors.add(UpdateExecutionFactory.createRemote(request, UPDATE_SERVICE_URL));
			}

		}
	}

	@Override
	public QueryResult query(QueryScenario queryScenario) throws Exception {
		QueryResult queryResult = new QueryResult(queryScenario.queryResultType);
		ResultSet resultSet;
		switch (queryScenario.queryResultType) {
		case GRAPH:
			resultSet = QueryExecutionFactory.sparqlService(SPARQL_SERVICE_URL, queryExecutionString).execSelect();
			while (resultSet.hasNext()) {
				QuerySolution querySolution = resultSet.nextSolution();
				switch (resultSet.getResultVars().size()) {
				case 3:
					queryResult.push(querySolution.getLiteral(resultSet.getResultVars().get(0)).getString(),
							querySolution.getLiteral(resultSet.getResultVars().get(1)).getString(),
							querySolution.getLiteral(resultSet.getResultVars().get(2)).getString());
					break;
				case 5:
					queryResult.push(querySolution.getLiteral(resultSet.getResultVars().get(0)).getString(),
							querySolution.getLiteral(resultSet.getResultVars().get(1)).getString(),
							querySolution.getLiteral(resultSet.getResultVars().get(2)).getString(),
							querySolution.getLiteral(resultSet.getResultVars().get(3)).getString(),
							querySolution.getLiteral(resultSet.getResultVars().get(4)).getString());
					break;
				default:
					throw new RuntimeException("Cannot parse " + resultSet.getResultVars().size() + " columns in result set");
				}
			}
			break;
		case TWO_COLUMNS:
			resultSet = QueryExecutionFactory.sparqlService(SPARQL_SERVICE_URL, queryExecutionString).execSelect();
			while (resultSet.hasNext()) {
				QuerySolution querySolution = resultSet.nextSolution();
				queryResult.push(querySolution.getLiteral(resultSet.getResultVars().get(0)).getString(),
						querySolution.getLiteral(resultSet.getResultVars().get(1)).getString());
			}
			break;
		case COMPLETE_ENTITIES:
			Model model = QueryExecutionFactory.sparqlService(SPARQL_SERVICE_URL, queryExecutionString).execDescribe();
			StringWriter stringWriter = new StringWriter();
			model.write(stringWriter);

			InputStream stream = new ByteArrayInputStream(stringWriter.toString().getBytes(StandardCharsets.UTF_8));

			readRdf(stream, dataObject -> {
				queryResult.push(dataObject);
			} , null);
			break;
		case NONE:
		default:
			for (UpdateProcessor updateProcessor : updateProcessors)
				updateProcessor.execute();
			break;
		}

		return queryResult;
	}

	@Override
	public void clean() throws Exception {
		UpdateRequest request = UpdateFactory.create("drop all");
		UpdateExecutionFactory.createRemote(request, UPDATE_SERVICE_URL).execute();
	}

	@Override
	public void start() {
		Helpers.terminalLaunchScript("fuseki.sh", 7);
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "Fuseki [getName()=" + getName() + ", getVersion()=" + getVersion() + "]";
	}
}
