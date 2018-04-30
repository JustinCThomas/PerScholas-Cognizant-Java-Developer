package myTurn;

import java.sql.SQLException;

public class MainEntry {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		UserDAO uDAO = new UserDAO();
//		uDAO.getAllUsers();
//		uDAO.getUsersByName("ee");
//		
//		uDAO.validateUser("tttgmail.com", "gggggg");
		
		uDAO.updateUser("tttgmail.com", "Aloha", "123YEE");
	}

}
