package CoreJava.DAO;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import CoreJava.Models.Teaching;
import CoreJava.systemInterfaces.TeachingDAOI;
import utils.OracleQueries;

public class TeachingDAO implements TeachingDAOI {

	@Override
	public int assignInstructorToCourse(int course_id, int instructor_id) {
		Connection conn = null;
		PreparedStatement stmt = null;
		int result = 0;
		
		try {
			conn = OracleConnection.getConnection();
			stmt = conn.prepareStatement(OracleQueries.ASSIGNINSTRUCTOR);
			stmt.setInt(1, course_id);
			stmt.setInt(2, instructor_id);
			result = stmt.executeUpdate();
			if (result != 0) {
				System.out.println("Instructor has been assigned to course.");
			}
		} catch (ClassNotFoundException | IOException | SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public List<Teaching> getInstructorsCourses() {
		List<Teaching> assignedInstructors = new ArrayList<Teaching>();
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet result = null;
		Teaching teaching = null;
		
		try {
			conn = OracleConnection.getConnection();
			stmt = conn.prepareStatement(OracleQueries.ASSIGNEDINSTRUCTORS);
			result = stmt.executeQuery();
			
			while (result.next()) {
				teaching = new Teaching(result.getString(1),
						result.getDouble(2), result.getString(3), 
						result.getString(4));
				assignedInstructors.add(teaching);
			}
			
		} catch (ClassNotFoundException | IOException | SQLException e) {
			e.printStackTrace();
		}

		return assignedInstructors;
	}
}
