package database;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

import org.bson.Document;

import com.arangodb.ArangoConfigure;
import com.arangodb.ArangoDriver;
import com.arangodb.DocumentCursor;
import com.arangodb.entity.CollectionEntity;

import java.util.Iterator;
import java.util.Map;

import com.arangodb.ArangoException;
import com.arangodb.CursorResultSet;
import com.arangodb.entity.BaseDocument;
import com.arangodb.entity.DocumentEntity;
import com.arangodb.entity.EdgeDefinitionEntity;
import com.arangodb.entity.GraphEntity;
import com.arangodb.util.MapBuilder;

import util.Codes;
import util.Config;
import util.DataObject;
import util.Dataset;
import util.QueryResult;
import util.QueryScenario;
import util.dumper.Helpers;

public class ArangoDB implements Database {

	@Override
	public String getName() {
		return "ArangoDB";
	}

	@Override
	public String getVersion() {
		return "Server 2.7.0 / Java Driver 2.6.8";
	}
		
	@Override
	public String toString() {
		return "ArangoDB [getName()=" + getName() + ", getVersion()="
				+ getVersion() + "]";
	}
	
	public static void main(String[] args) throws Throwable {
		ArangoDB arangoDb = new ArangoDB();
		arangoDb.start();
		arangoDb.clean();
		arangoDb.setUp();
		arangoDb.load(Dataset.hebis_10000_records);
		
		QueryScenario testScenario = QueryScenario.GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP;
		
		arangoDb.prepare(testScenario);
		QueryResult queryResult = arangoDb.query(testScenario);
		
		//System.out.println(queryResult);
		
		arangoDb.stop();
	}
	
	ArangoDriver arangoDriver;
	CollectionEntity arangoCollection;

	@Override
	public void start() {
	}

	@Override
	public void stop() {
	}

	@Override
	public void clean() throws Exception {
		ArangoConfigure configure = new ArangoConfigure();
		configure.init();
		arangoDriver = new ArangoDriver(configure);
		
		if(arangoDriver.getDatabases().getResult().contains(Config.DATABASE))
			arangoDriver.deleteDatabase(Config.DATABASE);
	}

	@Override
	public void setUp() throws Exception {
		arangoDriver.createDatabase(Config.DATABASE);
		arangoDriver.setDefaultDatabase(Config.DATABASE);		
		arangoCollection = arangoDriver.createCollection(Config.DATABASE);
	}

	@Override
	public void load(Dataset dataset) throws Exception {
		
		Helpers.readRdf(dataset, dataObject -> {
			BaseDocument arangoDoc = new BaseDocument();
			
			for (Codes code : Codes.values()) {
				if (dataObject.get(code) != null) {
					arangoDoc.addAttribute(code.toString(), dataObject.get(code));
				}
			}
			
			try {
				arangoDriver.createDocument(Config.DATABASE, arangoDoc);
			} catch (Exception e) {
				System.err.println("Konnte ein ArangoDocument nicht einfügen.");
				e.printStackTrace();
			}
			
		} , counter -> {
			if (counter % 50000 == 0)
				System.out.println(counter + " records so far... (ArangoDB load())");
		});
		
		InitializeDctermsSubjectsGraph();
	}

