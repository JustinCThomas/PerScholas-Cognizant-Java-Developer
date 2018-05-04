package CoreJava.MainEntryPoint;

import java.sql.SQLException;
import java.util.List;

import CoreJava.CustomExceptions.StudentRegistrationException;
import CoreJava.DAO.AttendingDAO;
import CoreJava.DAO.CourseDAO;
import CoreJava.DAO.InstructorDAO;
import CoreJava.DAO.StudentDAO;
import CoreJava.Models.Course;
import CoreJava.Models.Instructor;
import CoreJava.Models.Student;

public class TestingONLY {
	public static void main(String[] args) throws SQLException, StudentRegistrationException {
		StudentDAO studentDAO = new StudentDAO();
		Student student = studentDAO.getStudentByGmail("y@gmail.com");
		System.out.println(student.getFull_name());
		System.out.println();
		
		InstructorDAO instructorDAO = new InstructorDAO();
		List<Instructor> instructors =  instructorDAO.getAllInstructors(); 
		
		for (Instructor i: instructors) {
			System.out.println(i.getFull_name());
			System.out.println(i.getPass());
			System.out.println();
		}
		
		Instructor instructor = instructorDAO.getInstructorByGmail("lance@gmail.com");
		System.out.println(instructor.getFull_name());
		System.out.println(instructor.getSpeciality());
		System.out.println();
		
		CourseDAO courseDAO = new CourseDAO();
		List<Course> courses = courseDAO.getAllCourses();
		for (Course course: courses) {
			System.out.println(course.getCourse_id());
			System.out.println(course.getCourse_name());
			System.out.println(course.getMinimum_gpa());
			System.out.println();
		}
		
		System.out.println();
		
		List<Course> courses2 = courseDAO.getCourseByInstructor(2);
		for (Course course: courses2) {
			System.out.println(course.getCourse_id());
			System.out.println(course.getCourse_name());
			System.out.println(course.getMinimum_gpa());
			System.out.println();
		}
		
		Course testCourse = courses.get(1);
		
		
		AttendingDAO attendingDAO = new AttendingDAO();
		int attending_id = attendingDAO.registerStudentToCourse(student, testCourse);
		System.out.println(attending_id);
		System.out.println();
		
	
	}
}
