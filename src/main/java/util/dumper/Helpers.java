package util.dumper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipException;

import org.marc4j.MarcReader;
import org.marc4j.MarcStreamReader;
import org.marc4j.MarcStreamWriter;
import org.marc4j.MarcWriter;
import org.marc4j.marc.Record;

import redis.clients.jedis.Jedis;
import util.DataObject;
import util.Dataset;

public abstract class Helpers {

	public static void compare(String name1, ArrayList<String> dump1, String name2, ArrayList<String> dump2) throws Exception {
		System.out.println(name1 + " :" + dump1.size());
		System.out.println(name2 + " :" + dump2.size());

		if (dump1.size() > dump2.size()) {
			dump1.removeAll(dump2);
			System.out.println("Did not find ids: " + dump1);
		} else if (dump2.size() > dump1.size()) {
			dump2.removeAll(dump1);
			System.out.println("Did not find ids: " + dump2);
		} else if (dump1.size() == dump2.size()) {
			System.out.println("Both sets are identical :)");
		}
	}

	public static ArrayList<String> idsFromRdfDump(File rdfDump) throws Exception {
		System.out.println("Scanning " + rdfDump + " for IDs...");
		BufferedReader inputReader = null;

		try {
			inputReader = new BufferedReader(new InputStreamReader(new GZIPInputStream(new FileInputStream(rdfDump))));
		} catch (ZipException e) {
			inputReader = new BufferedReader(new InputStreamReader(new FileInputStream(rdfDump)));
		}
		ArrayList<String> ids = new ArrayList<>();

		int counter = 0;
		String inline;
		while ((inline = inputReader.readLine()) != null) {
			if (inline.contains("<dcterms:identifier>")) {
				if (++counter % 100000 == 0) {
					System.out.println(counter + " RDF records so far...");
				}
				String id = (inline.substring(inline.lastIndexOf("<dcterms:identifier>") + 20, inline.lastIndexOf("</dcterms:identifier>")));
				ids.add(id.trim());
			}
		}
		System.out.println("... done");

		inputReader.close();
		return ids;
	}

	public static ArrayList<String> idsFromMarcDump(File marcDump) throws Exception {
		System.out.println("Scanning " + marcDump + " for IDs...");
		InputStream inputStream = null;
		try {
			inputStream = new GZIPInputStream(new FileInputStream(marcDump));
		} catch (ZipException e) {
			inputStream = new FileInputStream(marcDump);
		}
		MarcReader reader = new MarcStreamReader(inputStream);
		ArrayList<String> ids = new ArrayList<>();

		int counter = 0;
		while (reader.hasNext()) {

			if (++counter % 100000 == 0) {
				System.out.println(counter + " MARC records so far...");
			}

			try {
				Record record = reader.next();
				String recordId = record.getControlNumberField().getData().trim();
				ids.add(recordId);
			} catch (Exception e) {
			}
		}

		inputStream.close();

		return ids;
	}

	public static void readRdf(Dataset dumps, Consumer<DataObject> dataObjectConsumer) {

		try {

			InputStream inputStream = new GZIPInputStream(new FileInputStream(dumps.file));
			/*
			 * Skips "Content-Type: application/rdf+xml; charset=UTF-8
			 * 
			 * " at the beginning of each file - what could possibly go wrong?
			 */
			inputStream.skip(50);
			BufferedReader inputReader = new BufferedReader(new InputStreamReader(inputStream));
			// PrintWriter printWriter = new PrintWriter(new File(target));

			boolean headerWrittenYet = false;
			int counter = 0, writes = 0;
			String inline = "", record = "";
			while ((inline = inputReader.readLine()) != null) {
				if (inline.contains("<dcterms:identifier>")) {
					if (++counter % 100000 == 0) {
						System.out.println(counter + " RDF records so far, " + writes + " writes...");
					}
				}
				if (!headerWrittenYet && inline.contains("<rdf:Description")) {
					record = "";
					headerWrittenYet = true;
				}

				record += inline.trim() + "\n";

				if (inline.contains("</rdf:Description>")) {
					DataObject dataObject = new DataObject();
					dataObject.fromRdfString(record);
					dataObjectConsumer.accept(dataObject);
					record = "";
				}
			}

			inputReader.close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public static void writeRdfExtract(ArrayList<String> wantedIds, Dataset source, String target) throws Exception {
		System.out.println("Scanning " + source + " for entites...");
		BufferedReader inputReader = new BufferedReader(new InputStreamReader(new GZIPInputStream(new FileInputStream(source.file))));
		PrintWriter printWriter = new PrintWriter(new File(target));

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
				printWriter.write(record);
				record = "\n";
			}

			record += inline.trim() + "\n";

			if (inline.contains("</rdf:Description>")) {

				if (wantedIds.contains(id)) {
					printWriter.write(record);
					writes++;
					wantedIds.remove(id);
				}
				record = "";

				if (wantedIds.isEmpty())
					break;
			}

		}
		printWriter.write("\n</rdf:RDF>");
		System.out.println("... done");

		printWriter.close();
		inputReader.close();
	}

	public static void writeRdfIntoRedis(Jedis jedis, Dataset dumps) throws Exception {
		BufferedReader inputReader = new BufferedReader(new InputStreamReader(new GZIPInputStream(new FileInputStream(dumps.file))));

		boolean headerWrittenYet = false;
		int counter = 0, errors = 0;
		String inline = "", record = "", id = "";
		while ((inline = inputReader.readLine()) != null) {
			if (inline.contains("<dcterms:identifier>")) {
				if (++counter % 100000 == 0) {
					System.out.println("Stored " + counter + " RDF records so far...");
				}
				try {
					id = (inline.substring(inline.lastIndexOf("<dcterms:identifier>") + 20, inline.lastIndexOf("</dcterms:identifier>"))).trim();
				} catch (StringIndexOutOfBoundsException e) {
					errors++;
					id = "error";
				}
			}
			if (!headerWrittenYet && inline.contains("<rdf:Description")) {
				jedis.set("RDFHEAD", record);
				record = "";
				headerWrittenYet = true;
			}

			record += inline.trim() + "\n";

			if (inline.contains("</rdf:Description>")) {
				jedis.set(id, record);
				record = "";
			}

		}

		System.out.println("\nWrote " + counter + " records, " + errors + " errors.");
	}

