package CoreJava.DAO;

import CoreJava.Models.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentDAO {
	public List<Student> getStudents(){
//		Works on Windows 
		String path = System.getProperty("user.dir") + "\\src\\students.csv";
		
//		Works on Linux
//		String path = System.getProperty("user.dir") + "//src//students.csv";
		
		File studentFile = new File(path);
		List<Student> students = new ArrayList<Student>();
		
		try {
			Scanner sc = new Scanner(studentFile);
			while (sc.hasNextLine()) {
				String arr[] = sc.nextLine().trim().split(",");
				Student newStudent = new Student(arr[0], arr[1], arr[2]);
				students.add(newStudent);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File was not found.");
			e.printStackTrace();
		}
		
		return students;
	}
	
	public Student getStudentByEmail(List<Student> studentList, String studentEmail) {
		for (Student student: studentList) {
			if (student.getEmail().equals(studentEmail)) {
				return student;
			}
		}
		return new Student();
	}
	
	public boolean validateUser(List<Student> studentList, String studentEmail, String studentPass) {
		for (Student student: studentList) {
			if (student.getEmail().equals(studentEmail)  && student.getPass().equals(studentPass)) {
				
				return true;
			}
		}
		
		return false;
		
	}
}
