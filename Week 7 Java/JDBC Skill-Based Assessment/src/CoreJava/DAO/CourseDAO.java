package CoreJava.DAO;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import CoreJava.Models.Course;
import CoreJava.systemInterfaces.CourseDAOI;
import utils.OracleQueries;

public class CourseDAO implements CourseDAOI {
	public List<Course> getAllCourses() throws SQLException{
		List<Course> courses = new ArrayList<Course>();
		
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet result = null;
		
		try {
			conn = OracleConnection.getConnection();
			stmt = conn.prepareStatement(OracleQueries.ALLCOURSES);
			result = stmt.executeQuery();
			
			while (result.next()) {
				Course course = new Course(result.getInt(1), result.getString(2), result.getDouble(3));
				courses.add(course);
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
		
		return courses;
	}

	@Override
	public List<Course> getCourseByInstructor(int instructor_id) throws SQLException {
		
		List<Course> courses = new ArrayList<Course>();
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet result = null;

		try {
			conn = OracleConnection.getConnection();
			stmt = conn.prepareStatement(OracleQueries.COURSEBYINSTRUCTOR);
			stmt.setInt(1, instructor_id);
			result = stmt.executeQuery();
			
			while (result.next()) {
				Course course = new Course(result.getInt(1),
					result.getString(2), result.getDouble(3));
				courses.add(course);
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
		return courses;
	}
}
