import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.zip.GZIPInputStream;

import util.Config.Dumps;
import util.DataObject;


public class TestRdfRead {

	public static void main(String[] args) throws Exception {
		DataObject dataObject = new DataObject();
		
		
		Dumps dumps = Dumps.hebis_26887668_29873805_rdf_gz;

		InputStream inputStream = new GZIPInputStream(new FileInputStream(dumps.file));
		/*
		 * Skips "Content-Type: application/rdf+xml; charset=UTF-8
		 * 
		 * " at the beginning of each file - what could possibly go wrong?
		 */
		inputStream.skip(50);
		BufferedReader inputReader = new BufferedReader(new InputStreamReader(inputStream));
		// PrintWriter printWriter = new PrintWriter(new File(target));

		String rdfHeader = "";
		boolean headerWrittenYet = false;
		int counter = 0, writes = 0;
		String inline = "", record = "", id = "";
		while ((inline = inputReader.readLine()) != null) {
			if (inline.contains("<dcterms:identifier>")) {
				if (++counter % 100000 == 0) {
					System.out.println(counter + " RDF records so far, " + writes + " writes...");
				}
				id = (inline.substring(inline.lastIndexOf("<dcterms:identifier>") + 20, inline.lastIndexOf("</dcterms:identifier>"))).trim();
			}
			if (!headerWrittenYet && inline.contains("<rdf:Description")) {
				rdfHeader = record.trim();
				record = "";
				headerWrittenYet = true;
			}

			record += inline.trim() + "\n";

			if (inline.contains("</rdf:Description>")) {

//				record = "";

				break;

			}

		}
		dataObject.fromRdfString(record);
		System.out.println(dataObject);
		

	}

}
