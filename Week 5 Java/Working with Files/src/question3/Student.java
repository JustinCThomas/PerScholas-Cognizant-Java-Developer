package question3;

public class Student {
	private String name;
	private int grade;
	private double gpa;
	
	public Student() {}
		
	public Student(String name, int grade, double gpa) {
		this.name = name;
		this.grade = grade;
		this.gpa = gpa;
	}

	public void getInfo() {
		System.out.println(String.format("My name is %s. "
		 + "I'm in grade %s and I have a %s GPA. For now "
		 + "at least...", name, grade, gpa));
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", grade=" + grade + ", gpa=" + gpa + "]";
	}
	
	
}
