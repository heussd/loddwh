package util.dumper;

import util.Dataset;

public class RDFDumpProducer extends Helpers {
	public static void main(String[] args) throws Exception {

		writeRdfExtract(idsFromMarcDump(Dataset.hebis_10000_records.file), Dataset.hebis_29873806_36057474_rdf_gz, "lalafile");
	}
}
