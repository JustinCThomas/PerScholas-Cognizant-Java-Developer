package CoreJava.systemInterfaces;

import java.sql.SQLException;

import CoreJava.Models.Student;

public interface StudentDAOI {
	public Student getStudentByGmail(String email) throws SQLException;
}
