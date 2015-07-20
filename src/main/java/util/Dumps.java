package util;

import java.io.File;

public enum Dumps {
	HeBIS_Hauptbestand_in_MARC_gz("HeBIS_Hauptbestand_in_MARC.gz"),
	hebis_29873806_36057474_rdf_gz("hebis-29873806-36057474.rdf.gz"),
	hebis_00000001_05051126_rdf_gz("hebis-00000001-05051126.rdf.gz"),
	hebis_subdump_299709647_marc_gz("subdumps/299709647.marc.gz"),
	hebis_29873806_36057474_rdf_gz_marc_gz("subdumps/hebis_29873806_36057474_rdf_gz.marc.gz"),
	hebis_small_rdf("subdumps/hebis_299709647-307897400_rdf.gz"),
	hebis_small_marc("subdumps/hebis_299709647-307897400_marc.gz"),
	hebis_26887668_29873805_rdf_gz("hebis-26887668-29873805.rdf.gz"),
	hebis_21257740_26887667_rdf_gz("hebis-21257740-26887667.rdf.gz"),
	hebis_13050073_21257739_rdf_gz("hebis-13050073-21257739.rdf.gz");

	private Dumps(String filename) {
		this.file = new File(WHERE_THE_FILES_AT + filename);
	}

	/* Change this */
	private final static String WHERE_THE_FILES_AT = "/Users/th/Ph.D./HeBIS Zulieferungen Juni 2015/";
	public final File file;
}
