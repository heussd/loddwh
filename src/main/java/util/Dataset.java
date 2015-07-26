package util;

import java.io.File;

/**
 * Represents a set of "raw" entities to be loaded.
 */
public enum Dataset {

	// TODO: @Marco: Wir brauchen eine Möglichkeit, pro Dataset und
	// QueryScenario erwartete Ergebnisse zu formulieren
	HeBIS_Hauptbestand_in_MARC_gz(Config.WHERE_THE_FILES_AT, "HeBIS_Hauptbestand_in_MARC.gz"),
	hebis_29873806_36057474_rdf_gz(Config.WHERE_THE_FILES_AT, "hebis-29873806-36057474.rdf.gz"),
	hebis_00000001_05051126_rdf_gz(Config.WHERE_THE_FILES_AT, "hebis-00000001-05051126.rdf.gz"),
	hebis_26887668_29873805_rdf_gz(Config.WHERE_THE_FILES_AT, "hebis-26887668-29873805.rdf.gz"),
	hebis_21257740_26887667_rdf_gz(Config.WHERE_THE_FILES_AT, "hebis-21257740-26887667.rdf.gz"),
	hebis_13050073_21257739_rdf_gz(Config.WHERE_THE_FILES_AT, "hebis-13050073-21257739.rdf.gz"),
	hebis_tiny_rdf("hebis_1000_rdf.gz"),
	hebis_tiny_marc("hebis_1000_marc.gz"),
	hebis_small_rdf("hebis_10000_rdf.gz"),
	hebis_small_marc("hebis_10000_marc.gz"),
	hebis_medium_rdf("hebis_100000_rdf.gz"),
	hebis_medium_marc("hebis_100000_marc.gz");

	private Dataset(String filename) {
		this.file = new File(this.getClass().getResource("/" + filename).getFile());
		this.string = new String(this.getClass().getResource("/" + filename).getFile());
	}

	private Dataset(String path, String filename) {
		this.file = new File(path + filename);
		this.string = new String(path + filename);
	}

	public final File file;
	public final String string;
}