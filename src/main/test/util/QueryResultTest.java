package util;

import org.junit.Test;

import util.QueryResult.Type;

public class QueryResultTest {

	@Test(expected=RuntimeException.class)
	public void testInvalidScalarValueMethodUse() {
		QueryResult queryResult = new QueryResult(Type.SCALAR_VALUE);

		queryResult.push(null);
	}

}
