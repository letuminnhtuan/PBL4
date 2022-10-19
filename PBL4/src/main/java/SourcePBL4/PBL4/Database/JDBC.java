package SourcePBL4.PBL4.Database;

import java.sql.*;

public class JDBC {
	public static Connection getConnection() throws Exception {
		Connection cnn = null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://127.0.0.1:3306/PBL4";
		cnn = DriverManager.getConnection(url, "root", "");
		return cnn;
	}

	public static void closeConnection(Connection cnn) {
		if (cnn != null) {
			try {
				cnn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
