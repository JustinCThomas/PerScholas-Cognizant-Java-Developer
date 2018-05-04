package utils;

public class OracleQueries {
	public final static String STUDENTBYGMAIL = "SELECT * FROM student "
			+ "WHERE  email = ?";
	
	public final static String ALLINSTRUCTORS = "SELECT * FROM instructor ";
	
	public final static String INSTRUCTORBYGMAIL = "SELECT * FROM instructor "
			+ "WHERE email = ?";

	public final static String ALLCOURSES = "SELECT * FROM course ";
	
	public final static String COURSEBYINSTRUCTOR = "SELECT * FROM course "
			+ "JOIN teaching ON Course.course_id = Teaching.course_id "
			+ "JOIN instructor ON Teaching.instructor_id = instructor.instructor_id "
			+ "WHERE instructor.instructor_id = ?";
	
	public final static String REGISTERTOCOURSE = "INSERT INTO attending "
			+ "(course_id, student_id) "
			+ "VALUES (?, ?)";
	
	public final static String COURSESBYSTUDENT = 
			"SELECT course.course_name, instructor.full_name, "
			+ "instructor.email FROM course "
			+ "JOIN attending ON course.course_id = attending.course_id " 
			+ "JOIN student ON attending.student_id = student.student_id "
			+ "JOIN teaching ON course.course_id = teaching.course_id "
			+ "JOIN instructor ON teaching.instructor_id = instructor.instructor_id "
			+ "WHERE student.student_id = ?";
	
	public final static String ASSIGNINSTRUCTOR = 
			"INSERT INTO teaching (course_id, instructor_id) "
			+ "VALUES (?, ?)";
	
	public final static String ASSIGNEDINSTRUCTORS =
			"SELECT course_name, minimun_gpa, full_name, email "
			+ "FROM instructor "
			+ "JOIN teaching ON instructor.instructor_id = teaching.instructor_id "
			+ "JOIN course ON teaching.course_id = course.course_id";
}
