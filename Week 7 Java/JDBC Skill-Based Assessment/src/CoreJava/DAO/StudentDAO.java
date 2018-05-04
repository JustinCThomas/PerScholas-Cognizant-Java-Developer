package CoreJava.DAO;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import CoreJava.Models.Student;
import CoreJava.systemInterfaces.StudentDAOI;
import utils.OracleQueries;

public class StudentDAO implements StudentDAOI {
	
	@Override
	public Student getStudentByGmail(String email) throws SQLException {
		Student student = null;
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet result = null;
		
		try {
			conn = OracleConnection.getConnection();
			stmt = conn.prepareStatement(OracleQueries.STUDENTBYGMAIL);
			stmt.setString(1, email);
			result = stmt.executeQuery();
			
			if (result.next()) {
				student = new Student();
				student.setStudent_id(result.getInt(1));
				student.setFull_name(result.getString(2));
				student.setEmail(result.getString(3));
				student.setGpa(result.getDouble(4));
				student.setPass(result.getString(5));
				student.setStudent_role(result.getInt(6));
			}
			
		} catch (ClassNotFoundException | IOException | SQLException e) {
			e.printStackTrace();
		} finally {
			if (result != null) {
				result.close();
			}
			if (stmt != null) {
				stmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		}	
		
		return student;
	}
	
	
	public Boolean validateUser(String passToValidate, String comparablePass) {
		
		return passToValidate.equals(comparablePass);
	}
	
}
