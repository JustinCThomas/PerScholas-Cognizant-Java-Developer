package question3;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class RunQ3 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the information for the student in the following format: ");
		System.out.println("name, grade, gpa");
		String[] arr = input.nextLine().split(",");
		String name = arr[0].trim();
		int grade = Integer.parseInt(arr[1].trim());
		double gpa = Double.parseDouble(arr[2].trim());
		
		Student student1 = new Student(name, grade, gpa);
		System.out.println(student1);
		
		try {
			String namesLocation = "C:\\Users\\Students\\Desktop\\names.txt";
			File file1 = new File(namesLocation);
			FileWriter writer1 = new FileWriter(file1, true);
			writer1.write(student1.getName());
			writer1.close();
			
			
			String gradesLocation = "C:\\Users\\Students\\Desktop\\grades.txt";
			
			File file2 = new File(gradesLocation);
			FileWriter writer2 = new FileWriter(file2, true);
			writer2.write(Integer.toString(student1.getGrade()));
			writer2.close();
			
			String gpasLocation = "C:\\Users\\Students\\Desktop\\gpas.txt";
			
			File file3 = new File(gpasLocation);
			FileWriter writer3 = new FileWriter(file3, true);
			writer3.write(Double.toString(student1.getGpa()));
			writer3.close();
			
			
		} catch (Exception e) {
			System.out.println("File not found!");
			e.printStackTrace();
		}
	}

	
}
