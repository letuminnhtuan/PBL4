package SourcePBL4.PBL4.Database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class FileInfor {
	public String getFileType(String FileExtension) {
		String extension = "";
		try {
			Connection cnn = JDBC.getConnection();
			String query = "select * from FileType where Type = '" + FileExtension + "'";
			Statement statement = cnn.createStatement();
			ResultSet rs = statement.executeQuery(query);
			while(rs.next()) {
				extension = rs.getString("Name");
			}
			JDBC.closeConnection(cnn);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return extension;
	}
}
