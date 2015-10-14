package util;

import database.Database;
import util.QueryResult.Type;

/**
 * Contains a number of scenarios in which {@link Database} implementations will be evaluated. The scenarios can be grouped by their fundamental operations, so there are several
 * queries for ENTITY_RETRIEVAL, AGGREGATE, CONDITIONAL_TABLE_SCAN, GRAPH_LIKE, SCHEMA_CHANGE, UPDATE and DELETE scenarios.
 */
public enum QueryScenario {

	/**
	 * During prepare: Retrieve the first single dcterms_identifier-value from a list of all entities, ordered by dcterms_medium, isbd_p1008, dcterm_contributor, dcterms_issued,
	 * dcterms_identifier.<br>
	 * During query: Return the associated {@link DataObject}.
	 */
	ENTITY_RETRIEVAL_BY_ID_ONE_ENTITY(QueryResult.Type.COMPLETE_ENTITIES),

	/**
	 * During prepare: Retrieve the first 10 dcterms_identifier-values from a list of all entities, ordered by dcterms_medium, isbd_p1008, dcterm_contributor, dcterms_issued,
	 * dcterms_identifier.<br>
	 * During query: Return the associated {@link DataObject}s.
	 */
	ENTITY_RETRIEVAL_BY_ID_TEN_ENTITIES(QueryResult.Type.COMPLETE_ENTITIES),

	/**
	 * During prepare: Retrieve the first 100 dcterms_identifier-values from a list of all entities, ordered by dcterms_medium, isbd_p1008, dcterm_contributor, dcterms_issued,
	 * dcterms_identifier.<br>
	 * During query: Return the associated {@link DataObject}s.
	 */
	ENTITY_RETRIEVAL_BY_ID_100_ENTITIES(QueryResult.Type.COMPLETE_ENTITIES),

	/**
	 * Count the publications per publisher and order by this count descending, then by publisher name ascending. Return two columns (publisher + the respective count). Show the 10
	 * highest counts.
	 */
	AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10(QueryResult.Type.TWO_COLUMNS),
	/**
	 * Count the publications per publisher and order by this count descending, then by publisher name ascending. Return two columns (publisher + the respective count). Show the
	 * 100 highest counts.
	 */
	AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100(QueryResult.Type.TWO_COLUMNS),

	/**
	 * Count the publications per publisher and order by this count descending, then by publisher name ascending. Return two columns (publisher + the respective count). Show all
	 * counts.
	 */
	AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL(QueryResult.Type.TWO_COLUMNS),

	/**
	 * Count the publications per issued decade and order by this count descending, then by decade ascending. Return two columns (decade + the respective count). Show the 10
	 * highest counts.
	 */
	AGGREGATE_ISSUES_PER_DECADE_TOP10(QueryResult.Type.TWO_COLUMNS),

	/**
	 * Count the publications per issued decade and order by this count descending, then by decade ascending. Return two columns (decade + the respective count). Show the 100
	 * highest counts.
	 */
	AGGREGATE_ISSUES_PER_DECADE_TOP100(QueryResult.Type.TWO_COLUMNS),

	/**
	 * Count the publications per issued decade and order by this count descending, then by decade ascending. Return two columns (decade + the respective count). Show all results.
	 */
	AGGREGATE_ISSUES_PER_DECADE_ALL(QueryResult.Type.TWO_COLUMNS),

	/**
	 * Returns all complete entities which contain the word "Studie" or "Study" (case insensitive) in their title. This effects about 2%.
	 */
	CONDITIONAL_TABLE_SCAN_ALL_STUDIES(QueryResult.Type.COMPLETE_ENTITIES),

	/**
	 * Returns all complete entities which are "Bibliographic Resources". This effects about 92% of all entities in the Dataset.
	 */
	CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES(QueryResult.Type.COMPLETE_ENTITIES),

	/**
	 * Returns all complete entities which are "Bibliographic Resource" and contain the word "Studie" or "Study" (case insensitive) in their title.
	 */
	CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES(QueryResult.Type.COMPLETE_ENTITIES),

	/**
	 * For each record, find records that share a DCTERMS_SUBJECT and return: original.dcterms_identifier, original.dcterms_subject, related.dcterms_identifier. E.g.:
	 * 
	 * "272250422" -> "http://d-nb.info/gnd/1007928-2" <- "272527807"
	 */
	GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP(QueryResult.Type.GRAPH),

	/**
	 * For each record, find records that share a DCTERMS_SUBJECT, find records that share a DCTERMS-SUBJECT with those, and return: original.dcterms_identifier,
	 * original.dcterms_subject, firstrelated.dcterms_identifier, firstrelated.dcterms_subject, secondrelated.dcterms_identifier.
	 */
	GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS(QueryResult.Type.GRAPH),

	/**
	 * Create a new property for every record, defaulting to "cheesecake".
	 */
	SCHEMA_CHANGE_INTRODUCE_NEW_PROPERTY(false),

	/**
	 * Take the ID-suffix of RDF_ABOUT (e.g. "26887682" in "http://lod.hebis.de/resource/26887682") and store it in a new property.
	 */
	SCHEMA_CHANGE_INTRODUCE_STRING_OP(false),

	/**
	 * Create a boolean field for every single RDF_TYPE, each indicating if a record is of this type.
	 */
	SCHEMA_CHANGE_MIGRATE_RDF_TYPE(false),

	/**
	 * Remove RDF_TYPE from every record.
	 */
	SCHEMA_CHANGE_REMOVE_RDF_TYPE(false),

	/**
	 * Set DCTERMS_MEDIUM to "recycled trees" on records having DCTERMS_MEDIUM == "paper". This affects about 90% of the records.
	 */
	UPDATE_LOW_SELECTIVITY_PAPER_MEDIUM(false),

	/**
	 * Set DCTERMS_ISSUED to 0 on records that have no value for this property. This affects about 2% of the records.
	 */
	UPDATE_HIGH_SELECTIVITY_NON_ISSUED(false),

	/**
	 * Remove records having DCTERMS_MEDIUM == "recycled trees". This affects about 90% of the records.
	 */
	DELETE_LOW_SELECTIVITY_PAPER_MEDIUM(false),

	/**
	 * Remove records that have "0" as value for DCTERMS_ISSUED. This affects about 2% of the records.
	 */
	DELETE_HIGH_SELECTIVIY_NON_ISSUED(false);

	public final boolean isReadOnly;
	public final Type queryResultType;

	private QueryScenario(QueryResult.Type type) {
		this.queryResultType = type;
		this.isReadOnly = true;
	}

	QueryScenario(boolean readonly) {
		this.isReadOnly = readonly;
		this.queryResultType = QueryResult.Type.NONE;
	}

}
