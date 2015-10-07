package util;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import database.SQLite4Java;
import util.QueryResult.Type;

public class QueryResultTest {

	@Test(expected = RuntimeException.class)
	public void testInvalidScalarValueMethodUse() {
		QueryResult queryResult = new QueryResult(Type.GRAPH);

		queryResult.push(null);
	}

	@Test
	public void testTypeComparsion() {
		QueryResult qR1 = new QueryResult(Type.COMPLETE_ENTITIES);
		QueryResult qR2 = new QueryResult(Type.GRAPH);

		assertFalse(qR1.equals(qR2));

		QueryResult qR3 = new QueryResult(Type.COMPLETE_ENTITIES);
		assertTrue(qR1.equals(qR3));

		assertFalse(qR2.equals(qR3));
	}

	@Test
	public void testCompleteEntityComparsion() {
		QueryResult qR1 = new QueryResult(Type.COMPLETE_ENTITIES);
		QueryResult qR2 = new QueryResult(Type.COMPLETE_ENTITIES);

		DataObject dataObject = new DataObject();
		Codes key = Codes.BIBO_EDITION;
		String value = "value1";

		dataObject.set(key, value);

		qR1.push(dataObject);
		assertFalse(qR1.equals(qR2));
		System.out.println("R1: " + qR1.hashCode());
		System.out.println("R2: " + qR2.hashCode());
		assertFalse(qR1.hashCode() == qR2.hashCode());

		qR2.push(dataObject);
		assertTrue(qR1.equals(qR2));
		assertTrue(qR1.hashCode() == qR2.hashCode());

		dataObject.set(Codes.BIBO_OCLCNUM, "something else");
		qR1.push(dataObject);
		assertFalse(qR1.equals(qR2));
	}

	@Test
	public void testTrickyComparison() {
		QueryResult qR1 = new QueryResult(Type.COMPLETE_ENTITIES);
		QueryResult qR2 = new QueryResult(Type.COMPLETE_ENTITIES);

		for (int i = 1; i <= 10; i++) {
			DataObject dataObject = new DataObject();
			dataObject.set(Codes.DCTERMS_IDENTIFIER, i + "");

			qR1.push(dataObject);

		}

		assertFalse(qR1.equals(qR2));
		assertFalse(qR1.hashCode() == qR2.hashCode());

		for (int i = 1; i <= 10; i++) {
			DataObject dataObject = new DataObject();
			dataObject.set(Codes.DCTERMS_IDENTIFIER, i + 10 + "");

			qR2.push(dataObject);
		}

		assertFalse(qR1.equals(qR2));
		assertFalse(qR1.hashCode() == qR2.hashCode());

		System.out.println(qR1);
		System.out.println(qR2);
	}

	@Test
	public void testInRealAggregation() throws Exception {
		SQLite4Java sqLite4Java = new SQLite4Java();
		sqLite4Java.setUp();
		sqLite4Java.load(Dataset.hebis_1000_records);

		QueryScenario queryScenario = QueryScenario.AGGREGATE_ISSUES_PER_DECADE_TOP10;
		sqLite4Java.prepare(queryScenario);
		QueryResult qR1 = sqLite4Java.query(queryScenario);

		queryScenario = QueryScenario.AGGREGATE_ISSUES_PER_DECADE_TOP100;
		sqLite4Java.prepare(queryScenario);
		QueryResult qR2 = sqLite4Java.query(queryScenario);

		System.out.println(qR1);
		System.out.println(qR2);
		
		assertFalse(qR1.equals(qR2));
		assertFalse(qR1.hashCode() == qR2.hashCode());

		
	}

	@Test
	public void testTwoColumnsComparsion() {
		QueryResult qR1 = new QueryResult(Type.TWO_COLUMNS);
		QueryResult qR2 = new QueryResult(Type.TWO_COLUMNS);

		String key = "key";
		String value = "value1";

		qR1.push(key, value);
		assertFalse(qR1.equals(qR2));

		qR2.push(key, value);
		assertTrue(qR1.equals(qR2));

		qR1.push(key, "something else");
		assertFalse(qR1.equals(qR2));

		qR2.push(key, "something else");
		assertTrue(qR1.equals(qR2));

		qR1.push("another key", value);
		assertFalse(qR1.equals(qR2));

	}

	@Test
	public void testGraphComparison() {
		QueryResult qR1 = new QueryResult(Type.GRAPH);
		QueryResult qR2 = new QueryResult(Type.GRAPH);

		String id1 = "id1";
		String term1 = "term1";
		String id2 = "id2";
		String term2 = "term2";
		String id3 = "id3";

		qR1.push(id1, term1, id2);
		assertFalse(qR1.equals(qR2));

		qR2.push(id1, term1, id2);
		assertTrue(qR1.equals(qR2));

		qR1.push(id1, term1, "something else");
		assertFalse(qR1.equals(qR2));

		qR2.push(id1, term1, "something else");
		assertTrue(qR1.equals(qR2));

		qR1.push(id1, term1, id2, term2, id3);
		assertFalse(qR1.equals(qR2));

		qR2.push(id1, term1, id2, term2, id3);
		assertTrue(qR1.equals(qR2));

		qR1.push(id1, "t1", id2, null, id3);
		assertFalse(qR1.equals(qR2));

		qR2.push(id1, "t1", id2, null, id3);
		assertTrue(qR1.equals(qR2));
	}

}