	private void InitializeDctermsSubjectsGraph() throws Exception{
		String graphName = Config.DATABASE + "_graph", edgeCollectionName = Config.DATABASE + "_sharesSubject";
		
		EdgeDefinitionEntity edgeDefinition = new EdgeDefinitionEntity();
		edgeDefinition.setCollection(edgeCollectionName);
		
		List<String> from = new ArrayList<>(), to = new ArrayList<>();
		from.add(Config.DATABASE); to.add(Config.DATABASE);
		edgeDefinition.setFrom(from); edgeDefinition.setTo(to);
		
		List<EdgeDefinitionEntity> edgeDefinitions = new ArrayList<>();
		edgeDefinitions.add(edgeDefinition);
		
		arangoDriver.createGraph(graphName, edgeDefinitions, new ArrayList<String>(), true);
		
		
		// Now build relations over DCTERMS_SUBJECT
		
		//TEST START
//		String query = "FOR r IN loddwhbench FILTER r.DCTERMS_IDENTIFIER == '268876797' RETURN r"; // Einfluss der kopfform auf den kariesbefall
//		DocumentEntity<BaseDocument> documentEntity1 = arangoDriver.executeDocumentQuery(query, null, arangoDriver.getDefaultAqlQueryOptions(), BaseDocument.class).getUniqueResult();
//		query = "FOR r IN loddwhbench FILTER r.DCTERMS_IDENTIFIER == '268877157' RETURN r"; // beitrag zur elektronenresonanz
//		DocumentEntity<BaseDocument> documentEntity2 = arangoDriver.executeDocumentQuery(query, null, arangoDriver.getDefaultAqlQueryOptions(), BaseDocument.class).getUniqueResult();
//		BaseDocument values = new BaseDocument(); values.addAttribute("subject", "hierBitteDasGesharteSubject");
//		arangoDriver.graphCreateEdge(graphName, edgeCollectionName, documentEntity1.getDocumentHandle(), documentEntity2.getDocumentHandle(), values, null);
		//TEST ENDE
		
		String query1 = "for r in loddwhbench filter has(r, 'DCTERMS_SUBJECT') && has(r, 'DCTERMS_IDENTIFIER') return r";
		DocumentCursor<BaseDocument> documentCursor1 = arangoDriver.executeDocumentQuery(query1, null, arangoDriver.getDefaultAqlQueryOptions(), BaseDocument.class);
		for (DocumentEntity<BaseDocument> documentEntity1 : documentCursor1) {
			BaseDocument document1 = documentEntity1.getEntity();
			for(String subject : (ArrayList<String>) document1.getAttribute("DCTERMS_SUBJECT")){
				String query2 = String.format("for r in loddwhbench filter has(r, 'DCTERMS_SUBJECT') && has(r, 'DCTERMS_IDENTIFIER') && '%s' in r.DCTERMS_SUBJECT && r._key != '%s' return r", subject, document1.getDocumentKey());
				DocumentCursor<BaseDocument> documentCursor2 = arangoDriver.executeDocumentQuery(query2, null, arangoDriver.getDefaultAqlQueryOptions(), BaseDocument.class);
				for (DocumentEntity<BaseDocument> documentEntity2 : documentCursor2) {					
					// Add edge for found relation
					BaseDocument edgeValues = new BaseDocument();
					edgeValues.addAttribute("subject", subject);					
					arangoDriver.graphCreateEdge(graphName, edgeCollectionName, documentEntity1.getDocumentHandle(), documentEntity2.getDocumentHandle(), edgeValues, null);
				}
			}
		}
	}
	
	private DataObject BuildDataObjectFromDocument(BaseDocument document) {
		DataObject dataObject = new DataObject();

		for (Codes code : Codes.values()) {
			if (document.getAttribute(code.toString()) == null) {
				dataObject.set(code, null);
				continue;
			}

			if (code.IS_MULTIPLE){
				for(String value : (ArrayList<String>) document.getAttribute(code.toString())){
					dataObject.putMultiple(code, value);
				}
			}
			else
			{
				dataObject.set(code, document.getAttribute(code.toString()).toString());
			}
		}

		return dataObject;
	}
	
	private void PushTwoColumnsToQueryResult(BaseDocument baseDocument, String c1, String c2, QueryResult queryResult){
		Object publisherOrDecade = baseDocument.getAttribute(c1), count = baseDocument.getAttribute(c2);
		String spublisherOrDecade = null, scount = null;
		if(publisherOrDecade != null) spublisherOrDecade = publisherOrDecade.toString();
		if(count != null) scount = String.valueOf((int) Double.parseDouble(count.toString()));		
		queryResult.push(spublisherOrDecade, scount);
		
		System.out.println(scount + " = " + spublisherOrDecade);
	}
	
