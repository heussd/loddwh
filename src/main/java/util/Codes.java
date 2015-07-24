package util;

import java.util.regex.Pattern;

public enum Codes {

	DCTERMS_IDENTIFIER("dcterms:identifier", "035", 'a'),
	BIBO_OCLCNUM("bibo:oclcnum", "035", 'a'),
	RDF_ABOUT("rdf:Description rdf:about", "http://lod.hebis.de/resource/", true),
	DCTERMS_TITLE("dcterms:title", "245", 'a'),
	DCTERMS_PUBLISHER("dcterms:publisher", "260", 'b'),
	ISBD_P1017("isbd:P1017", "260", 'b'),
	ISBD_P1016("isbd:P1016", "260", 'a'),
	ISBD_P1008("isbd:P1008", "250", 'a'),
	ISBD_P1006("isbd:P1006", "245", 'b'),
	ISBD_P1004("isbd:P1004", "245", 'a'),
	ISBD_P1018("isbd:P1018", "260", 'c'),
	DCTERMS_ISSUED("dcterms:issued", "260", 'c'),
	OWL_SAMEAS("owl:sameas", "035", 'a'),
	RDF_TYPE("rdf:type rdf:resource", true, true),
	DCTERMS_MEDIUM("dcterms:medium", "paper"), // Via 300?
	DCTERMS_FORMAT("dcterms:format", "print"), // Via 300?
	BIBO_EDITION("bibo:edition", "250", 'a'),
	WDRS_DESCRIBEDBY("wdrs:describedby rdf:resource", "http://lod.hebis.de/catalog/html/", true),
	DCTERMS_SUBJECT("dcterms:subject", "650", '0', "http://d-nb.info/gnd/", true, false),
	DCTERM_CONTRIBUTOR("dcterms:contributor");

	Codes(String rdfProperty, boolean isMultiple, boolean attributeValue) {
		this(rdfProperty, null, '0', null, isMultiple, attributeValue);
	}

	Codes(String rdfProperty, String constant, boolean attributeValue) {
		this(rdfProperty, null, '0', constant, false, attributeValue);
	}

	Codes(String rdfProperty, String constant) {
		this(rdfProperty, null, '0', constant, false, false);
	}

	Codes(String rdfProperty) {
		this(rdfProperty, null, '0', null, false, false);
	}

	Codes(String rdfProperty, String marcCode, char subfield, boolean isList) {
		this(rdfProperty, marcCode, subfield, null, isList, false);
	}

	Codes(String rdfProperty, String marcCode, char subfield) {
		this(rdfProperty, marcCode, subfield, null, false, false);
	}

	Codes(String rdfProperty, String marcCode, char subfield, String constant, boolean multiple, boolean attributeValue) {
		this.MARC_CODE = marcCode;
		this.SUBFIELD = subfield;
		this.CONSTANT = constant;
		this.IS_MULTIPLE = multiple;
		this.rdfProperty = rdfProperty;
		this.attributeValue = attributeValue;

		if (rdfProperty != null) {
			if (attributeValue) {
				this.rdfPattern = Pattern.compile(Pattern.quote("<" + rdfProperty + "=\"") + "(.*)" + Pattern.quote("\"") + "/?" + Pattern.quote(">"));
			} else {
				this.rdfPattern = Pattern.compile(Pattern.quote("<" + rdfProperty + ">") + "(.*)" + Pattern.quote("</" + rdfProperty + ">"));
			}
		} else {
			this.rdfPattern = null;
		}
	}

	public final String MARC_CODE;
	public final char SUBFIELD;
	public final String CONSTANT;
	public final boolean IS_MULTIPLE;
	public final String rdfProperty;
	public final Pattern rdfPattern;
	public final boolean attributeValue;
}
