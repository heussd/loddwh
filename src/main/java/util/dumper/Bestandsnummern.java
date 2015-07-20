package util.dumper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.zip.GZIPInputStream;

import org.marc4j.MarcReader;
import org.marc4j.MarcStreamReader;
import org.marc4j.marc.DataField;
import org.marc4j.marc.Record;
import org.marc4j.marc.Subfield;

import util.Dumps;

public class Bestandsnummern extends Helpers {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		InputStream inputStream = new GZIPInputStream(new FileInputStream(Dumps.HeBIS_Hauptbestand_in_MARC_gz.file));
		MarcReader reader = new MarcStreamReader(inputStream);

		// MarcWriter writer = new MarcStreamWriter(new GZIPOutputStream(new
		// FileOutputStream(file)));

		int counter = 0;
		ArrayList<String> f003 = new ArrayList<>();

		while (reader.hasNext()) {

			if (++counter % 100000 == 0) {
				System.out.println(counter + " records so far...");
			}

			try {
				Record record = reader.next();
				for (Subfield f : ((DataField) record.getVariableField("035")).getSubfields("a")) {
					// f = f.substring(0, 10);
					
					String field = f.getData();
					field = field.substring(1, field.indexOf(")"));
					if (!f003.contains(field)) {
						System.out.println(field);
						f003.add(field);
					}

				}

				// String recordId =
				// record.getControlNumberField().getData().trim();
				//
				// try {
				// if (new Integer(recordId) < new Integer(minimumId))
				// continue;
				// } catch (Exception e) {
				//
				// }
				//
				// writer.write(record);
			} catch (Exception e) {
			}
		}

		inputStream.close();
		// writer.close();
	}
}