	private List<String> EntityRetrievalScenariosDcTermsIdentifiers = new ArrayList<>();
	private void FillEntityRetrievalScenariosDcTermsIdentifiers(BaseDocument doc){
		if(doc.getAttribute("DCTERMS_IDENTIFIER") == null){
			System.err.println("ArangoDB, prepare ENTITY_RETRIEVAL: One element has no DCTERMS_IDENTIFIER. Element is ignored. Query-Size will not be 1, 10 or 100.");
			return;
		}
		EntityRetrievalScenariosDcTermsIdentifiers.add(doc.getAttribute("DCTERMS_IDENTIFIER").toString());
	}
	
	@Override
	public void prepare(QueryScenario queryScenario) throws Exception {
		String query;
		DocumentCursor<BaseDocument> documentCursor;
		
		switch(queryScenario){
			case CONDITIONAL_TABLE_SCAN_ALL_STUDIES:
				arangoDriver.createFulltextIndex(Config.DATABASE, "DCTERMS_TITLE");
				break;
				
			case ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY:
				EntityRetrievalScenariosDcTermsIdentifiers.clear();
				query = "FOR r IN loddwhbench SORT r.DCTERMS_MEDIUM, r.ISBD_P1008, r.DCTERM_CONTRIBUTOR, r.DCTERMS_ISSUED, r.DCTERMS_IDENTIFIER LIMIT 1 RETURN { 'DCTERMS_IDENTIFIER' : r.DCTERMS_IDENTIFIER }";
				documentCursor = arangoDriver.executeDocumentQuery(query, null, arangoDriver.getDefaultAqlQueryOptions(), BaseDocument.class);
				for (DocumentEntity<BaseDocument> documentEntity : documentCursor) {
					FillEntityRetrievalScenariosDcTermsIdentifiers(documentEntity.getEntity());
				}
				break;
				
			case ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES:
				EntityRetrievalScenariosDcTermsIdentifiers.clear();
				query = "FOR r IN loddwhbench SORT r.DCTERMS_MEDIUM, r.ISBD_P1008, r.DCTERM_CONTRIBUTOR, r.DCTERMS_ISSUED, r.DCTERMS_IDENTIFIER LIMIT 10 RETURN { 'DCTERMS_IDENTIFIER' : r.DCTERMS_IDENTIFIER }";
				documentCursor = arangoDriver.executeDocumentQuery(query, null, arangoDriver.getDefaultAqlQueryOptions(), BaseDocument.class);
				for (DocumentEntity<BaseDocument> documentEntity : documentCursor) {
					FillEntityRetrievalScenariosDcTermsIdentifiers(documentEntity.getEntity());
				}
				break;
				
			case ENTITY_RETRIEVAL_BY_ID_100_ENTITIES:
				EntityRetrievalScenariosDcTermsIdentifiers.clear();
				query = "FOR r IN loddwhbench SORT r.DCTERMS_MEDIUM, r.ISBD_P1008, r.DCTERM_CONTRIBUTOR, r.DCTERMS_ISSUED, r.DCTERMS_IDENTIFIER LIMIT 100 RETURN { 'DCTERMS_IDENTIFIER' : r.DCTERMS_IDENTIFIER }";
				documentCursor = arangoDriver.executeDocumentQuery(query, null, arangoDriver.getDefaultAqlQueryOptions(), BaseDocument.class);
				for (DocumentEntity<BaseDocument> documentEntity : documentCursor) {
					FillEntityRetrievalScenariosDcTermsIdentifiers(documentEntity.getEntity());
				}
				break;
		}
	}

