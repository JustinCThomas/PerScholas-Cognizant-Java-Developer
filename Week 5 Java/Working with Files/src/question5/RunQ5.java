package question5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import question3.Student;

public class RunQ5 {
	public static void main(String[] args) {
// 		String path = System.getProperty("user.dir") +  "//students.csv";
// 		String location = path;
		String location = "C:\\Users\\Students\\Desktop\\students.csv";
		
		try {
			File file = new File(location);
			Scanner input = new Scanner(file);
			String[][] arr = new String[10][];
			Student[] students = new Student[10];
			
			int counter = 0; 
			
			while (input.hasNextLine()){
		
				arr[counter] = input.nextLine().split(",");
				String name = arr[counter][0];
			    int grade = Integer.parseInt(arr[counter][1].trim());
			    double gpa = Double.parseDouble(arr[counter][2].trim());
				
				Student student = new Student(name, grade, 
				Math.round(gpa * 100.0) / 100.0);
				
				students[counter] = student;
				counter++;
			}
			System.out.println();
			
			for (Student student: students){
				student.getInfo();
			}
			
		} catch (FileNotFoundException e){
			System.out.println("File not found!");
			e.printStackTrace();
		}
		
	}
}
