package util.dumper;

import java.util.ArrayList;

import util.Dataset;

public class TestsetProducer extends Helpers {

	public static void main(String[] args) throws Exception {
		Dataset file = Dataset.hebis_10000_records;

		ArrayList<String> ids = new ArrayList<String>();
		// ids.add("000000035");
		ids = idsFromRdfDump(file.file);

//		System.out.println(ids);

//		writeMarcExtract(ids, Dumps.hebis_29873806_36057474_rdf_gz_marc_gz.file, file.toString() + ".marc.gz");
	}

}
