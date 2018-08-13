package homework9;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

public class Runner {
	
	public static void main(String[] args) throws SQLException {
		HashMap<Integer, String> authorMap = new HashMap<>();	
		ConnectionUtils.loadDriver();
			ConnectionUtils.connectToDataBase();
			ResultSet rs = ConnectionUtils.getConnection().createStatement().executeQuery("select * from authors");
			if (rs.isBeforeFirst()) {
				while (rs.next()) {
					authorMap.put(rs.getInt(1), rs.getString(2));
				}
			}
			ConnectionUtils.closeConnection();
			System.out.println(authorMap.values());
			
	
	}
}
