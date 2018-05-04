package CoreJava.DAO;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import CoreJava.Models.Instructor;
import CoreJava.systemInterfaces.InstructorDAOI;
import utils.OracleQueries;

public class InstructorDAO implements InstructorDAOI {

	@Override
	public List<Instructor> getAllInstructors() throws SQLException {
		List<Instructor> instructors = new ArrayList<Instructor>();
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet result = null;
		
		
			try {
				conn = OracleConnection.getConnection();
				stmt = conn.prepareStatement(OracleQueries.ALLINSTRUCTORS);
				result = stmt.executeQuery();
				Instructor instructor = null;
				
				while (result.next()) {
					instructor = new Instructor(result.getInt(1), 
							result.getString(2), result.getString(3), 
							result.getString(4), result.getInt(5),
							result.getString(6));
					instructors.add(instructor);
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
		
		
		return instructors;
	}

	@Override
	public Instructor getInstructorByGmail(String email) throws SQLException {
		Instructor instructor = new Instructor();
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet result = null;
		
		
		try {
			conn = OracleConnection.getConnection();
			stmt = conn.prepareStatement(OracleQueries.INSTRUCTORBYGMAIL);
			stmt.setString(1, email);
			result = stmt.executeQuery();
			
			if (result.next()) {
				instructor = new Instructor(result.getInt(1), result.getString(2),
						result.getString(3), result.getString(4), result.getInt(5),
						result.getString(6));
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
		
		
		return instructor;
	}
	
	public String validateUser(Instructor ins, String comparablePas) {
		String credentials = "";
		
		if (ins.getStudent_role() == 1) {
			credentials = "Admin";
		} else if (ins.getStudent_role() == 0) {
			credentials = "Instructor";
		} else {
			credentials = "Wrong Credentials";
		}
		
		return credentials;
	}

}
