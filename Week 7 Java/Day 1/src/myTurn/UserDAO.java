package myTurn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
	public void getAllUsers() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String username = "justin";
		String password = "password";
		Connection conn = DriverManager.getConnection(url,  username,  password);
		
		String ALL = "SELECT * FROM user_table";
		PreparedStatement stmt = null;
		ResultSet result = null;
		stmt = conn.prepareStatement(ALL);
		result = stmt.executeQuery();
		
		while(result != null && result.next()) {
			System.out.println(result.getInt(1));
			System.out.println(result.getString(2));
			System.out.println(result.getString(3));
			System.out.println(result.getString(4));
			System.out.println();
		}
	}
	
	public void getUsersByName(String name) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String username = "justin";
		String password = "password";
		Connection conn = DriverManager.getConnection(url,  username,  password);
		
		String ALL = "SELECT * FROM user_table "
				+ "WHERE user_name = ?";
		PreparedStatement stmt = null;
		ResultSet result = null;
		
		
		stmt = conn.prepareStatement(ALL);
		stmt.setString(1, name);
		result = stmt.executeQuery();
		
		while(result != null && result.next()) {
			System.out.println(result.getInt(1));
			System.out.println(result.getString(2));
			System.out.println(result.getString(3));
			System.out.println(result.getString(4));
			System.out.println();
		}	
	}
	
	public static boolean validateUser(String email, String password2) throws ClassNotFoundException, SQLException{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String username = "justin";
		String password = "password";
		Connection conn = DriverManager.getConnection(url,  username,  password);
		
		String ALL = "SELECT * FROM user_table "
				+ "WHERE user_email = ? AND "
				+ "user_password = ?";
		
		PreparedStatement stmt = null;
		ResultSet result = null;
		
		stmt = conn.prepareStatement(ALL);
		stmt.setString(1, email);
		stmt.setString(2, password2);
		result = stmt.executeQuery();
		
		if (result != null && result.next()) {
			System.out.println("This user is in the database!");
			return true;
		} else {
			System.out.println("Cannot find an entry for this user.");
			return false;
		}
	}
	
	public void updateUser(String email, String name, String password2) throws ClassNotFoundException, SQLException{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String username = "justin";
		String password = "password";
		Connection conn = DriverManager.getConnection(url,  username,  password);
		
		String UPDATE = "UPDATE user_table SET user_name = ?, "
				+ " user_password = ?, "
				+ "WHERE user_email = ?";
		
		PreparedStatement stmt = null;
		
		stmt = conn.prepareStatement(UPDATE);
		stmt.setString(1, name);
		stmt.setString(2, password2);
		stmt.setString(3, email);
		
		stmt.executeUpdate();
	}
}
