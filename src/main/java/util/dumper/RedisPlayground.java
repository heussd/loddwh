package util.dumper;

import redis.clients.jedis.Jedis;

public class RedisPlayground extends Helpers {

	public static void main(String[] args) throws Exception {
		Jedis jedis = new Jedis("localhost");

		
//		writeRdfIntoRedis(jedis, Dumps.hebis_small_rdf);

		produceIdenticalMarcAndRdfDump(jedis, "testme");
	}
}
