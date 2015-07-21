package util.dumper;

import util.Config.Dumps;

public class RDFDumpProducer extends Helpers {
	public static void main(String[] args) throws Exception {

		writeRdfExtract(idsFromMarcDump(Dumps.hebis_small_rdf.file), Dumps.hebis_29873806_36057474_rdf_gz, "lalafile");
	}
}
