package util;

public enum Codes {

	DCTERMS_IDENTIFIER("035", 'a'),
	BIBO_OCLCNUM("035", 'a'),
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
	RDF_TYPE("", true),
	DCTERMS_MEDIUM("paper"), // Via 300?
	DCTERMS_FORMAT("print"), // Via 300?
	BIBO_EDITION("250", 'a'),
	WDRS_DESCRIBEDBY("http://lod.hebis.de/catalog/html/"),
	DCTERMS_SUBJECT("650", '0', "http://d-nb.info/gnd/", true),
	TEST_006("TEST_006"),
	TEST_007("TEST_007");

	Codes(String constant, boolean isMultiple) {
		this(null, '0', constant, isMultiple);
	}
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
