package database;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.arangodb.ArangoConfigure;
import com.arangodb.ArangoDriver;
import com.arangodb.DocumentCursor;
import com.arangodb.entity.BaseDocument;
import com.arangodb.entity.DocumentEntity;
import com.arangodb.entity.EdgeDefinitionEntity;
import com.arangodb.util.AqlQueryOptions;
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
		return "2.6.9 64bit -- ICU 54.1, V8 4.1.0.27, OpenSSL 1.0.2d 9 Jul 2015 / Java Driver 2.6.8";
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
		
		QueryScenario testScenario = QueryScenario.GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES;
		
		arangoDb.prepare(testScenario);
		QueryResult queryResult = arangoDb.query(testScenario);
		
		//System.out.println(queryResult);
		
		arangoDb.stop();
	}
	
	ArangoDriver arangoDriver;

	@Override
	public void start() {
		if (Config.THIS_IS_OSX)
			Helpers.terminalLaunchScript("arangodb.sh", 20);
		
		ArangoConfigure configure = new ArangoConfigure();
		configure.init();
		arangoDriver = new ArangoDriver(configure);
	}

	@Override
	public void stop() {
		if (Config.THIS_IS_OSX)
			Helpers.terminalLaunchScript("arangodb_stop.sh", 10);
	}

	@Override
	public void clean() throws Exception {		
		if(arangoDriver.getDatabases().getResult().contains(Config.DATABASE))
			arangoDriver.deleteDatabase(Config.DATABASE);
	}

	@Override
	public void setUp() throws Exception {
		arangoDriver.createDatabase(Config.DATABASE);
		arangoDriver.setDefaultDatabase(Config.DATABASE);
		arangoDriver.createCollection(Config.DATABASE);
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
				System.err.println("Konnte ein ArangoDocument nicht einf�gen.");
				e.printStackTrace();
			}
			
		} , counter -> {
			if (counter % 50000 == 0)
				System.out.println(counter + " records so far... (ArangoDB load())");
		});
		
	}
	
	private AqlQueryOptions GetAqlQueryOptionsForLongRunningCursor(){
		return new AqlQueryOptions().setCount(false).setFullCount(false).setTtl(60 * 60); // TTL in seconds, now 1 hour, doesn't matter if cursors are correctly closed after usage
	}
	
	private boolean GraphLoaded = false;
	private void InitializeDctermsSubjectsGraph() throws Exception{
		String graphName = Config.DATABASE + "_graph", edgeCollectionName = Config.DATABASE + "_hasSubject", subjectsCollection = Config.DATABASE + "_subjects";
		
		arangoDriver.createCollection(subjectsCollection);
		EdgeDefinitionEntity edgeDefinition = new EdgeDefinitionEntity();
		edgeDefinition.setCollection(edgeCollectionName);
		List<String> from = new ArrayList<>(), to = new ArrayList<>();
		from.add(Config.DATABASE); to.add(subjectsCollection);
		edgeDefinition.setFrom(from); edgeDefinition.setTo(to);
		List<EdgeDefinitionEntity> edgeDefinitions = new ArrayList<>();
		edgeDefinitions.add(edgeDefinition);
		arangoDriver.createGraph(graphName, edgeDefinitions, new ArrayList<String>(), true);
		
		String getAllRelevantQuery = "for e in loddwhbench filter has(e, 'DCTERMS_SUBJECT') return { 'id' : e._id, 'DCTERMS_SUBJECT' : e.DCTERMS_SUBJECT }";
		DocumentCursor<BaseDocument> getAllRelevantCursor = arangoDriver.executeDocumentQuery(getAllRelevantQuery, null, GetAqlQueryOptionsForLongRunningCursor(), BaseDocument.class);
		HashMap<String, String> existingSubjects = new HashMap<>(); // Map Subject => DocumentHandle (temporarily saving to prevent additional queries)
		for(DocumentEntity<BaseDocument> relevantDocument : getAllRelevantCursor){
			BaseDocument document = relevantDocument.getEntity();
			
			String documentHandle = document.getAttribute("id").toString();
			ArrayList<String> documentSubjects = (ArrayList<String>) document.getAttribute("DCTERMS_SUBJECT");
			
			for (String subject : documentSubjects) {
				if(!existingSubjects.containsKey(subject)){
					BaseDocument arangoDoc = new BaseDocument();
					arangoDoc.addAttribute("subject", subject);
					DocumentEntity<BaseDocument> newSubjectDocument = arangoDriver.createDocument(subjectsCollection, arangoDoc);
					existingSubjects.put(subject, newSubjectDocument.getDocumentHandle());
				}
				
				String subjectHandle = existingSubjects.get(subject);
				arangoDriver.graphCreateEdge(graphName, edgeCollectionName, documentHandle, subjectHandle, null, null);
			}
		}
		getAllRelevantCursor.close();
		
		GraphLoaded = true;
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
	}
	
	private List<String> EntityRetrievalAndGraphScenariosDcTermsIdentifiers = new ArrayList<>();
	private void FillEntityRetrievalAndGraphScenariosDcTermsIdentifiers(BaseDocument doc){
		if(doc.getAttribute("DCTERMS_IDENTIFIER") == null){
			System.err.println("ArangoDB, prepare ENTITY_RETRIEVAL/GRAPH: One element has no DCTERMS_IDENTIFIER. Element is ignored. Query-Size will not be 1, 10 or 100.");
			return;
		}
		EntityRetrievalAndGraphScenariosDcTermsIdentifiers.add(doc.getAttribute("DCTERMS_IDENTIFIER").toString());
	}
	
	@Override
	public void prepare(QueryScenario queryScenario) throws Exception {
		String query;
		DocumentCursor<BaseDocument> documentCursor;
		String filterString = "";
		
		if(queryScenario == QueryScenario.GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY || queryScenario == QueryScenario.GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES) {
//			|| queryScenario == QueryScenario.GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES || queryScenario == QueryScenario.GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY || queryScenario == QueryScenario.GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES || queryScenario == QueryScenario.GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES){
			if(!GraphLoaded) InitializeDctermsSubjectsGraph();
			filterString = "FILTER HAS(r, 'DCTERMS_SUBJECT')";
		}
		
		switch(queryScenario){
			case CONDITIONAL_TABLE_SCAN_ALL_STUDIES:
				arangoDriver.createFulltextIndex(Config.DATABASE, "DCTERMS_TITLE");
				break;
				
			case ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY:
			case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY:
//			case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY:
				EntityRetrievalAndGraphScenariosDcTermsIdentifiers.clear();
				query = String.format("FOR r IN loddwhbench %s SORT r.DCTERMS_MEDIUM, r.ISBD_P1008, r.DCTERM_CONTRIBUTOR, r.DCTERMS_ISSUED, r.DCTERMS_IDENTIFIER LIMIT 1 RETURN { 'DCTERMS_IDENTIFIER' : r.DCTERMS_IDENTIFIER }", filterString);
				documentCursor = arangoDriver.executeDocumentQuery(query, null, arangoDriver.getDefaultAqlQueryOptions(), BaseDocument.class);
				for (DocumentEntity<BaseDocument> documentEntity : documentCursor) {
					FillEntityRetrievalAndGraphScenariosDcTermsIdentifiers(documentEntity.getEntity());
				}
				break;
				
			case ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES:
			case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES:
//			case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES:
				EntityRetrievalAndGraphScenariosDcTermsIdentifiers.clear();
				query = String.format("FOR r IN loddwhbench %s SORT r.DCTERMS_MEDIUM, r.ISBD_P1008, r.DCTERM_CONTRIBUTOR, r.DCTERMS_ISSUED, r.DCTERMS_IDENTIFIER LIMIT 10 RETURN { 'DCTERMS_IDENTIFIER' : r.DCTERMS_IDENTIFIER }", filterString);
				documentCursor = arangoDriver.executeDocumentQuery(query, null, arangoDriver.getDefaultAqlQueryOptions(), BaseDocument.class);
				for (DocumentEntity<BaseDocument> documentEntity : documentCursor) {
					FillEntityRetrievalAndGraphScenariosDcTermsIdentifiers(documentEntity.getEntity());
				}
				break;
				
			case ENTITY_RETRIEVAL_BY_ID_100_ENTITIES:
			case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES:
//			case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES:
				EntityRetrievalAndGraphScenariosDcTermsIdentifiers.clear();
				query = String.format("FOR r IN loddwhbench %s SORT r.DCTERMS_MEDIUM, r.ISBD_P1008, r.DCTERM_CONTRIBUTOR, r.DCTERMS_ISSUED, r.DCTERMS_IDENTIFIER LIMIT 100 RETURN { 'DCTERMS_IDENTIFIER' : r.DCTERMS_IDENTIFIER }", filterString);
				documentCursor = arangoDriver.executeDocumentQuery(query, null, arangoDriver.getDefaultAqlQueryOptions(), BaseDocument.class);
				for (DocumentEntity<BaseDocument> documentEntity : documentCursor) {
					FillEntityRetrievalAndGraphScenariosDcTermsIdentifiers(documentEntity.getEntity());
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
						for (String dcterms_identifier : EntityRetrievalAndGraphScenariosDcTermsIdentifiers) {
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
					case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_ONE_ENTITY:
					case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_10_ENTITIES:
					case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP_100_ENTITIES:
						for (String dcterms_identifier : EntityRetrievalAndGraphScenariosDcTermsIdentifiers) {
							query = String.format("for e in GRAPH_NEIGHBORS('loddwhbench_graph', {DCTERMS_IDENTIFIER: '%s'}, {direction: 'outbound', includeData: true}) return e", dcterms_identifier);
							documentCursor = arangoDriver.executeDocumentQuery(query, null, arangoDriver.getDefaultAqlQueryOptions(), BaseDocument.class);
							for(DocumentEntity<BaseDocument> documentEntity : documentCursor){
								BaseDocument subjectDocument = documentEntity.getEntity();
								String sharedSubject = subjectDocument.getAttribute("subject").toString();
								
								String innerQuery = String.format("for e in GRAPH_NEIGHBORS('loddwhbench_graph', {_id: '%s'}, {direction: 'inbound', includeData: true}) return { 'DCTERMS_IDENTIFIER': e.DCTERMS_IDENTIFIER }", documentEntity.getDocumentHandle());
								DocumentCursor<BaseDocument> innerCursor = arangoDriver.executeDocumentQuery(innerQuery, null, arangoDriver.getDefaultAqlQueryOptions(), BaseDocument.class);
								for(DocumentEntity<BaseDocument> documentEntity2 : innerCursor){
									String relatedDctermsIdentifier = documentEntity2.getEntity().getAttribute("DCTERMS_IDENTIFIER").toString();
									if(!dcterms_identifier.equals(relatedDctermsIdentifier)){
										queryResult.push(dcterms_identifier, sharedSubject, relatedDctermsIdentifier);
										//System.out.println(String.format("%s => %s <= %s", dcterms_identifier, sharedSubject, relatedDctermsIdentifier));
									}
								}
								innerCursor.close();
							}
							documentCursor.close();
						}
						return queryResult;
						
						
//					case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_ONE_ENTITY:
//					case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_10_ENTITIES:
//					case GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS_100_ENTITIES:
//						for (String dcterms_identifier : EntityRetrievalAndGraphScenariosDcTermsIdentifiers) {
//							query = String.format("for e in GRAPH_NEIGHBORS('loddwhbench_graph', {DCTERMS_IDENTIFIER: '%s'}, {direction: 'outbound', includeData: true}) return e", dcterms_identifier);
//							documentCursor = arangoDriver.executeDocumentQuery(query, null, arangoDriver.getDefaultAqlQueryOptions(), BaseDocument.class);
//							for(DocumentEntity<BaseDocument> documentEntity : documentCursor){
//								BaseDocument subjectDocument = documentEntity.getEntity();
//								String sharedSubject = subjectDocument.getAttribute("subject").toString();
//								
//								String innerQuery = String.format("for e in GRAPH_NEIGHBORS('loddwhbench_graph', {_id: '%s'}, {direction: 'inbound', includeData: true}) return { 'DCTERMS_IDENTIFIER': e.DCTERMS_IDENTIFIER, 'id': e._id }", documentEntity.getDocumentHandle());
//								DocumentCursor<BaseDocument> innerCursor = arangoDriver.executeDocumentQuery(innerQuery, null, arangoDriver.getDefaultAqlQueryOptions(), BaseDocument.class);
//								for(DocumentEntity<BaseDocument> documentEntity2 : innerCursor){
//									String relatedHandle = documentEntity2.getEntity().getAttribute("id").toString();									
//									String relatedDctermsIdentifier = documentEntity2.getEntity().getAttribute("DCTERMS_IDENTIFIER").toString();
//									
//									if(dcterms_identifier.equals(relatedDctermsIdentifier)) continue;
//									
//									String secondInnerQuery = String.format("for e in GRAPH_NEIGHBORS('loddwhbench_graph', {_id: '%s'}, {direction: 'outbound', includeData: true}) return e", relatedHandle);
//									DocumentCursor<BaseDocument> secondInnerCursor = arangoDriver.executeDocumentQuery(secondInnerQuery, null, arangoDriver.getDefaultAqlQueryOptions(), BaseDocument.class);
//									for(DocumentEntity<BaseDocument> documentEntity3 : secondInnerCursor){
//										String secondSharedSubject = documentEntity3.getEntity().getAttribute("subject").toString();
//										
//										//if(sharedSubject.equals(secondSharedSubject)) continue;
//										
//										String thirdInnerQuery = String.format("for e in GRAPH_NEIGHBORS('loddwhbench_graph', {_id: '%s'}, {direction: 'inbound', includeData: true}) return { 'DCTERMS_IDENTIFIER': e.DCTERMS_IDENTIFIER }", documentEntity3.getDocumentHandle());
//										DocumentCursor<BaseDocument> thirdInnerCursor = arangoDriver.executeDocumentQuery(thirdInnerQuery, null, arangoDriver.getDefaultAqlQueryOptions(), BaseDocument.class);
//										for(DocumentEntity<BaseDocument> documentEntity4 : thirdInnerCursor){
//											String secondRelatedDctermsIdentifier = documentEntity4.getEntity().getAttribute("DCTERMS_IDENTIFIER").toString();
//											
//											if(relatedDctermsIdentifier.equals(secondRelatedDctermsIdentifier)) continue;
//											
//											queryResult.push(dcterms_identifier, sharedSubject, relatedDctermsIdentifier, secondSharedSubject, secondRelatedDctermsIdentifier);
//											System.out.println(String.format("%s => %s <= %s => %s <= %s", dcterms_identifier, sharedSubject, relatedDctermsIdentifier, secondSharedSubject, secondRelatedDctermsIdentifier));
//										}
//										thirdInnerCursor.close();
//									}
//									secondInnerCursor.close();
//								}
//								innerCursor.close();
//							}
//							documentCursor.close();
//						}
//						return queryResult;
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
		
		throw new RuntimeException("ArangoDB-query() finished without return");
	}

}
