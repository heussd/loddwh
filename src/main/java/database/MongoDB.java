package database;

import java.util.ArrayList;
import java.util.List;

import org.bson.BSON;
import org.bson.Document;

import com.mongodb.Block;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.AggregateIterable;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.util.JSON;

import util.Codes;
import util.Config;
import util.DataObject;
import util.Dataset;
import util.QueryResult;
import util.QueryResult.Type;
import util.QueryScenario;
import util.dumper.Helpers;
import static java.util.Arrays.asList;

public class MongoDB implements Database {

	public static void main(String[] args) throws Throwable {
		MongoDB mongoDb = new MongoDB();
		mongoDb.start();
		mongoDb.clean();
		mongoDb.setUp();
		mongoDb.load(Dataset.hebis_10000_records);

		QueryScenario testScenario = QueryScenario.GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES;

		mongoDb.prepare(testScenario);
		mongoDb.query(testScenario);
		mongoDb.stop();
	}

	MongoClient mongoClient;
	MongoDatabase database;
	MongoCollection<Document> collection;

	@Override
	public String getName() {
		return "MongoDB";
	}

	@Override
	public String getVersion() {
		return "3.0.6 2008R2Plus SSL 64bit";
	}

	@Override
	public void clean() throws Exception {
		mongoClient = new MongoClient("localhost", 27017);
		mongoClient.dropDatabase(Config.DATABASE);
	}

	@Override
	public void setUp() throws Exception {
		database = mongoClient.getDatabase(Config.DATABASE);
		collection = database.getCollection(Config.DATABASE);
	}

	@Override
	public void load(Dataset dataset) throws Exception {

		Helpers.readRdf(dataset, dataObject -> {
			Document doc = new Document();

			for (int i = 0; i < Codes.values().length; i++) {
				Codes code = Codes.values()[i];
				if (dataObject.get(code) != null) {
					String key = code.toString();
					if (!code.IS_MULTIPLE) {
						String value = dataObject.get(code).toString();
						doc.append(key, value);
					} else {
						List<String> values = (ArrayList<String>) dataObject.get(code);
						doc.append(key, values);
					}
				}
			}

			collection.insertOne(doc);
		} , counter -> {
			if (counter % 50000 == 0)
				System.out.println(counter + " records so far... (MongoDB load())");
		});

	}

	private List<String> EntityRetrievalAndGraphScenariosDcTermsIdentifiers = new ArrayList<>();

	private void FillEntityRetrievalAndGraphScenariosScenariosDcTermsIdentifiers(Document doc) {
		if (!doc.containsKey("DCTERMS_IDENTIFIER")) {
			System.err.println(
					"MongoDB, prepare ENTITY_RETRIEVAL/GRAPH: One element has no DCTERMS_IDENTIFIER. Element is ignored. Query-Size will not be 1, 10 or 100.");
			return;
		}

		EntityRetrievalAndGraphScenariosDcTermsIdentifiers.add(doc.getString("DCTERMS_IDENTIFIER"));
	}

	@Override
	public void prepare(QueryScenario queryScenario) throws Exception {

		Document findFilter = new Document();
		if (queryScenario == QueryScenario.GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY
				|| queryScenario == QueryScenario.GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES
				|| queryScenario == QueryScenario.GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES
				|| queryScenario == QueryScenario.GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY
				|| queryScenario == QueryScenario.GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES
				|| queryScenario == QueryScenario.GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES)
			findFilter = new Document("DCTERMS_SUBJECT", new Document("$exists", true));

		switch (queryScenario) {
		case ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY:
		case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY:
		case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY:
			EntityRetrievalAndGraphScenariosDcTermsIdentifiers.clear();
			FindIterable<Document> prepEntOne = collection.find(findFilter).sort(new Document("DCTERMS_MEDIUM", 1).append("ISBD_P1008", 1)
					.append("DCTERM_CONTRIBUTOR", 1).append("DCTERMS_ISSUED", 1).append("DCTERMS_IDENTIFIER", 1)).limit(1);
			prepEntOne.forEach(new Block<Document>() {
				@Override
				public void apply(Document arg0) {
					FillEntityRetrievalAndGraphScenariosScenariosDcTermsIdentifiers(arg0);
				}
			});
			break;

		case ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES:
		case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES:
		case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES:
			EntityRetrievalAndGraphScenariosDcTermsIdentifiers.clear();
			FindIterable<Document> prepEntTen = collection.find(findFilter).sort(new Document("DCTERMS_MEDIUM", 1).append("ISBD_P1008", 1)
					.append("DCTERM_CONTRIBUTOR", 1).append("DCTERMS_ISSUED", 1).append("DCTERMS_IDENTIFIER", 1)).limit(10);
			prepEntTen.forEach(new Block<Document>() {
				@Override
				public void apply(Document arg0) {
					FillEntityRetrievalAndGraphScenariosScenariosDcTermsIdentifiers(arg0);
				}
			});
			break;

		case ENTITY_RETRIEVAL_BY_ID_100_ENTITIES:
		case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES:
		case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES:
			EntityRetrievalAndGraphScenariosDcTermsIdentifiers.clear();
			FindIterable<Document> prepEntHun = collection.find(findFilter).sort(new Document("DCTERMS_MEDIUM", 1).append("ISBD_P1008", 1)
					.append("DCTERM_CONTRIBUTOR", 1).append("DCTERMS_ISSUED", 1).append("DCTERMS_IDENTIFIER", 1)).limit(100);
			prepEntHun.forEach(new Block<Document>() {
				@Override
				public void apply(Document arg0) {
					FillEntityRetrievalAndGraphScenariosScenariosDcTermsIdentifiers(arg0);
				}
			});
			break;
		}

	}

