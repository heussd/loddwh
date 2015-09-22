package util;

public enum TestSeries {
	TINY(Dataset.hebis_1000_records),
	SMALL(Dataset.hebis_100000_records),
	MEDIUM(Dataset.hebis_10147116_13050073_rdf_gz, Dataset.hebis_29873806_36057474_rdf_gz),
	LARGE(Dataset.hebis_29873806_36057474_rdf_gz,
			Dataset.hebis_00000001_05051126_rdf_gz,
			Dataset.hebis_05051127_10147115_rdf_gz,
			Dataset.hebis_10147116_13050073_rdf_gz,
			Dataset.hebis_26887668_29873805_rdf_gz,
			Dataset.hebis_21257740_26887667_rdf_gz,
			Dataset.hebis_13050073_21257739_rdf_gz);

	public final Dataset[] datasets;

	TestSeries(Dataset... datasets) {
		this.datasets = datasets;
	}
}
