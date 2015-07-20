package util;
public enum Codes {

	/*
	 * Missing!! <rdf:type
	 * rdf:resource="http://purl.org/vocab/frbr/core#Manifestation"/>
	 * <wdrs:describedby
	 * rdf:resource="http://lod.hebis.de/catalog/html/00000827"/> <rdf:type
	 * rdf:resource="http://purl.org/dc/terms/BibliographicResource"/> <rdf:type
	 * rdf:resource="http://purl.org/ontology/bibo/Book"/>
	 */
	DCTERMS_IDENTIFIER("035", 'a'),
	RDF_ABOUT("http://lod.hebis.de/resource/"),
	DCTERMS_TITLE("245", 'a'),
	DCTERMS_PUBLISHER("260", 'b'),
	ISBD_P1017("260", 'b'),
	ISBD_P1016("260", 'a'),
	ISBD_P1008("250", 'a'),
	ISBD_P1006("245", 'b'),
	ISBD_P1004("245", 'a'),
	ISBD_P1018("260", 'c'),
	DCTERMS_ISSUED("260", 'c'),
	OWL_SAMEAS("035", 'a'),
	DCTERMS_MEDIUM("paper"), // Via 300?
	DCTERMS_FORMAT("print"), // Via 300?
	BIBO_EDITION("250", 'a'),
	WDRS_DESCRIBEDBY("http://lod.hebis.de/catalog/html/"),
	DCTERMS_SUBJECT("650", '0', "http://d-nb.info/gnd/", true);

	Codes(String constant) {
		this(null, '0', constant, false);
	}

	Codes(String marcCode, char subfield, boolean isList) {
		this(marcCode, subfield, null, isList);
	}

	Codes(String marcCode, char subfield) {
		this(marcCode, subfield, null, false);
	}

	Codes(String marcCode, char subfield, String constant, boolean multiple) {
		this.MARC = marcCode;
		this.subfield = subfield;
		this.FIXEDVALUE = constant;
		this.isMultible = multiple;
	}

	final String MARC;
	final char subfield;
	final String FIXEDVALUE;
	final boolean isMultible;
}
