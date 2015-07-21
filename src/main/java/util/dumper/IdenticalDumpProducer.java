package util.dumper;

import java.io.File;
import java.util.ArrayList;

import redis.clients.jedis.Jedis;

public class IdenticalDumpProducer extends Helpers {

	public static void main(String[] args) throws Exception {
		Jedis jedis = new Jedis("localhost");

		//
		// writeRdfIntoRedis(jedis, Dumps.hebis_13050073_21257739_rdf_gz);
		// writeRdfIntoRedis(jedis, Dumps.hebis_21257740_26887667_rdf_gz);
		// writeRdfIntoRedis(jedis, Dumps.hebis_26887668_29873805_rdf_gz);
		// writeRdfIntoRedis(jedis, Dumps.hebis_29873806_36057474_rdf_gz);

		for (int i : new int[] { 1000, 10000, 100000 }) {
			produceIdenticalMarcAndRdfDump(jedis, "hebis_" + i, i);
			ArrayList<String> rdfIds = idsFromRdfDump(new File("hebis_" + i + "_rdf.gz"));
			ArrayList<String> marcIds = idsFromMarcDump(new File("hebis_" + i + "_marc.gz"));

			// System.out.println(minId(rdfIds));
			// System.out.println(maxId(rdfIds));
			compare("RDF IDs", rdfIds, "MARC IDs", marcIds);
			System.out.println("\n");
		}

	}
}
