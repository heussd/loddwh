package main.resources;

import java.io.FileInputStream;
import java.io.InputStream;

import org.marc4j.MarcReader;
import org.marc4j.MarcStreamReader;
import org.marc4j.marc.Record;

public class TestMarcRead {

	public static void main(String[] args) throws Exception {
		InputStream in = new FileInputStream("/Users/th/Desktop/HeBIS_Hauptbestand_in_MARC");
	    MarcReader reader = new MarcStreamReader(in);
	    while (reader.hasNext()) {
	        Record record = reader.next();
	        
	        System.out.println(record.toString());
	    }
	}

}
