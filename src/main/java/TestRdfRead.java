import java.util.ArrayList;
import java.util.HashMap;

import util.Codes;
import util.DataObject;
import util.Dataset;
import util.dumper.Helpers;

public class TestRdfRead extends Helpers {

	HashMap<String, DataObject> data = new HashMap<>();

	public void lalaprinter(DataObject dataObject) {

		if (data.size() % 100 == 0)
			System.out.println(data.size());

		data.put(dataObject.getId(), dataObject);
		// System.out.println(dataObject);
		// return true;
	}

	public static void main(String[] args) throws Exception {
		TestRdfRead testRdfRead = new TestRdfRead();
		testRdfRead.doit();
	}

	public void doit() {
		Dataset dumps = Dataset.hebis_1000_records;

		TestRdfRead testRdfRead = new TestRdfRead();

		// String lala = "";

		readRdf(dumps, dataObject -> {
			System.out.println(((ArrayList<String>)dataObject.get(Codes.RDF_TYPE)).size());
		});
	}

}
