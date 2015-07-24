package util.dumper;

import java.util.ArrayList;

import util.Dataset;

public class Infos extends Helpers {

	public static void main(String[] args) throws Exception {

		ArrayList<String> rdfIds = idsFromRdfDump(Dataset.hebis_medium_rdf.file);
		ArrayList<String> marcIds = idsFromMarcDump(Dataset.hebis_medium_marc.file);
		
		
//		System.out.println(minId(rdfIds));
//		System.out.println(maxId(rdfIds));
		compare("RDF IDs", rdfIds, "MARC IDs", marcIds);

	}

}
