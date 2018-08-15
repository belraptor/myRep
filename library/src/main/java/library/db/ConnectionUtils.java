package library.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtils {
	private static Connection connection;
	private static final String url = "jdbc:mysql://localhost:3306/library?useSSL=false";
	private static final String login = "root";
	private static final String pass = "root";
	
	public static Connection getConnection(){
		return connection;
	}
	public static void loadDriver() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver registered");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver not found");
		}
	}
	public static void connectToDataBase() {
		connection = null;
		try {
			connection = DriverManager.getConnection(url, login, pass);
			System.out.println("Connection succeeded");
		} catch (SQLException e) {
			System.out.println("Connection failed");
		}
	}

	public static void closeConnection() {
		if (connection != null)
			try {
				connection.close();
				System.out.println("Connection closed");
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				if (connection != null)
					try {
						connection.close();
						System.out.println("Connection finally closed");
					} catch (SQLException e) {
						e.printStackTrace();
					}
			}
	}

	
}
