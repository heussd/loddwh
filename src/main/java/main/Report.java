package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.pegdown.Extensions;
import org.pegdown.PegDownProcessor;

import database.ArangoDB;
import database.Database;
import database.Fuseki;
import database.MongoDB;
import database.PostgreSQL;
import database.SQLite4Java;
import database.SQLiteXerial;
import database.Virtuoso;
import report.DatabaseReportObject;
import report.Reports;
import util.Config;
import util.TestSeries;

public class Report {

	public static void main(String[] args) throws Exception {

		for (TestSeries testSerie : TestSeries.values()) {

			List<Database> testDatabases = new ArrayList<>();
			testDatabases.add(new SQLite4Java());
			testDatabases.add(new SQLiteXerial());
			testDatabases.add(new PostgreSQL());
			testDatabases.add(new Virtuoso());
			testDatabases.add(new Fuseki());
			testDatabases.add(new MongoDB());
			testDatabases.add(new ArangoDB());

			ArrayList<BenchmarkObject> benchmarkObjects = new ArrayList<>();
			for (Database database : testDatabases) {

				File serialisedBenchmarkObject = new File("results/serialisedBenchmarkObjects/" + testSerie + "/" + database.getName() + ".ser");

				if (serialisedBenchmarkObject.exists()) {
					FileInputStream fis = new FileInputStream(serialisedBenchmarkObject);
					ObjectInputStream ois = new ObjectInputStream(fis);
					BenchmarkObject result = (BenchmarkObject) ois.readObject();
					ois.close();

					benchmarkObjects.add(result);
				}
			}

			if (benchmarkObjects.size() != 0)
				makeReports(testSerie, benchmarkObjects);
		}
	}

	static void makeReports(TestSeries testSerie, List<BenchmarkObject> benchmarkObjects) throws Exception {
		Reports reports = new Reports();
		StringBuilder sb = new StringBuilder();

		sb.append("<style style=\"text/css\">tr:hover{background: #FFFF00;}</style>\n\n");

		sb.append(reports.MakeBenchmarkReport(benchmarkObjects, testSerie, false));

		ArrayList<DatabaseReportObject> databases = new ArrayList<>();
		for (BenchmarkObject benchmarkObject : benchmarkObjects)
			databases.add(new DatabaseReportObject(benchmarkObject.getTitle()));
		sb.append(reports.MakeTableOfContents(databases));

		sb.append(reports.MakeTestSeriesReport(testSerie, false));

		int tocCount = 1;
		for (BenchmarkObject benchmarkObject : benchmarkObjects) {
			sb.append(reports.MakeBenchmarkObjectReport(benchmarkObject, testSerie, String.valueOf(tocCount), false));
			tocCount++;
		}

		sb.append(reports.MakeVerifyResultsReport(benchmarkObjects, false));

		String filename = String.format("Results-Testserie_%s", testSerie.toString());
		FileUtils.writeStringToFile(new File(Config.WHERE_THE_RESULTS_AT + filename + ".md"), sb.toString());

		PegDownProcessor pdp = new PegDownProcessor(Extensions.ALL);
		String htmlResult = pdp.markdownToHtml(sb.toString());
		FileUtils.writeStringToFile(new File(Config.WHERE_THE_RESULTS_AT + filename + ".html"), htmlResult);

		makeCsvReports(testSerie, benchmarkObjects);

		System.out.println("Wrote Report for Testserie " + testSerie.toString());
	}

	static void makeCsvReports(TestSeries testSerie, List<BenchmarkObject> benchmarkObjects) throws Exception {
		Reports reports = new Reports();
		StringBuilder sb = new StringBuilder();

		sb.append(reports.MakeBenchmarkReport(benchmarkObjects, testSerie, true));
		sb.append(reports.MakeTestSeriesReport(testSerie, true));
		for (BenchmarkObject benchmarkObject : benchmarkObjects)
			sb.append(reports.MakeBenchmarkObjectReport(benchmarkObject, testSerie, null, true));
		sb.append(reports.MakeVerifyResultsReport(benchmarkObjects, true));

		String filename = String.format("Results-Testserie_%s", testSerie.toString());
		FileUtils.writeStringToFile(new File(Config.WHERE_THE_RESULTS_AT + filename + ".csv"), sb.toString());
	}

}
