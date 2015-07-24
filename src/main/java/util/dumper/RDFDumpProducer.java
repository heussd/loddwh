package util.dumper;

import util.Dataset;

public class RDFDumpProducer extends Helpers {
	public static void main(String[] args) throws Exception {

		writeRdfExtract(idsFromMarcDump(Dataset.hebis_small_rdf.file), Dataset.hebis_29873806_36057474_rdf_gz, "lalafile");
	}
}
