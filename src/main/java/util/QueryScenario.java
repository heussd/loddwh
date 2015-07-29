package util;

public enum QueryScenario {

	/**
	 * Retrieve all information associated to the single entity specified by a
	 * given ID.
	 */
	ENTITY_RETRIEVAL_BY_ID_CASE1,
	// TINY: 268893950

	/**
	 * Count the publications per publisher and order by this count descending.
	 * Return two columns (publisher + the respective count). Show the 10
	 * highest counts.
	 */
	AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP10,
	/**
	 * Count the publications per publisher and order by this count descending.
	 * Return two columns (publisher + the respective count). Show the 100
	 * highest counts.
	 */
	AGGREGATE_PUBLICATIONS_PER_PUBLISHER_TOP100,

	/**
	 * Count the publications per publisher and order by this count descending.
	 * Return two columns (publisher + the respective count). Show all counts.
	 */
	AGGREGATE_PUBLICATIONS_PER_PUBLISHER_ALL,

	/**
	 * Count the publications per issued century and order by this count
	 * descending. Return two columns (century + the respective count). Show the
	 * 10 highest counts.
	 */
	AGGREGATE_ISSUES_PER_CENTURY_TOP10,

	/**
	 * Count the publications per issued century and order by this count
	 * descending. Return two columns (century + the respective count). Show the
	 * 100 highest counts.
	 */
	AGGREGATE_ISSUES_PER_CENTURY_TOP100,

	/**
	 * Count the publications per issued century and order by this count
	 * descending. Return two columns (century + the respective count). Show all
	 * results.
	 */
	AGGREGATE_ISSUES_PER_CENTURY_ALL,

	/**
	 * Returns all complete entities which contain the word "Studie" or "Study"
	 * (case insensitive) in their title. This effects about 2%.
	 */
	CONDITIONAL_TABLE_SCAN_ALL_STUDIES,

	/**
	 * Returns all complete entities which are "Bibliographic Resources". This
	 * effects about 92% of all entities in the Dataset.
	 */
	CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES,

	/**
	 * Returns all complete entities which are "Bibliographic Resource" and
	 * contain the word "Studie" or "Study" (case insensitive) in their title.
	 */
	CONDITIONAL_TABLE_SCAN_ALL_BIBLIOGRAPHIC_RESOURCES_AND_STUDIES,

	/**
	 * For each record, find records that share a DCTERMS_SUBJECT and return:
	 * original.dcterms_identifier, original.dcterms_subject,
	 * related.dcterms_identifier. E.g.:
	 * 
	 * "272250422" -> "http://d-nb.info/gnd/1007928-2" <- "272527807"
	 */
	GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_1HOP,

	/**
	 * For each record, find records that share a DCTERMS_SUBJECT, find records
	 * that share a DCTERMS-SUBJECT with those, and return:
	 * original.dcterms_identifier, original.dcterms_subject,
	 * firstrelated.dcterms_identifier, secondrelated.dcterms_identifier.
	 */
	GRAPH_LIKE_RELATED_BY_DCTERMS_SUBJECTS_2HOPS,

	/**
	 * 
	 */
	GRAPH_LIKE_STROLLING_VIA_DCTERM_SUBJECTS,

	SCHEMA_CHANGE_CREATE_COL(false),
	SCHEMA_CHANGE_MIGRATE_COL(false),
	SCHEMA_CHANGE_DELETE_COL(false),

	UPDATE_LOW_SELECTIVITY(false),
	UPDATE_HIGH_SELECTIVITY(false),

	DELETE_LOW_SELECTIVITY(false),
	DELETE_HIGH_SELECTIVIY(false);

	public final boolean isReadOnly;

	private QueryScenario() {
		this.isReadOnly = true;
	}

	QueryScenario(boolean readonly) {
		this.isReadOnly = readonly;
	}

}
