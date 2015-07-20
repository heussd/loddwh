package util.dumper;

import java.util.ArrayList;

import util.Dumps;

public class TestsetProducer extends Helpers {

	public static void main(String[] args) throws Exception {
		Dumps file = Dumps.hebis_small_rdf;

		ArrayList<String> ids = new ArrayList<String>();
		// ids.add("000000035");
		ids = idsFromRdfDump(file.file);

//		System.out.println(ids);

		writeMarcExtract(ids, Dumps.hebis_29873806_36057474_rdf_gz_marc_gz.file, file.toString() + ".marc.gz");
	}

}
