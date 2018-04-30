package menu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import myTurn.UserDAO;

public class Menu {
	public static void register(Scanner sc) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String username = "justin";
		String password = "password";
		Connection conn = DriverManager.getConnection(url,  username,  password);
		
		System.out.println("Please enter an email address:");
		String email = sc.next();
		
		System.out.println("Please enter your username:");
		String username2 = sc.next();
		
		System.out.println("Please enter your password:");
		String password2 = sc.next();
		
		String INSERT = "INSERT INTO user_table "
				+ "(user_email, user_name, user_password) "
				+ "VALUES (?, ?, ?)";
		
		PreparedStatement stmt = null;
		
		stmt = conn.prepareStatement(INSERT);
		stmt.setString(1, email);
		stmt.setString(2, username2);
		stmt.setString(3, password2);
		
		stmt.executeUpdate();
		
		System.out.println("Registering " + username2 + ".");
	}
	
	public static void login(Scanner sc) throws ClassNotFoundException, SQLException {
		System.out.println("Please enter your email address:");
		String email = sc.next();
		
		System.out.println("Please enter your password:");
		String password2 = sc.next();
		
		if (UserDAO.validateUser(email, password2)) {
			System.out.println("You can login whenever you want.\r\n");
		} else {
			System.out.println("Sorry, that email and password pair cannot be found in the database.");
		}
	}
	
	public static void updateInfo(Scanner sc) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String username = "justin";
		String password = "password";
		Connection conn = DriverManager.getConnection(url,  username,  password);
		
		System.out.println("Please enter your email address:");
		String email = sc.next();
		
		String BYEMAIL = "SELECT * FROM user_table "
				+ "WHERE user_email = ?";
		
		PreparedStatement stmt = null;
		ResultSet result = null;
		
		stmt = conn.prepareStatement(BYEMAIL);
		stmt.setString(1, email);
		result = stmt.executeQuery();
		
		while(result != null && result.next()) {
			System.out.println(result.getInt(1));
			System.out.println(result.getString(2));
			System.out.println(result.getString(3));
			System.out.println(result.getString(4));
			System.out.println();
		}
		
		System.out.println("Your username and password need to be updated.\r\n");
		System.out.println("Please enter a new username:");
		String username2 = sc.next();
		System.out.println("Please enter a new password");
		String password2 = sc.next();
		
		String UPDATE = "UPDATE user_table SET user_name = ?, "
				+ "user_password = ?"
				+ "WHERE user_email = ?";
		
		PreparedStatement stmt2 = null;
		
		stmt2 = conn.prepareStatement(UPDATE);
		stmt2.setString(1, username2);
		stmt2.setString(2, password2);
		stmt2.setString(3, email);
		stmt2.executeUpdate();
		System.out.println("DataBase Updated.");
	}
	
	public static boolean quit() {
		System.out.println("Program has been terminated.");
		return false;
	}
}