	public static void writeMarcExtract(ArrayList<String> wantedIds, String target) throws Exception {
		writeMarcExtract(wantedIds, Dataset.HeBIS_Hauptbestand_in_MARC_gz.file, target);
	}

	public static void writeMarcExtract(ArrayList<String> wantedIds, File marcDump, String target) throws Exception {
		InputStream inputStream = new GZIPInputStream(new FileInputStream(marcDump));
		// InputStream inputStream = new FileInputStream("untitled");
		MarcReader reader = new MarcStreamReader(inputStream);

		MarcWriter writer = new MarcStreamWriter(new GZIPOutputStream(new FileOutputStream(target)));

		int sizeOfWantedIds = wantedIds.size();

		System.out.println("Scanning MARC records for " + wantedIds.size() + " ids ...");
		ArrayList<String> foundIds = new ArrayList<>();

		int counter = 0;
		while (reader.hasNext()) {
			if (counter++ % 100000 == 0) {
				System.out.println("Scanned " + counter + " so far...");
			}

			try {
				Record record = reader.next();
				String recordId = record.getControlNumberField().getData().trim();

				if (wantedIds.contains(recordId.trim())) {
					foundIds.add(recordId);
					writer.write(record);
					wantedIds.remove(recordId);

					if (foundIds.size() % 100000 == 0)
						System.out.println("Found \t" + foundIds.size() + " / " + sizeOfWantedIds + ":\t" + recordId);

				}
				if (foundIds.size() == sizeOfWantedIds) {
					System.out.println("All records found :)");
					break;
				}
			} catch (Exception e) {
			}
		}
		writer.close();
		inputStream.close();

		if (wantedIds.size() != 0) {
			System.out.println("WARNING: The following IDs could not be found in MARC: " + wantedIds);
		}
	}

	protected static String minId(ArrayList<String> ids) {
		Integer minId = 999999999;
		for (String id : ids) {

			try {
				Integer idi = new Integer(id);
				if (idi < minId) {
					minId = idi;
				}
			} catch (Exception e) {
			}
		}
		return minId + "";
	}

	protected static String maxId(ArrayList<String> ids) {
		Integer maxId = 0;
		for (String id : ids) {

			try {
				Integer idi = new Integer(id);
				if (idi > maxId) {
					maxId = idi;
				}
			} catch (Exception e) {
			}
		}
		return maxId + "";
	}

	protected static void dumpMarc(String minimumId, Dataset marcDump, File file) throws Exception {
		InputStream inputStream = new GZIPInputStream(new FileInputStream(marcDump.file));
		MarcReader reader = new MarcStreamReader(inputStream);

		MarcWriter writer = new MarcStreamWriter(new GZIPOutputStream(new FileOutputStream(file)));

		int counter = 0;
		while (reader.hasNext()) {

			if (++counter % 100000 == 0) {
				System.out.println(counter + " records so far...");
			}

			try {
				Record record = reader.next();
				String recordId = record.getControlNumberField().getData().trim();

				try {
					if (new Integer(recordId) < new Integer(minimumId))
						continue;
				} catch (Exception e) {

				}

				writer.write(record);
			} catch (Exception e) {
			}
		}

		inputStream.close();
		writer.close();

	}

	protected static void validate(File file) {
		// Model m = new Mo
		// new Model.read(new GZIPInputStream(new FileInputStream(file)),
		// "www.example.com", "RDF/XML");
	}

	protected static void produceIdenticalMarcAndRdfDump(Jedis jedis, String target, int quanity) throws Exception {
		InputStream inputStream = new GZIPInputStream(new FileInputStream(Dataset.HeBIS_Hauptbestand_in_MARC_gz.file));
		MarcReader reader = new MarcStreamReader(inputStream);

		MarcWriter writer = new MarcStreamWriter(new GZIPOutputStream(new FileOutputStream(target + "_marc.gz")));
		PrintStream printStream = new PrintStream(new GZIPOutputStream(new FileOutputStream(target + "_rdf.gz")), false, "UTF-8");

		// OutputFileStream outputStream = new GZIPOutputStream(new
		// FileOutputStream(new File(target)));

		printStream.print(jedis.get("RDFHEAD") + "\n");
		int counter = 0, written = 0;
		while (reader.hasNext()) {
			if (++counter % 100000 == 0) {
				System.out.println("Passed " + counter + " records so far...");
			}
			if (counter < 10000000) {
				try {
					reader.next();
				} catch (Exception e) {
				}
				continue;
			}

			if (written >= quanity) {
				System.out.println("Wrote " + quanity + " records.");
				break;
			}

			try {
				Record record = reader.next();

				if (Math.random() * 10 < 7)
					continue;

				String recordId = record.getControlNumberField().getData().trim();
				// System.out.println(recordId);
				String rdfRecord = jedis.get(recordId);
				if (rdfRecord != null) {
					written++;
					writer.write(record);
					printStream.print(rdfRecord + "\n");
				}

			} catch (Exception e) {
			}
		}

		printStream.print("\n</rdf:RDF>");
		writer.close();
		inputStream.close();
		printStream.close();

	}
}
