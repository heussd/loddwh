package util;
import java.util.ArrayList;
import java.util.HashMap;

import org.marc4j.marc.DataField;
import org.marc4j.marc.Record;
import org.marc4j.marc.VariableField;

public class DataObject {
	HashMap<Codes, Object> data = new HashMap<>();

	public void fromMarcRecord(Record record) {

		// Extract subfield a
		for (Codes code : Codes.values()) {
			try {
				if (code.MARC != null && code.subfield != '0') {
					data.put(code, ((DataField) record.getVariableField(code.MARC)).getSubfield(code.subfield).getData());
				} else {
					if (code.MARC == null && code.FIXEDVALUE != null) {
						data.put(code, code.FIXEDVALUE);
					}
				}
			} catch (Exception e) {
			}
		}

		// Overwrite special cases:

		// DNB linkage 035 $a(DE-599)DNB860319695
		data.remove(Codes.OWL_SAMEAS);
		for (VariableField field : record.getVariableFields(Codes.OWL_SAMEAS.MARC)) {
			String systemControlNumber = ((DataField) field).getSubfield(Codes.OWL_SAMEAS.subfield).getData();
			if (systemControlNumber.startsWith("(DE-599)DNB")) {
				data.put(Codes.OWL_SAMEAS, "http://d-nb.info/" + systemControlNumber.substring(11));
			}
		}

		// IDs
		// $a(DE-599)DNB860319695 -> DCTERMS_IDENTIFIER 860319695
		data.remove(Codes.DCTERMS_IDENTIFIER);
		String id = record.getControlNumberField().getData();
		data.put(Codes.DCTERMS_IDENTIFIER, id);
		data.put(Codes.RDF_ABOUT, Codes.RDF_ABOUT.FIXEDVALUE + id.substring(0, id.length() - 1));
		data.put(Codes.WDRS_DESCRIBEDBY, Codes.WDRS_DESCRIBEDBY.FIXEDVALUE + id.substring(0, id.length() - 1));

		// 650 7$0(DE-588)4133806-6$0(DE-603)085487139$aChemische Synthese$2gnd
		// GND == 4133806-6
		Codes code = Codes.DCTERMS_SUBJECT;
		data.remove(code);
		for (VariableField field : record.getVariableFields(code.MARC)) {
			String systemControlNumber = ((DataField) field).getSubfield(code.subfield).getData();
			if (systemControlNumber.startsWith("(DE-588)")) {
				putMultiple(code, systemControlNumber.substring(8));
			}
		}
	}

	public void putMultiple(Codes code, String value) {
		ArrayList<String> returnValue = (ArrayList<String>) data.get(code);
		if (returnValue == null) {
			returnValue = new ArrayList<String>();
		}

		returnValue.add(value);
		data.put(code, returnValue);
	}

	@Override
	public String toString() {
		String result = "";

		for (Codes code : data.keySet()) {
			result += code.toString() + ":\t" + data.get(code) + "\n";
		}
		return result;
	}
}
