package database;

import java.util.ArrayList;
import java.util.List;

import org.bson.BSON;
import org.bson.Document;

import com.mongodb.Block;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.AggregateIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.util.JSON;

import util.Codes;
import util.Config;
import util.Dataset;
import util.QueryResult;
import util.QueryResult.Type;
import util.QueryScenario;
import util.dumper.Helpers;
import static java.util.Arrays.asList;

public class MongoDB implements Database {

	public static void main(String[] args) throws Throwable {
		 MongoDB mongoDb = new MongoDB();
		 mongoDb.setUp();
		 mongoDb.load(Dataset.hebis_1000_records);
		 
		 //mongoDb.query(QueryScenario.AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL);
		 //mongoDb.query(QueryScenario.AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100);
	}
	
	MongoClient mongoClient;
	MongoDatabase database;
	MongoCollection<Document> collection;
	
	public MongoDB(){		
	}
	
	@Override
	public String getName() {
		return "MongoDB";
	}

	@Override
	public String getVersion() {
		return "3.0.6 2008R2Plus SSL 64bit";
	}

	@Override
	public void setUp() throws Exception {
		mongoClient = new MongoClient( "localhost" , 27017 );
		
		mongoClient.dropDatabase(Config.DATABASE);
		database = mongoClient.getDatabase(Config.DATABASE);
		
		collection = database.getCollection(Config.DATABASE);
		
		
		//collection.bulkWrite(arg0); http://docs.mongodb.org/manual/tutorial/insert-documents/
		//collection.insertMany(arg0);
		//DBObject doc = (DBObject)JSON.parse("{'neutest':12321}");
		//index sinnvoll auf feld id? hat auch text indexe
	}

	@Override
	public void load(Dataset dataset) throws Exception {
		
		Helpers.readRdf(dataset, 
				dataObject -> {
					Document doc = new Document();
					
					for (int i = 0; i < Codes.values().length; i++) {
						Codes code = Codes.values()[i];
						if (dataObject.get(code) != null) {
							String key = code.toString();
							if(!code.IS_MULTIPLE){
								String value = dataObject.get(code).toString();
								if(Helpers.isNumeric(value))
									doc.append(key, Double.parseDouble(value));
								else
									doc.append(key, value);
							}else{
								List<String> values = (ArrayList<String>)dataObject.get(code);
								doc.append(key, values);
							}
						}
					}
					
					collection.insertOne(doc);
				}, 
				counter -> {
					if (counter % 50000 == 0)
						System.out.println(counter + " records so far... (MongoDB load())");
				}
		);
		
	}

	@Override
	public void prepare(QueryScenario queryScenario) throws Exception {
	}

	@Override
	public QueryResult query(QueryScenario queryScenario) throws Exception {
		
		QueryResult queryResult = new QueryResult(queryScenario.queryResultType);
		
		switch (queryScenario.queryResultType) {
			case TWO_COLUMNS:
				switch(queryScenario){
					case AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL:
						AggregateIterable<Document> results = collection.aggregate(asList(new Document("$match", new Document("DCTERMS_PUBLISHER", new Document("$exists", true))), new Document("$group", new Document("_id", "$DCTERMS_PUBLISHER").append("count", new Document("$sum", 1))), new Document("$sort", new Document("count", -1))));
						results.forEach(new Block<Document>(){
							@Override
							public void apply(Document arg0) {
								//System.out.println(arg0.getString("_id") + " ==> " + arg0.getInteger("count").toString());
								queryResult.push(arg0.getString("_id"), arg0.getInteger("count").toString());
							}
						});
						return queryResult;
					case AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10:
						AggregateIterable<Document> results2 = collection.aggregate(asList(new Document("$match", new Document("DCTERMS_PUBLISHER", new Document("$exists", true))), new Document("$group", new Document("_id", "$DCTERMS_PUBLISHER").append("count", new Document("$sum", 1))), new Document("$sort", new Document("count", -1)), new Document("$limit", 10)));
						results2.forEach(new Block<Document>(){
							@Override
							public void apply(Document arg0) {
								//System.out.println(arg0.getString("_id") + " ==> " + arg0.getInteger("count").toString());
								queryResult.push(arg0.getString("_id"), arg0.getInteger("count").toString());
							}
						});
						return queryResult;
					case AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100:
						AggregateIterable<Document> results3 = collection.aggregate(asList(new Document("$match", new Document("DCTERMS_PUBLISHER", new Document("$exists", true))), new Document("$group", new Document("_id", "$DCTERMS_PUBLISHER").append("count", new Document("$sum", 1))), new Document("$sort", new Document("count", -1)), new Document("$limit", 100)));
						results3.forEach(new Block<Document>(){
							@Override
							public void apply(Document arg0) {
								//System.out.println(arg0.getString("_id") + " ==> " + arg0.getInteger("count").toString());
								queryResult.push(arg0.getString("_id"), arg0.getInteger("count").toString());
							}
						});
						return queryResult;
				}
				break;
				
				
				
			case COMPLETE_ENTITIES:
				switch(queryScenario){
					case CONDITIONAL_TABLE_SCAN_ALL_STUDIES:
						// {"DCTERMS_TITLE":/.*stud(ie|y).*/}
						return queryResult;
				}
				break;
			case GRAPH:
				break;
			case NONE:
				break;
		}
		
		
		return new QueryResult(Type.NONE);
		//throw new RuntimeException("Something happened");
		
	}

	@Override
	public void clear(QueryScenario queryScenario) throws Exception {
	}

	@Override
	public String toString() {
		return "MongoDB [getName()=" + getName() + ", getVersion()=" + getVersion() + "]";
	}
	
}
