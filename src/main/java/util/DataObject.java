package util;

import java.util.ArrayList;
import java.util.HashMap;

import org.marc4j.marc.ControlField;
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
				}
			} catch (Exception e) {
			}
		}

		// Overwrite special cases:
		boolean aBibliographicResource = false, aBook = false;
		// Fixed-Length data fields, ftw.
		for (ControlField controlField : record.getControlFields()) {
			switch (controlField.getTag()) {
			case "006":
				data.put(Codes.TEST_006, controlField.getData());
				String formOfMaterial = controlField.getData().substring(0, 1);

				switch (formOfMaterial) {
				case "e": // "Cartographic material" - FAll through
				case "c": // c - Notated music
				case "a": // "Language material" -> Book
					aBook = true;
					aBibliographicResource = true;
					break;
				case "m": // Computer file/Electronic resource
				case "j": // "Musical sound recording"
					aBook = false;
					aBibliographicResource = false;
					break;
				case "s": // s - Serial/Integrating resource
					aBook = false;
					aBibliographicResource = true;
					break;
				default:
					// throw new
					// RuntimeException("Dont know this FORM OF MATERIAL: " +
					// formOfMaterial +
					// ", see http://www.loc.gov/marc/bibliographic/bd006.html");
				}
				break;

			case "007": // Might usually not exist
				String unknownProperty = controlField.getData().substring(0, 1);
				switch (unknownProperty) {
				case "q":
				case "a":
					aBibliographicResource = true;
					aBook = true;
				case "h":
					aBibliographicResource = false;
					aBook = true;
					break;
				case "s":
				case "c":
					aBibliographicResource = false;
					aBook = false;
					break;
				default:
					throw new RuntimeException("Dont know this: " + unknownProperty + " @ " + record.getControlNumber());
				}

				data.put(Codes.TEST_007, controlField.getData());
				break;
			}
		}

		if (aBook) {
			putMultiple(Codes.RDF_TYPE, "http://purl.org/ontology/bibo/Book");
		}
		if (aBibliographicResource) {
			// This relation is confirmed
			putMultiple(Codes.RDF_TYPE, "http://purl.org/dc/terms/BibliographicResource");

			data.put(Codes.DCTERMS_MEDIUM, Codes.DCTERMS_MEDIUM.FIXEDVALUE);
			data.put(Codes.DCTERMS_FORMAT, Codes.DCTERMS_FORMAT.FIXEDVALUE);
		}
		putMultiple(Codes.RDF_TYPE, "http://purl.org/vocab/frbr/core#Manifestation");

		// IDs
		// $a(DE-599)DNB860319695 -> DCTERMS_IDENTIFIER 860319695
		data.remove(Codes.DCTERMS_IDENTIFIER);
		String id = record.getControlNumberField().getData();
		data.put(Codes.DCTERMS_IDENTIFIER, id);
		data.put(Codes.RDF_ABOUT, Codes.RDF_ABOUT.FIXEDVALUE + id.substring(0, id.length() - 1));
		data.put(Codes.WDRS_DESCRIBEDBY, Codes.WDRS_DESCRIBEDBY.FIXEDVALUE + id.substring(0, id.length() - 1));

		// DNB linkage 035 $a(DE-599)DNB860319695
		data.remove(Codes.OWL_SAMEAS);
		for (VariableField field : record.getVariableFields(Codes.OWL_SAMEAS.MARC)) {
			String systemControlNumber = ((DataField) field).getSubfield(Codes.OWL_SAMEAS.subfield).getData();
			if (systemControlNumber.startsWith("(DE-599)DNB")) {
				data.put(Codes.OWL_SAMEAS, "http://d-nb.info/" + systemControlNumber.substring(11));
			}
		}

		// 035 $a(OCoLC)43712277
		Codes code = Codes.BIBO_OCLCNUM;
		data.remove(code);
		for (VariableField field : record.getVariableFields(code.MARC)) {
			String fieldValue = ((DataField) field).getSubfield(code.subfield).getData();
			if (fieldValue.startsWith("(OCoLC)")) {
				data.put(code, fieldValue.substring(7));
			}
		}

		// 650 7$0(DE-588)4133806-6$0(DE-603)085487139$aChemische Synthese$2gnd
		// GND == 4133806-6
		code = Codes.DCTERMS_SUBJECT;
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

	public String getId() {
		return (String) data.get(Codes.DCTERMS_IDENTIFIER);
	}
}
