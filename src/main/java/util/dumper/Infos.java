package util.dumper;

import java.io.File;
import java.util.ArrayList;

import util.Dumps;

public class Infos extends Helpers {

	public static void main(String[] args) throws Exception {

		ArrayList<String> rdfIds = idsFromRdfDump(new File("testme_rdf.gz"));
		ArrayList<String> marcIds = idsFromMarcDump(new File("testme_marc.gz"));
		
		
//		System.out.println(minId(rdfIds));
//		System.out.println(maxId(rdfIds));
		compare("RDF IDs", rdfIds, "MARC IDs", marcIds);

	}

}
