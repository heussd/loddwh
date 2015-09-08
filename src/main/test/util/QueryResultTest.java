package util;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import util.QueryResult.Type;

public class QueryResultTest {

	@Test(expected = RuntimeException.class)
	public void testInvalidScalarValueMethodUse() {
		QueryResult queryResult = new QueryResult(Type.SCALAR_VALUE);

		queryResult.push(null);
	}

	@Test
	public void testTypeComparsion() {
		QueryResult qR1 = new QueryResult(Type.SCALAR_VALUE);
		QueryResult qR2 = new QueryResult(Type.GRAPH);

		assertFalse(qR1.equals(qR2));

		QueryResult qR3 = new QueryResult(Type.SCALAR_VALUE);
		assertTrue(qR1.equals(qR3));

		assertFalse(qR2.equals(qR3));
	}

	@Test
	public void testScalarComparsion() {
		QueryResult qR1 = new QueryResult(Type.SCALAR_VALUE);
		QueryResult qR2 = new QueryResult(Type.SCALAR_VALUE);

		qR1.put("mystring");
		assertFalse(qR1.equals(qR2));

		qR2.put("mystring");
		assertTrue(qR1.equals(qR2));
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

		qR2.push(dataObject);
		assertTrue(qR1.equals(qR2));

		dataObject.set(Codes.BIBO_OCLCNUM, "something else");
		qR1.push(dataObject);
		assertFalse(qR1.equals(qR2));

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
