package CoreJava.DAO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import CoreJava.Models.Course;

public class CourseDAO {
    public List<Course> getAllCourses(){
    	String path = System.getProperty("user.dir") + "\\src\\Courses.csv";
		File coursesFile = new File(path);
		
		List<Course> courses = new ArrayList<Course>();
		
		try {
			Scanner sc = new Scanner(coursesFile);
			while (sc.hasNextLine()) {
				String arr[] = sc.nextLine().trim().split(",");
				Course newCourse = new Course(Integer.parseInt(arr[0]), arr[1], arr[2]);
				courses.add(newCourse);
			}
		} catch(FileNotFoundException e){
			System.out.println("File was not found.");
			e.printStackTrace();
		}
		return courses;
    }
}
