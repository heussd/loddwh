import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.zip.GZIPInputStream;

import org.marc4j.MarcReader;
import org.marc4j.MarcStreamReader;
import org.marc4j.marc.Record;

import util.Config.Dumps;
import util.DataObject;

public class TestMarcRead {

	public static void main(String[] args) throws Exception {
		InputStream in = new GZIPInputStream(new FileInputStream(Dumps.hebis_tiny_marc.file));
		MarcReader reader = new MarcStreamReader(in);

//		PrintWriter printWriter = new PrintWriter(new File("lala.txt"));
		long i = 0;

		outerloop: while (reader.hasNext()) {

			// String findMe = "Die diskutierte Region";

			// System.out.println(record.toString());
			// String id = "";
//			try {
				Record record = reader.next();
				
				

				// System.out.println(record);

				DataObject dataObject = new DataObject();

//				System.out.println(record);

				dataObject.fromMarcRecord(record);
				
				String id = dataObject.getId();
				
				if (id.equals("268877475") || id.equals("268877483")) {
					System.out.println(record);
					System.out.println(dataObject);
				}
				//
//				System.out.println(dataObject);
				
				
//				printWriter.print("\n\n" + dataObject);
				
			
				
				// id = "--";
				// DataField field = (DataField)
				// record.getVariableField(DCTERMS_IDENTIFIER);

				// for (VariableField field :
				// record.getVariableFields(Codes.DCTERMS_TITLE.MARC)) {
				// Subfield subfield = ((DataField)
				// field).getSubfield(Codes.DCTERMS_TITLE.subfield);
				// String str = subfield.getData();
				// // System.out.println(str);
				// if (str.equals(findMe)) {
				// System.out.println("FOUND IT!");
				// System.out.println(record);
				// writer.write(record);
				// break outerloop;
				// }
				// }

				// System.out.println(field.getTag());
				// Subfield subfield = field.getSubfield('a');
				// id = subfield.getData();
				// if (field != null)
				// System.out.println(field);

				// System.out.println(id);

				// findMe.endsWith(suffix)

				// break;

//			} catch (Exception e) {
//				e.printStackTrace();
//			}

			// System.out.println(id);

			// VariableField.
			// Subfield subfield = (title.getSubfield('a'));
			// System.out.println(subfield.getData());
			// System.out.println(title);
			// System.out.println(title.getDa);
			// System.out.println(record.getVariableField("245"));
			// System.out.println(record.getControlFields());

			if (i++ % 100000 == 0) {
				System.out.println(i + " record so far...");
			}
		}
	}
}
