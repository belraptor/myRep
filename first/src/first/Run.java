package first;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Run {
public static void main(String[] args) throws InstantiationException, IllegalAccessException {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		System.out.println("Driver registered");
	} catch (ClassNotFoundException e) {
		System.out.println("Driver not found");
	}
	
	Connection connection = null;
	try {
connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library?useSSL=false", "root", "root");
		System.out.println("Connection succeeded");
	}  catch (SQLException e) {
		System.out.println("Connection failed!");
	}finally {
		if(connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

}
}
}