	private DataObject BuildDataObjectFromDocument(Document document) {
		DataObject dataObject = new DataObject();

		for (Codes code : Codes.values()) {
			if (!document.containsKey(code.toString())) {
				dataObject.set(code, null);
				continue;
			}

			if (code.IS_MULTIPLE) {
				for (String value : (ArrayList<String>) document.get(code.toString())) {
					dataObject.putMultiple(code, value);
				}
			} else {
				dataObject.set(code, document.getString(code.toString()));
			}
		}

		return dataObject;
	}

	@Override
	public QueryResult query(QueryScenario queryScenario) throws Exception {

		QueryResult queryResult = new QueryResult(queryScenario.queryResultType);

		switch (queryScenario.queryResultType) {
		case TWO_COLUMNS:
			switch (queryScenario) {
			case AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL:
				AggregateIterable<Document> results = collection
						.aggregate(asList(new Document("$match", new Document("DCTERMS_PUBLISHER", new Document("$exists", true))),
								new Document("$group", new Document("_id", "$DCTERMS_PUBLISHER").append("count", new Document("$sum", 1))),
								new Document("$sort", new Document("count", -1).append("_id", 1))));
				results.forEach(new Block<Document>() {
					@Override
					public void apply(Document arg0) {
						queryResult.push(arg0.getString("_id"), arg0.getInteger("count").toString());
					}
				});
				return queryResult;
			case AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10:
				AggregateIterable<Document> results2 = collection
						.aggregate(asList(new Document("$match", new Document("DCTERMS_PUBLISHER", new Document("$exists", true))),
								new Document("$group", new Document("_id", "$DCTERMS_PUBLISHER").append("count", new Document("$sum", 1))),
								new Document("$sort", new Document("count", -1).append("_id", 1)), new Document("$limit", 10)));
				results2.forEach(new Block<Document>() {
					@Override
					public void apply(Document arg0) {
						queryResult.push(arg0.getString("_id"), arg0.getInteger("count").toString());
					}
				});
				return queryResult;
			case AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100:
				AggregateIterable<Document> results3 = collection
						.aggregate(asList(new Document("$match", new Document("DCTERMS_PUBLISHER", new Document("$exists", true))),
								new Document("$group", new Document("_id", "$DCTERMS_PUBLISHER").append("count", new Document("$sum", 1))),
								new Document("$sort", new Document("count", -1).append("_id", 1)), new Document("$limit", 100)));
				results3.forEach(new Block<Document>() {
					@Override
					public void apply(Document arg0) {
						queryResult.push(arg0.getString("_id"), arg0.getInteger("count").toString());
					}
				});
				return queryResult;

			case AGGREGATE_ISSUES_PER_DECADE_ALL:
				AggregateIterable<Document> ispdec1 = collection
						.aggregate(asList(new Document("$match", new Document("DCTERMS_ISSUED", new Document("$exists", true))),
								new Document("$group",
										new Document("_id", new Document("$substr", asList("$DCTERMS_ISSUED", 0, 3))).append("count", new Document("$sum", 1))),
						new Document("$sort", new Document("count", -1).append("_id", 1))));
				ispdec1.forEach(new Block<Document>() {
					@Override
					public void apply(Document arg0) {
						queryResult.push(arg0.getString("_id"), arg0.getInteger("count").toString());
					}
				});
				return queryResult;
			case AGGREGATE_ISSUES_PER_DECADE_TOP10:
				AggregateIterable<Document> ispdec2 = collection
						.aggregate(asList(new Document("$match", new Document("DCTERMS_ISSUED", new Document("$exists", true))),
								new Document("$group",
										new Document("_id", new Document("$substr", asList("$DCTERMS_ISSUED", 0, 3))).append("count", new Document("$sum", 1))),
						new Document("$sort", new Document("count", -1).append("_id", 1)), new Document("$limit", 10)));
				ispdec2.forEach(new Block<Document>() {
					@Override
					public void apply(Document arg0) {
						queryResult.push(arg0.getString("_id"), arg0.getInteger("count").toString());
					}
				});
				return queryResult;
			case AGGREGATE_ISSUES_PER_DECADE_TOP100:
				AggregateIterable<Document> ispdec3 = collection
						.aggregate(asList(new Document("$match", new Document("DCTERMS_ISSUED", new Document("$exists", true))),
								new Document("$group",
										new Document("_id", new Document("$substr", asList("$DCTERMS_ISSUED", 0, 3))).append("count", new Document("$sum", 1))),
						new Document("$sort", new Document("count", -1).append("_id", 1)), new Document("$limit", 100)));
				ispdec3.forEach(new Block<Document>() {
					@Override
					public void apply(Document arg0) {
						queryResult.push(arg0.getString("_id"), arg0.getInteger("count").toString());
					}
				});
				return queryResult;
			}
			break;

		case COMPLETE_ENTITIES:
			switch (queryScenario) {
			case CONDITIONAL_TABLE_SCAN_ALL_STUDIES:
				FindIterable<Document> results4 = collection
						.find(new Document("DCTERMS_TITLE", new Document("$regex", ".*stud(ie|y).*").append("$options", "i")));
				results4.forEach(new Block<Document>() {
					@Override
					public void apply(Document arg0) {
						queryResult.push(BuildDataObjectFromDocument(arg0));
					}
				});
				return queryResult;
			case CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES:
				FindIterable<Document> results5 = collection.find(new Document("RDF_TYPE", "http://purl.org/dc/terms/BibliographicResource"));
				results5.forEach(new Block<Document>() {
					@Override
					public void apply(Document arg0) {
						queryResult.push(BuildDataObjectFromDocument(arg0));
					}
				});
				return queryResult;
			case CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES:
				FindIterable<Document> results6 = collection.find(new Document("RDF_TYPE", "http://purl.org/dc/terms/BibliographicResource")
						.append("DCTERMS_TITLE", new Document("$regex", ".*stud(ie|y).*").append("$options", "i")));
				results6.forEach(new Block<Document>() {
					@Override
					public void apply(Document arg0) {
						queryResult.push(BuildDataObjectFromDocument(arg0));
					}
				});
				return queryResult;

			case ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY:
			case ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES:
			case ENTITY_RETRIEVAL_BY_ID_100_ENTITIES:
				for (String dc_ident : EntityRetrievalAndGraphScenariosDcTermsIdentifiers) {
					FindIterable<Document> resultById = collection.find(new Document("DCTERMS_IDENTIFIER", dc_ident));
					resultById.forEach(new Block<Document>() {
						@Override
						public void apply(Document arg0) {
							queryResult.push(BuildDataObjectFromDocument(arg0));
						}
					});
				}
				return queryResult;
			}
			break;

		case GRAPH:
			switch (queryScenario) {
			case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY:
			case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES:
			case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES:
				for (String dc_ident : EntityRetrievalAndGraphScenariosDcTermsIdentifiers) {
					FindIterable<Document> findIter1 = collection
							.find(new Document("DCTERMS_SUBJECT", new Document("$exists", true)).append("DCTERMS_IDENTIFIER", dc_ident));
					findIter1.forEach(new Block<Document>() {
						@Override
						public void apply(Document arg0) {
							for (String subject : (ArrayList<String>) arg0.get("DCTERMS_SUBJECT")) {
								FindIterable<Document> findIter2 = collection
										.find(new Document("DCTERMS_SUBJECT", subject).append("_id", new Document("$ne", arg0.getObjectId("_id"))));
								findIter2.forEach(new Block<Document>() {
									@Override
									public void apply(Document arg1) {
										queryResult.push(arg0.getString("DCTERMS_IDENTIFIER"), subject, arg1.getString("DCTERMS_IDENTIFIER"));
									}
								});
							}
						}
					});
				}
				return queryResult;
			case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY:
			case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES:
			case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES:
				for (String dc_ident : EntityRetrievalAndGraphScenariosDcTermsIdentifiers) {
					FindIterable<Document> findIter2Hops = collection
							.find(new Document("DCTERMS_SUBJECT", new Document("$exists", true)).append("DCTERMS_IDENTIFIER", dc_ident));
					findIter2Hops.forEach(new Block<Document>() {
						@Override
						public void apply(Document arg0) {
							for (String subject : (ArrayList<String>) arg0.get("DCTERMS_SUBJECT")) {
								FindIterable<Document> findIter2 = collection
										.find(new Document("DCTERMS_SUBJECT", subject).append("_id", new Document("$ne", arg0.getObjectId("_id"))));
								findIter2.forEach(new Block<Document>() {
									@Override
									public void apply(Document arg1) {
										for (String subject2 : (ArrayList<String>) arg1.get("DCTERMS_SUBJECT")) {
											FindIterable<Document> findIter3 = collection.find(
													new Document("DCTERMS_SUBJECT", subject2).append("_id", new Document("$ne", arg1.getObjectId("_id"))));
											findIter3.forEach(new Block<Document>() {
												@Override
												public void apply(Document arg2) {
													queryResult.push(arg0.getString("DCTERMS_IDENTIFIER"), subject, arg1.getString("DCTERMS_IDENTIFIER"),
															subject2, arg2.getString("DCTERMS_IDENTIFIER"));
												}
											});
										}
									}
								});
							}
						}
					});
				}
				return queryResult;
			}
			break;

		case NONE:
			switch (queryScenario) {
			case SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY:
				collection.updateMany(new Document(), new Document("$set", new Document("newfield", "cheesecake")));
				return queryResult;

			case SCHEMA_CHANGE_INTRODUCE_STRING_OP:
				FindIterable<Document> stringOps = collection.find();
				stringOps.forEach(new Block<Document>() {
					@Override
					public void apply(Document arg0) {
						String suffix = arg0.getString("RDF_ABOUT").substring(29);
						collection.updateOne(new Document("_id", arg0.getObjectId("_id")), new Document("$set", new Document("idSuffix", suffix)));
					}
				});
				return queryResult;

			case SCHEMA_CHANGE_MIGRATE_RDF_TYPE:
				collection.updateMany(new Document(),
						new Document("$set", new Document("manifestation", false).append("bibresource", false).append("book", false)));
				collection.updateMany(new Document("RDF_TYPE", "http://purl.org/vocab/frbr/core#Manifestation"),
						new Document("$set", new Document("manifestation", true)));
				collection.updateMany(new Document("RDF_TYPE", "http://purl.org/dc/terms/BibliographicResource"),
						new Document("$set", new Document("bibresource", true)));
				collection.updateMany(new Document("RDF_TYPE", "http://purl.org/ontology/bibo/Book"), new Document("$set", new Document("book", true)));
				return queryResult;

			case SCHEMA_CHANGE_REMOVE_RDF_TYPE:
				collection.updateMany(new Document(), new Document("$unset", new Document("RDF_TYPE", "")));
				return queryResult;

			case UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM:
				collection.updateMany(new Document("DCTERMS_MEDIUM", "paper"), new Document("$set", new Document("DCTERMS_MEDIUM", "recycled trees")));
				return queryResult;

			case UPDATE_HIGH_SELECTIVITY_NON_ISSUED:
				collection.updateMany(new Document("DCTERMS_ISSUED", new Document("$exists", false)),
						new Document("$set", new Document("DCTERMS_ISSUED", "0")));
				return queryResult;

			case DELETE_LOW_SELECTIVITY_PAPER_MEDIUM:
				collection.deleteMany(new Document("DCTERMS_MEDIUM", "recycled trees"));
				return queryResult;

			case DELETE_HIGH_SELECTIVIY_NON_ISSUED:
				collection.deleteMany(new Document("DCTERMS_ISSUED", "0"));
				return queryResult;
			}
			break;
		}

		throw new RuntimeException("Something happened");
	}

	@Override
	public String toString() {
		return "MongoDB [getName()=" + getName() + ", getVersion()=" + getVersion() + "]";
	}

	@Override
	public void start() {
		if (Config.THIS_IS_OSX)
			Helpers.terminalLaunchScript("mongodb.sh", 20);
	}

	@Override
	public void stop() {
		if (Config.THIS_IS_OSX)
			Helpers.terminalLaunchScript("mongodb_stop.sh", 10);
	}
}
