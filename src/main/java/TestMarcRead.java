
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

import org.marc4j.MarcReader;
import org.marc4j.MarcStreamReader;
import org.marc4j.MarcStreamWriter;
import org.marc4j.MarcWriter;
import org.marc4j.marc.Record;

import util.DataObject;

public class TestMarcRead {

	private static final String HEBIS_ORG_MARC_CODE = "(DE-599)HEB";
	private static final String DCTERMS_IDENTIFIER = "035"; // Wrong??!
	private static final String DCTERMS_TITLE = "245";

	public static void main(String[] args) throws Exception {
		 InputStream in = (new FileInputStream("untitled"));
//		InputStream in = new GZIPInputStream(new FileInputStream("/Users/th/Ph.D./HeBIS Zulieferungen Juni 2015/HeBIS_Hauptbestand_in_MARC.gz"));
		MarcWriter writer = new MarcStreamWriter(new FileOutputStream(new File("myoutfile")));
		MarcReader reader = new MarcStreamReader(in);

		long i = 0;

		outerloop: while (reader.hasNext()) {

//			String findMe = "Die diskutierte Region";

			// System.out.println(record.toString());
			// String id = "";
			try {
				Record record = reader.next();

				// System.out.println(record);

				 DataObject dataObject = new DataObject();
				
				 dataObject.fromMarcRecord(record);
				//
				 System.out.println(dataObject);
				 System.out.println(record);
				// id = "--";
				// DataField field = (DataField)
				// record.getVariableField(DCTERMS_IDENTIFIER);


//				for (VariableField field : record.getVariableFields(Codes.DCTERMS_TITLE.MARC)) {
//					Subfield subfield = ((DataField) field).getSubfield(Codes.DCTERMS_TITLE.subfield);
//					String str = subfield.getData();
//					// System.out.println(str);
//					if (str.equals(findMe)) {
//						System.out.println("FOUND IT!");
//						System.out.println(record);
//						writer.write(record);
//						break outerloop;
//					}
//				}

				// System.out.println(field.getTag());
				// Subfield subfield = field.getSubfield('a');
				// id = subfield.getData();
				// if (field != null)
				// System.out.println(field);

				// System.out.println(id);

				// findMe.endsWith(suffix)

				// break;

			} catch (Exception e) {
				e.printStackTrace();
			}

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

		writer.close();
	}
}
