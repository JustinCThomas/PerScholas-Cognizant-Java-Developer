package CoreJava.DAO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import CoreJava.Models.Attending;
import CoreJava.Models.Course;

public class AttendingDAO {
//	Works on Windows 
	final String path = System.getProperty("user.dir") + "\\src\\attending.csv";
	
//	Works on Linux
//	final String path = System.getProperty("user.dir") + "//src//attending.csv";
	
	final File attendingFile = new File(path);
	

    public List<Attending> getAttending(){		
		List<Attending> attendingList = new ArrayList<Attending>();
		
		try {
			Scanner sc = new Scanner(attendingFile);
			
			while (sc.hasNextLine()) {
				String arr[] = sc.nextLine().split(",");
				Attending newEntry = new Attending(Integer.parseInt(arr[0]), arr[1]);
				attendingList.add(newEntry);
			}
		} catch(FileNotFoundException e) {
			System.out.println("File was not found.");
			e.printStackTrace();
		}
		
		return attendingList;
    }

    public void registerStudentToCourse(List<Attending> attending, String studentEmail, int courseID){
    	boolean isAttending = false;
    	for (Attending person: attending) {
    		if (person.getStudentEmail().equals(studentEmail) && person.getCourseId() == courseID) {
    			isAttending = true;
    			System.out.println("This person is already registered for that course.");
    			System.out.println();
    			return;
    		}
    	}
    	if (!isAttending) {
    		Attending newEntry = new Attending(courseID, studentEmail);
    		attending.add(newEntry);
    		saveAttending(attending);
    		System.out.println("Successfully registered!");
    		System.out.println();
    	}
    }

    public List<Course> getStudentCourses(List<Course> courseList, List<Attending> attending, String studentEmail){
    	List<Integer> courseIDS = new ArrayList<Integer>();
    	List<Course> coursesForIndividual = new ArrayList<Course>(); 

    	for (Attending person: attending) {
    		
    		if (person.getStudentEmail().equals(studentEmail)) {
    			courseIDS.add(person.getCourseId());
    		}
    	}
    	
    	for (int i = 0; i < courseList.size(); i++){
    		for (int j = 0; j < courseIDS.size(); j++) {
    			if (courseList.get(i).getID() == courseIDS.get(j)) {
    				Course course = courseList.get(i); 
    				coursesForIndividual.add(course);	
        		}
    		}	
    	}
    	
    	return coursesForIndividual;
    }

    public void saveAttending(List<Attending> attending){
		try {
			FileWriter writer = new FileWriter(attendingFile, false);
			for (Attending person: attending) {
				writer.write(String.format("%s,%s\r\n",
				person.getCourseId(), person.getStudentEmail()));
			}
			writer.close();
		} catch (IOException e) {
			System.out.println("File was not found.");
			e.printStackTrace();
		}
    }
}
