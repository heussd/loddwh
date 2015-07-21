package util.dumper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

import org.marc4j.MarcReader;
import org.marc4j.MarcStreamReader;
import org.marc4j.marc.Record;

import util.DataObject;
import util.Config.Dumps;

public class Bestandsnummern extends Helpers {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		InputStream inputStream = new GZIPInputStream(new FileInputStream(Dumps.hebis_small_marc.file));
		MarcReader reader = new MarcStreamReader(inputStream);

		// MarcWriter writer = new MarcStreamWriter(new GZIPOutputStream(new
		// FileOutputStream(file)));

		int counter = 0;

		while (reader.hasNext()) {

			if (++counter % 100000 == 0) {
				System.out.println(counter + " records so far...");
			}

			try {
				Record record = reader.next();
				DataObject dao = new DataObject();
				dao.fromMarcRecord(record);

				System.out.println(dao);

				if (counter > 40) {
					break;
				}
			} catch (Exception e) {
				System.out.println(e);
			}
		}

		inputStream.close();
		// writer.close();
	}
}
