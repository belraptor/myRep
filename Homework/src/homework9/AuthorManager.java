package homework9;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

public class AuthorManager {
	private static int authorID;
	static HashMap<Integer, String> authorMap = new HashMap<>();

	public static void getAuthorMap() throws SQLException {
		ConnectionUtils.loadDriver();
		ConnectionUtils.connectToDataBase();
		ResultSet rs = ConnectionUtils.getConnection().createStatement().executeQuery("select * from authors");
		if (rs.isBeforeFirst()) {
			while (rs.next()) {
				authorMap.put(rs.getInt(1), rs.getString(2));
			}
		}
//		ConnectionUtils.closeConnection();
	}

	public static int getAuthorID(String author) throws SQLException {
		getAuthorMap();
		if (!authorMap.containsValue(author)) {
			addAuthor(author);
			getAuthorMap();
//			authorID = (authorMap.size() + 1);
//			authorMap.put(authorID, author);
			
		} else
			for (int i = 1; i <= authorMap.size(); i++) {
				if (!author.equals(null) && authorMap.get(i).equals(author)) {
					authorID = i;
					break;
				}

			}
		return authorID;
	}

	public static void addAuthor(String author) {
		try {
			ConnectionUtils.loadDriver();
			ConnectionUtils.connectToDataBase();
			ConnectionUtils.getConnection().createStatement()
					.executeUpdate("INSERT INTO authors (name) VALUES ('" + author + "')");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ConnectionUtils.closeConnection();
	}

	public static void changeAuthor(String authorOld, String authorNew) {
		try {
			ConnectionUtils.loadDriver();
			ConnectionUtils.connectToDataBase();
			ConnectionUtils.getConnection().createStatement()
					.executeUpdate("UPDATE authors SET name = '" + authorNew + "' WHERE name = '" + authorOld + "')");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ConnectionUtils.closeConnection();
	}

	public static void deleteAuthor(String author) {
		try {
			ConnectionUtils.loadDriver();
			ConnectionUtils.connectToDataBase();
			ConnectionUtils.getConnection().createStatement()
					.executeUpdate("DELETE FROM authors WHERE name = " + author + "')");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ConnectionUtils.closeConnection();
	}
}
