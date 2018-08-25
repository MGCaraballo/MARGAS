package clases;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class conectar {

	private static Connection cn = null;
	public static Connection getConexion() throws SQLException, ClassNotFoundException {
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	cn = DriverManager.getConnection("jdbc:odbc:db_ejemplo");
	return cn;
	}
}
