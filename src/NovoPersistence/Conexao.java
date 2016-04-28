package NovoPersistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	public static Connection getConnection() throws SQLException {
            //modificar aqui v
		return DriverManager.getConnection("jdbc:mysql://localhost/empresa","root","unifor");
	}
	
	static {
		try {
                   	Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
