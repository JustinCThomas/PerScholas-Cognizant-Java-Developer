package CoreJava.DAO;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import CoreJava.CustomExceptions.StudentRegistrationException;
import CoreJava.Models.Attending;
import CoreJava.Models.Course;
import CoreJava.Models.Student;
import CoreJava.systemInterfaces.AttendingDAOI;
import utils.OracleQueries;

public class AttendingDAO implements AttendingDAOI{
	
	
	Connection conn = null;
	PreparedStatement stmt = null;
	ResultSet result = null;

	@Override
	public int registerStudentToCourse(Student student, Course course) throws StudentRegistrationException, SQLException {
		int returnedID = 0;
		if (student.getGpa() >= course.getMinimum_gpa()) {
			String[] COL = {"attending_id"};
			
			try {
				conn = OracleConnection.getConnection();
				stmt = conn.prepareStatement(OracleQueries.REGISTERTOCOURSE, COL);
				stmt.setInt(1, course.getCourse_id());
				stmt.setInt(2, student.getStudent_id());
				
				stmt.executeUpdate();
				
				result = stmt.getGeneratedKeys();
				
				if (result.next()) {
					returnedID = result.getInt(1);
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
			
		} else {
			throw new StudentRegistrationException
			("\nDid not meet the minimum GPA "
			+ "requirement\nRegistration Denied");
		}

		return returnedID;
	}

	@Override
	public List<Attending> getStudentCourse(int student_id) throws SQLException {
		List<Attending> coursesAttending = new ArrayList<Attending>();
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet result = null;
		
		try {
			conn = OracleConnection.getConnection();
			stmt = conn.prepareStatement(OracleQueries.COURSESBYSTUDENT);
			stmt.setInt(1, student_id);
			result = stmt.executeQuery();
			
			while (result.next()) {
				coursesAttending.add(new Attending
				(result.getString(1), result.getString(2),
				result.getString(3)));
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
		return coursesAttending;
	}

}
