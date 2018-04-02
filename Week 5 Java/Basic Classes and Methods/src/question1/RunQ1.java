package question1;

public class RunQ1 {
	
	public static void main(String[] args) {
		Student Student1 = Student.createStudent();
		Student Student2 = Student.createStudent();
		Student Student3 = Student.createStudent();
		
		Student[] students = new Student[3];
		students[0] = Student1;
		students[1] = Student2;
		students[2] = Student3;
			
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
