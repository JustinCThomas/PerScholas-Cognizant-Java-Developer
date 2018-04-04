package question2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RunQ2 {
	public static void main(String[] args) {
		try {
			String location = "C:\\Users\\Students\\Desktop\\courseCode.txt";
			File file = new File(location);
			Scanner input = new Scanner(file);
			String courseCodeLine1 = input.nextLine();
			String courseCodeLine2 = input.nextLine();
			
			
			String location2 = "C:\\Users\\Students\\Desktop\\courseName.txt";
			File file2 = new File(location2);
			Scanner input2 = new Scanner(file2);
			String courseNameLine1 = input2.nextLine();
			String courseNameLine2 = input2.nextLine();
			
			System.out.println(String.format("%s - %s", 
					courseCodeLine1, courseNameLine1));
			
			System.out.println(String.format("%s - %s", 
					courseCodeLine2, courseNameLine2));

		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
			e.printStackTrace();
		}
		
	}
}
