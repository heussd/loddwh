package main;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.pegdown.Extensions;
import org.pegdown.PegDownProcessor;

public class ReadmeToHtml {

	public static void main(String[] args) throws IOException {
		String readme = FileUtils.readFileToString(new File("Readme.md"));
		PegDownProcessor pdp = new PegDownProcessor(Extensions.ALL);
		String htmlResult = pdp.markdownToHtml(readme);
		FileUtils.writeStringToFile(new File("Readme.html"), htmlResult);
		System.out.println("Compiled Readme.md to Readme.html");
	}

}
