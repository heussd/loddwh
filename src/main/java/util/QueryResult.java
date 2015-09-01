package util;

import java.util.ArrayList;

public class QueryResult {

	public static enum Type {
		SCALAR_VALUE,
		COMPLETE_ENTITIES,
		TWO_COLUMNS,
		GRAPH,
		NONE
	}

	private final Type type;

	public QueryResult(Type type) {
		this.type = type;
	}
	private Object scalarValue;

	public void put(String scalarValue) {
		if (scalarValue == null) {
			if (this.type != Type.SCALAR_VALUE)
				throw new RuntimeException("Invalid method call. This method is only allowed for type " + Type.SCALAR_VALUE + ", but was called for type " + this.type);
		}

		this.scalarValue = scalarValue;
	}

	public void put(Object column1, Object column2) {

		if (this.type != Type.TWO_COLUMNS)
			throw new RuntimeException("Invalid method call. This method is only allowed for type " + Type.TWO_COLUMNS + ", but was called for type " + this.type);

	}

	private ArrayList<DataObject> dataObjects;

	public void push(DataObject dataObject) {
		if (dataObjects == null) {
			if (this.type != Type.COMPLETE_ENTITIES)
				throw new RuntimeException("Invalid method call. This method is only allowed for type " + Type.COMPLETE_ENTITIES + ", but was called for type " + this.type);

			this.dataObjects = new ArrayList<>();
		}
	}

}
