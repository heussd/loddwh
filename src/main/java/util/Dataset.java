package util;

import java.io.File;

/**
 * Represents a set of "raw" entities to be loaded.
 */
public enum Dataset {

	HeBIS_Hauptbestand_in_MARC_gz(Config.WHERE_THE_FILES_AT, "HeBIS_Hauptbestand_in_MARC.gz"),
	hebis_29873806_36057474_rdf_gz(Config.WHERE_THE_FILES_AT, "hebis-29873806-36057474.rdf.gz"),
	hebis_00000001_05051126_rdf_gz(Config.WHERE_THE_FILES_AT, "hebis-00000001-05051126.rdf.gz"),
	hebis_05051127_10147115_rdf_gz(Config.WHERE_THE_FILES_AT, "hebis-05051127-10147115.rdf.gz"),
	hebis_10147116_13050073_rdf_gz(Config.WHERE_THE_FILES_AT, "hebis-10147116-13050073.rdf.gz"),
	hebis_26887668_29873805_rdf_gz(Config.WHERE_THE_FILES_AT, "hebis-26887668-29873805.rdf.gz"),
	hebis_21257740_26887667_rdf_gz(Config.WHERE_THE_FILES_AT, "hebis-21257740-26887667.rdf.gz"),
	hebis_13050073_21257739_rdf_gz(Config.WHERE_THE_FILES_AT, "hebis-13050073-21257739.rdf.gz"),
	hebis_1000_records("hebis_1000.rdf.gz"),
	hebis_10000_records("hebis_10000.rdf.gz"),
	hebis_100000_records("hebis_100000.rdf.gz");

	private Dataset(String filename) {
		try {
			this.file = new File(this.getClass().getResource("/" + filename).toURI());
			this.string = new String(this.getClass().getResource("/" + filename).getFile());
			this.datasetName = filename;
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}

	private Dataset(String path, String filename) {
		this.file = new File(path + filename);
		this.string = new String(path + filename);
		this.datasetName = filename;
	}

	public final File file;
	public final String string, datasetName;
}