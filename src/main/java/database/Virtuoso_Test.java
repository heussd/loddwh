package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import virtuoso.jdbc4.VirtuosoException;
import virtuoso.jdbc4.VirtuosoExtendedString;
import virtuoso.jdbc4.VirtuosoRdfBox;
import virtuoso.jdbc4.VirtuosoResultSet;



// IN DEN ABFRAGEN IM STRING KEIN SEMIKOLON AM ENDE MACHEN! DER BRICHT SONST EINFACH OHNE FEHLERMELDUNG AB!

public class Virtuoso_Test {

	public static void main(String[] args) throws Throwable {

		test2();
	}
	
	private static void test2() throws SQLException, VirtuosoException{

		String url = "jdbc:virtuoso://127.0.0.1";

		Connection c = DriverManager.getConnection(url, "dba", "dba");
		Statement stmt = c.createStatement();
		stmt.executeQuery("DB.DBA.RDF_LOAD_RDFXML_MT (file_to_string_output ('../hebis_1000_rdf'), '', 'JDBCTry')");
		
		
		stmt.close();
		c.close();
	}

	private static void test1() throws SQLException, VirtuosoException {
		// Class.forName("")

		String url = "jdbc:virtuoso://127.0.0.1";

		Connection c = DriverManager.getConnection(url, "dba", "dba");
		Statement stmt = c.createStatement();
		// ResultSet rs =
		// stmt.executeQuery("sparql select * from <FirstTry> where {?s <http://purl.org/dc/terms/identifier> '268876681'};");
		//
		// while(rs.next()){
		// String id = rs.getString("s");
		// System.out.println(id);
		// }
		//

		ResultSet rs = null;

		boolean more = stmt.execute("sparql select * from <FirstTry> where {?s <http://purl.org/dc/terms/identifier> '268876681'}");
		ResultSetMetaData data = stmt.getResultSet().getMetaData();
		while (more) {
			rs = stmt.getResultSet();
			while (rs.next()) {
				for (int i = 1; i <= data.getColumnCount(); i++) {
					String s = rs.getString(i);
					Object o = ((VirtuosoResultSet) rs).getObject(i);
					if (o instanceof VirtuosoExtendedString) // String
																// representing
																// an IRI
					{
						VirtuosoExtendedString vs = (VirtuosoExtendedString) o;
						if (vs.iriType == VirtuosoExtendedString.IRI
								&& (vs.strType & 0x01) == 0x01)
							System.out.println("<" + vs.str + ">");
						else if (vs.iriType == VirtuosoExtendedString.BNODE)
							System.out.println("<" + vs.str + ">");
					} else if (o instanceof VirtuosoRdfBox) // Typed literal
					{
						VirtuosoRdfBox rb = (VirtuosoRdfBox) o;
						System.out.println(rb.rb_box + " lang=" + rb.getLang()
								+ " type=" + rb.getType());

					} else if (stmt.getResultSet().wasNull())
						System.out.println("NULL");
					else //
					{
						System.out.println(s);
					}

				}
			}
			more = stmt.getMoreResults();
		}

		rs.close();
		stmt.close();
		c.close();
	}
}
