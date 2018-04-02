package question1;

import java.util.Scanner;

public class Student {
	private String name, grade;
	private double gpa;
	private static double gpaTotal = 0.0;
	private static double avg = 0.0;
	private static int numOfStudents = 0;
	
	public Student(String name, String grade, double gpa) {
		this.name = name;
		this.grade = grade;
		this.gpa = gpa;
		gpaTotal += gpa;
		numOfStudents++;
		calcAvg();
	}

	public static Student createStudent() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a name please: ");
		String name = input.next();
		System.out.println("Enter a grade please: ");
		String grade = input.next();
		System.out.println("Enter a gpa please: ");
		double gpa = Math.round(input.nextDouble() * 100.0) / 100.0;
		System.out.println();
		return new Student(name, grade, gpa);
	}
	
	private void calcAvg() {
		avg = (gpaTotal / numOfStudents);
		avg = Math.round(avg * 100.0) / 100.0;
	}
	
	public static int getNumOfStudents() {
		return numOfStudents;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public double getGpa() {
		return gpa;
	}
	
	public static double getAvg() {
		return avg;
	}

}
