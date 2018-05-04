package CoreJava.systemInterfaces;

import java.util.List;

import CoreJava.Models.Teaching;

public interface TeachingDAOI {
	public int assignInstructorToCourse(int course_id, int instructor_id);
	
	public List<Teaching> getInstructorsCourses();
}
