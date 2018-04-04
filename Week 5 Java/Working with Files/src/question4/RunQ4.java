package question4;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

import question3.Student;

public class RunQ4 {
	public static void main(String[] args) {
		try {
			String location1 = "C:\\Users\\Students\\Desktop\\names.txt";
			File file1 = new File(location1);
			Scanner input = new Scanner(file1);
			ArrayList<String> nameArray = new ArrayList<String>(); 
			while (input.hasNextLine()) {
				nameArray.add(input.nextLine());
			}
			input.close();
			
			String gradesLocation = "C:\\Users\\Students\\Desktop\\grades.txt";
			File file2 = new File(gradesLocation);
			Scanner input2 = new Scanner(file2);
			ArrayList<String> gradeArray = new ArrayList<String>(); 
			while (input2.hasNextLine()) {
				gradeArray.add(input2.nextLine());
			}
			input2.close();
			
			String gpasLocation = "C:\\Users\\Students\\Desktop\\gpas.txt";
			File file3 = new File(gpasLocation);
			Scanner input3 = new Scanner(file3);
			ArrayList<String> gpaArray = new ArrayList<String>(); 
			while (input3.hasNextLine()) {
				gpaArray.add(input3.nextLine());
			}
			input3.close();
			
			Student[] students = new Student[10];
			for (int i = 0; i < students.length; i++) {
				students[i] = new Student(nameArray.get(i), 
				Integer.parseInt(gradeArray.get(i)), 
				Math.round((Double.parseDouble(gpaArray.get(i))) * 100.0)/ 100.0);
			}
			
			for (Student student: students) {
				student.getInfo();
			}
			
			
		} catch (Exception e) {
			System.out.println("File not found!");
			e.printStackTrace();
		}
	}
}
