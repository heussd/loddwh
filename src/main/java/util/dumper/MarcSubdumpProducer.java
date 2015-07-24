package util.dumper;

import java.io.File;

import util.Dataset;

public class MarcSubdumpProducer extends Helpers {
	public static void main(String[] args) throws Exception {

		dumpMarc("28873806", MARC_DUMP, new File("299709647.marc.gz"));
	}

	private static final Dataset MARC_DUMP = Dataset.HeBIS_Hauptbestand_in_MARC_gz;

}
