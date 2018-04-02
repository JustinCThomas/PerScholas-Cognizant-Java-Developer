package question3;

import java.util.Scanner;

import question1.Student;

public class RunQ3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter how many students you need:");
		int numStudents = input.nextInt();
		Student[] students = new Student[numStudents];
		
		for (int i = 0; i < students.length; i++) {
			students[i] = Student.createStudent();
		}
		
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i].getName() + 
			" has a grade of " + students[i].getGrade() + 
			" and a GPA of " + students[i].getGpa() + ".");
		}
		
		double avg = Student.getAvg();
		System.out.println();
		System.out.println("The average GPA of the students is " + avg + ".");
		input.close();
	}
}
