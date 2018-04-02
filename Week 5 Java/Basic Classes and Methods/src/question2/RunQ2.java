package question2;

import question1.Student;

public class RunQ2 {
	public static void main(String[] args) {
		Student[] students = new Student[3];
		
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
	}
}