	@Override
	public QueryResult query(QueryScenario queryScenario) throws Exception {		
		QueryResult queryResult = new QueryResult(queryScenario.queryResultType);
		String query;
		DocumentCursor<BaseDocument> documentCursor;
		
		switch(queryScenario.queryResultType){
			case COMPLETE_ENTITIES:
				switch(queryScenario){
					case CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES:
						query = "for resource in loddwhbench filter 'http://purl.org/dc/terms/BibliographicResource' in resource.RDF_TYPE return resource";
						documentCursor = arangoDriver.executeDocumentQuery(query, null, arangoDriver.getDefaultAqlQueryOptions(), BaseDocument.class);
						for (DocumentEntity<BaseDocument> documentEntity : documentCursor) {
							queryResult.push(BuildDataObjectFromDocument(documentEntity.getEntity()));
						}
						return queryResult;
						
					case CONDITIONAL_TABLE_SCAN_ALL_STUDIES:
						query = "for resource in fulltext(loddwhbench, 'DCTERMS_TITLE', 'study,|studie,|prefix:study,|prefix:studie') return resource";
						documentCursor = arangoDriver.executeDocumentQuery(query, null, arangoDriver.getDefaultAqlQueryOptions(), BaseDocument.class);
						for (DocumentEntity<BaseDocument> documentEntity : documentCursor) {
							queryResult.push(BuildDataObjectFromDocument(documentEntity.getEntity()));
						}
						return queryResult;
						
					case CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES:
						query = "for r in loddwhbench filter (contains(r.DCTERMS_TITLE, 'Study', false) || contains(r.DCTERMS_TITLE, 'study', false) || contains(r.DCTERMS_TITLE, 'Studie', false) || contains(r.DCTERMS_TITLE, 'studie', false)) && 'http://purl.org/dc/terms/BibliographicResource' in r.RDF_TYPE return r";
						documentCursor = arangoDriver.executeDocumentQuery(query, null, arangoDriver.getDefaultAqlQueryOptions(), BaseDocument.class);
						for (DocumentEntity<BaseDocument> documentEntity : documentCursor) {
							queryResult.push(BuildDataObjectFromDocument(documentEntity.getEntity()));
						}
						return queryResult;						
						
					case ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY:
					case ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES:
					case ENTITY_RETRIEVAL_BY_ID_100_ENTITIES:
						for (String dcterms_identifier : EntityRetrievalScenariosDcTermsIdentifiers) {
							query = String.format("FOR r IN loddwhbench FILTER r.DCTERMS_IDENTIFIER == '%s' RETURN r", dcterms_identifier);
							documentCursor = arangoDriver.executeDocumentQuery(query, null, arangoDriver.getDefaultAqlQueryOptions(), BaseDocument.class);
							for (DocumentEntity<BaseDocument> documentEntity : documentCursor) {
								queryResult.push(BuildDataObjectFromDocument(documentEntity.getEntity()));
							}
						}
						return queryResult;
				}
				break;
				
				
				
				
			case GRAPH:
				switch(queryScenario){
					case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP:
						query = "for e in GRAPH_EDGES('loddwhbench_graph', {}, {includeData: true}) return e";
						documentCursor = arangoDriver.executeDocumentQuery(query, null, arangoDriver.getDefaultAqlQueryOptions(), BaseDocument.class);
						for (DocumentEntity<BaseDocument> documentEntity : documentCursor) {
							BaseDocument document = documentEntity.getEntity();
							
							String getFrom = String.format("FOR r IN loddwhbench FILTER r._id == '%s' RETURN r", document.getAttribute("_from"));
							DocumentEntity<BaseDocument> fromEntity = arangoDriver.executeDocumentQuery(getFrom, null, arangoDriver.getDefaultAqlQueryOptions(), BaseDocument.class).getUniqueResult();
							
							String getTo = String.format("FOR r IN loddwhbench FILTER r._id == '%s' RETURN r", document.getAttribute("_to"));
							DocumentEntity<BaseDocument> toEntity = arangoDriver.executeDocumentQuery(getTo, null, arangoDriver.getDefaultAqlQueryOptions(), BaseDocument.class).getUniqueResult();
							
							
//							Object properties = document.getAttribute("properties");
//							BaseDocument bdproperties = (BaseDocument)properties;
//							String subject = bdproperties.getAttribute("subject").toString();
							String subject = ""; // TODO...
							
							
							String originalIdentifier = fromEntity.getEntity().getAttribute("DCTERMS_IDENTIFIER").toString();
							String relatedIdentifier = toEntity.getEntity().getAttribute("DCTERMS_IDENTIFIER").toString();
							
							System.out.println(String.format("%s - %s - %s", originalIdentifier, subject, relatedIdentifier));
							// TODO QUERYRESULT
						}
						return queryResult;
						
						
					case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS:
				}
				break;
				
				
				
			case TWO_COLUMNS:
				switch(queryScenario){
					case AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL:
						query = "FOR r IN loddwhbench COLLECT publisher = r.DCTERMS_PUBLISHER WITH COUNT INTO length SORT length DESC, publisher ASC RETURN { 'publisher' : publisher, 'count' : length }";
						documentCursor = arangoDriver.executeDocumentQuery(query, null, arangoDriver.getDefaultAqlQueryOptions(), BaseDocument.class);
						for (DocumentEntity<BaseDocument> documentEntity : documentCursor) {
							PushTwoColumnsToQueryResult(documentEntity.getEntity(), "publisher", "count", queryResult);
						}
						return queryResult;
						
					case AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10:
						query = "FOR r IN loddwhbench COLLECT publisher = r.DCTERMS_PUBLISHER WITH COUNT INTO length SORT length DESC, publisher ASC LIMIT 10 RETURN { 'publisher' : publisher, 'count' : length }";
						documentCursor = arangoDriver.executeDocumentQuery(query, null, arangoDriver.getDefaultAqlQueryOptions(), BaseDocument.class);
						for (DocumentEntity<BaseDocument> documentEntity : documentCursor) {
							PushTwoColumnsToQueryResult(documentEntity.getEntity(), "publisher", "count", queryResult);
						}
						return queryResult;
						
					case AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100:
						query = "FOR r IN loddwhbench COLLECT publisher = r.DCTERMS_PUBLISHER WITH COUNT INTO length SORT length DESC, publisher ASC LIMIT 100 RETURN { 'publisher' : publisher, 'count' : length }";
						documentCursor = arangoDriver.executeDocumentQuery(query, null, arangoDriver.getDefaultAqlQueryOptions(), BaseDocument.class);
						for (DocumentEntity<BaseDocument> documentEntity : documentCursor) {
							PushTwoColumnsToQueryResult(documentEntity.getEntity(), "publisher", "count", queryResult);
						}
						return queryResult;						
						
					case AGGREGATE_ISSUES_PER_DECADE_ALL:
						query = "FOR r IN loddwhbench COLLECT decade = SUBSTRING(r.DCTERMS_ISSUED, 0, 3) WITH COUNT INTO length SORT length DESC, decade ASC RETURN { 'decade' : decade, 'count' : length }";
						documentCursor = arangoDriver.executeDocumentQuery(query, null, arangoDriver.getDefaultAqlQueryOptions(), BaseDocument.class);
						for (DocumentEntity<BaseDocument> documentEntity : documentCursor) {
							PushTwoColumnsToQueryResult(documentEntity.getEntity(), "decade", "count", queryResult);
						}
						return queryResult;
						
					case AGGREGATE_ISSUES_PER_DECADE_TOP10:
						query = "FOR r IN loddwhbench COLLECT decade = SUBSTRING(r.DCTERMS_ISSUED, 0, 3) WITH COUNT INTO length SORT length DESC, decade ASC LIMIT 10 RETURN { 'decade' : decade, 'count' : length }";
						documentCursor = arangoDriver.executeDocumentQuery(query, null, arangoDriver.getDefaultAqlQueryOptions(), BaseDocument.class);
						for (DocumentEntity<BaseDocument> documentEntity : documentCursor) {
							PushTwoColumnsToQueryResult(documentEntity.getEntity(), "decade", "count", queryResult);
						}
						return queryResult;
						
					case AGGREGATE_ISSUES_PER_DECADE_TOP100:
						query = "FOR r IN loddwhbench COLLECT decade = SUBSTRING(r.DCTERMS_ISSUED, 0, 3) WITH COUNT INTO length SORT length DESC, decade ASC LIMIT 100 RETURN { 'decade' : decade, 'count' : length }";
						documentCursor = arangoDriver.executeDocumentQuery(query, null, arangoDriver.getDefaultAqlQueryOptions(), BaseDocument.class);
						for (DocumentEntity<BaseDocument> documentEntity : documentCursor) {
							PushTwoColumnsToQueryResult(documentEntity.getEntity(), "decade", "count", queryResult);
						}
						return queryResult;
				}
				break;
				
				
			case NONE:
				switch(queryScenario){
					case SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY:
						query = "FOR r IN loddwhbench UPDATE r WITH { newfield: 'cheesecake' } IN loddwhbench";
						arangoDriver.executeDocumentQuery(query, null, arangoDriver.getDefaultAqlQueryOptions(), BaseDocument.class);
						return queryResult;
						
					case SCHEMA_CHANGE_INTRODUCE_STRING_OP:
						query = "FOR r IN loddwhbench UPDATE r WITH { idSuffix: SUBSTRING(r.RDF_ABOUT, 29) } IN loddwhbench";
						arangoDriver.executeDocumentQuery(query, null, arangoDriver.getDefaultAqlQueryOptions(), BaseDocument.class);
						return queryResult;
						
					case SCHEMA_CHANGE_MIGRATE_RDF_TYPE:
						query = "FOR r IN loddwhbench UPDATE r WITH { manifestation: false, bibresource: false, book: false } IN loddwhbench";
						arangoDriver.executeDocumentQuery(query, null, arangoDriver.getDefaultAqlQueryOptions(), BaseDocument.class);
						query = "FOR r IN loddwhbench FILTER 'http://purl.org/dc/terms/BibliographicResource' in r.RDF_TYPE UPDATE r WITH { bibresource: true } IN loddwhbench";
						arangoDriver.executeDocumentQuery(query, null, arangoDriver.getDefaultAqlQueryOptions(), BaseDocument.class);
						query = "FOR r IN loddwhbench FILTER 'http://purl.org/vocab/frbr/core#Manifestation' in r.RDF_TYPE UPDATE r WITH { manifestation: true } IN loddwhbench";
						arangoDriver.executeDocumentQuery(query, null, arangoDriver.getDefaultAqlQueryOptions(), BaseDocument.class);
						query = "FOR r IN loddwhbench FILTER 'http://purl.org/ontology/bibo/Book' in r.RDF_TYPE UPDATE r WITH { book: true } IN loddwhbench";
						arangoDriver.executeDocumentQuery(query, null, arangoDriver.getDefaultAqlQueryOptions(), BaseDocument.class);
						return queryResult;
						
					case SCHEMA_CHANGE_REMOVE_RDF_TYPE:
						query = "FOR r IN loddwhbench UPDATE r WITH { RDF_TYPE: null } IN loddwhbench OPTIONS { keepNull: false }";
						arangoDriver.executeDocumentQuery(query, null, arangoDriver.getDefaultAqlQueryOptions(), BaseDocument.class);
						return queryResult;
						
					case UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM:
						query = "FOR r IN loddwhbench FILTER r.DCTERMS_MEDIUM == 'paper' UPDATE r WITH { DCTERMS_MEDIUM: 'recycled trees' } IN loddwhbench";
						arangoDriver.executeDocumentQuery(query, null, arangoDriver.getDefaultAqlQueryOptions(), BaseDocument.class);
						return queryResult;
						
					case UPDATE_HIGH_SELECTIVITY_NON_ISSUED:
						query = "FOR r IN loddwhbench FILTER !HAS(r, 'DCTERMS_ISSUED') UPDATE r WITH { DCTERMS_ISSUED: '0' } IN loddwhbench";
						arangoDriver.executeDocumentQuery(query, null, arangoDriver.getDefaultAqlQueryOptions(), BaseDocument.class);
						return queryResult;
						
					case DELETE_LOW_SELECTIVITY_PAPER_MEDIUM:
						query = "FOR r IN loddwhbench FILTER r.DCTERMS_MEDIUM == 'recycled trees' REMOVE r in loddwhbench";
						arangoDriver.executeDocumentQuery(query, null, arangoDriver.getDefaultAqlQueryOptions(), BaseDocument.class);
						return queryResult;
						
					case DELETE_HIGH_SELECTIVIY_NON_ISSUED:
						query = "FOR r IN loddwhbench FILTER r.DCTERMS_ISSUED == '0' REMOVE r in loddwhbench";
						arangoDriver.executeDocumentQuery(query, null, arangoDriver.getDefaultAqlQueryOptions(), BaseDocument.class);
						return queryResult;
				}
				break;
		}
		
		//throw new RuntimeException("ArangoDB-query() finished without return");
		return null;
	}

}
