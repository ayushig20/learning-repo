
import java.sql.DriverManager;
import java.sql.ResultSet;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Main {

	public static void main(String args[]) throws Exception {
		System.out.println("MySQL Connector Sample Project");
		
		//Loading driver
		Class.forName("com.mysql.jdbc.Driver");
		
		//Creating connection object
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/FirstDatabase", "root", "password");
		
		//Creating SQL query
		PreparedStatement ps = con.prepareStatement("Select * from Register");

		//Executing SQL query
		ResultSet rs = ps.executeQuery();
		
		//Iterating 
		while (rs.next()) {
			System.out.println("Name: " + rs.getString(1) + "\nPhone: " + rs.getString(2));
		}

		System.out.println("Hitted database successfully");
	}
}
