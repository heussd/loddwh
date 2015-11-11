package main;

import util.Dataset;
import util.TestSeries;
import util.dumper.Helpers;

public class DumpReader extends Helpers {

	public static void main(String[] args) throws Exception {
		Long all = new Long("0");

		for (Dataset dataset : TestSeries.MEDIUM.datasets) {
			int count = countRdf(dataset);
			System.out.println(dataset + " has " + count + " items");
			all += count;
		}

		System.out.println("They all have " + all + " items");
	}

}
