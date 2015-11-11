package util;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * This class is the container for various possible result values.
 * 
 * @author th
 *
 */
public class QueryResult implements Serializable {

	private static final long serialVersionUID = 2466840812809882014L;

	public static enum Type {
		COMPLETE_ENTITIES,
		TWO_COLUMNS,
		GRAPH,
		NONE
	}

	private static final int MAX_RESULT_ROW_COUNT = 1000;

	private final Type type;

	private Object scalarValue;

	private ArrayList<DataObject> dataObjects;
	ArrayList<Row> rows = new ArrayList<>();

	public QueryResult(Type type) {
		this.type = type;
	}

	/**
	 * Setter method for {@link Type#TWO_COLUMNS}.
	 * 
	 * @param column1
	 * @param column2
	 */
	public void push(String column1, String column2) {
		if (this.type != Type.TWO_COLUMNS)
			throw new RuntimeException(
					"Invalid method call. This method is only allowed for type " + Type.TWO_COLUMNS + ", but was called for type " + this.type);

		if (rows.size() < MAX_RESULT_ROW_COUNT)
			rows.add(new Row(column1, column2, null, null, null));
	}

	/**
	 * Setter method for {@link Type#GRAPH}
	 * 
	 * @param column1
	 * @param column2
	 * @param column3
	 */
	public void push(String column1, String column2, String column3) {
		push(column1, column2, column3, null, null);
	}

	/**
	 * Setter method for {@link Type#GRAPH}
	 * 
	 * @param column1
	 * @param column2
	 * @param column3
	 */
	public void push(String column1, String column2, String column3, String column4, String column5) {
		if (this.type != Type.GRAPH)
			throw new RuntimeException("Invalid method call. This method is only allowed for type " + Type.GRAPH + ", but was called for type " + this.type);

		if (rows.size() < MAX_RESULT_ROW_COUNT)
			rows.add(new Row(column1, column2, column3, column4, column5));
	}

	public void push(DataObject dataObject) {
		if (this.type != Type.COMPLETE_ENTITIES)
			throw new RuntimeException(
					"Invalid method call. This method is only allowed for type " + Type.COMPLETE_ENTITIES + ", but was called for type " + this.type);

		if (dataObjects == null)
			this.dataObjects = new ArrayList<>();

		if (dataObjects.size() < MAX_RESULT_ROW_COUNT)
			this.dataObjects.add(dataObject);
	}

	class Row {
		public String col1;
		public String col2;
		public String col3;
		public String col4;
		public String col5;

		public Row(String col1, String col2, String col3, String col4, String col5) {
			this.col1 = col1;
			this.col2 = col2;
			this.col3 = col3;
			this.col4 = col4;
			this.col5 = col5;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((col1 == null) ? 0 : col1.hashCode());
			result = prime * result + ((col2 == null) ? 0 : col2.hashCode());
			result = prime * result + ((col3 == null) ? 0 : col3.hashCode());
			result = prime * result + ((col4 == null) ? 0 : col4.hashCode());
			result = prime * result + ((col5 == null) ? 0 : col5.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Row other = (Row) obj;
			if (col1 == null) {
				if (other.col1 != null)
					return false;
			} else if (!col1.equals(other.col1))
				return false;
			if (col2 == null) {
				if (other.col2 != null)
					return false;
			} else if (!col2.equals(other.col2))
				return false;
			if (col3 == null) {
				if (other.col3 != null)
					return false;
			} else if (!col3.equals(other.col3))
				return false;
			if (col4 == null) {
				if (other.col4 != null)
					return false;
			} else if (!col4.equals(other.col4))
				return false;
			if (col5 == null) {
				if (other.col5 != null)
					return false;
			} else if (!col5.equals(other.col5))
				return false;
			return true;
		}

	}

	@Override
	public String toString() {
		String out = "";

		switch (type) {
		case GRAPH:
		case TWO_COLUMNS:
			for (Row row : rows) {
				out += row.col1 + "\t\t" + row.col2;

				if (type == Type.GRAPH)
					out += "\t\t" + row.col3 + "\t\t" + row.col4 + "\t\t" + row.col5;

				out += "\n";
			}
			break;
		case COMPLETE_ENTITIES:
			for (DataObject dataObject : dataObjects) {
				out += dataObject.toString();
			}
			break;
		default:
			out += "How to display " + type + "?";
			break;
		}

		return out;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataObjects == null) ? 0 : dataObjects.hashCode());
		result = prime * result + ((rows == null) ? 0 : rows.hashCode());
		result = prime * result + ((scalarValue == null) ? 0 : scalarValue.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		QueryResult other = (QueryResult) obj;

		if (type != other.type)
			return false;

		switch (type) {
		case COMPLETE_ENTITIES:
			if (dataObjects == null) {
				if (other.dataObjects != null)
					return false;
			} else if (!dataObjects.equals(other.dataObjects))
				return false;
		case TWO_COLUMNS:
		case GRAPH:
			if (rows == null) {
				if (other.rows != null)
					return false;
			} else if (!rows.equals(other.rows))
				return false;

			break;
		default:
			break;
		}

		return true;
	}
}
