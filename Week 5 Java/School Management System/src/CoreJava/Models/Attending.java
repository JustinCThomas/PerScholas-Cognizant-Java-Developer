package CoreJava.Models;

public class Attending {
	private int courseID;
	private String studentEmail;
	
	public Attending() {
		courseID = 1000;
		studentEmail = "placeholder@school.com";
	}
	
	public Attending(int courseId, String studentEmail) {
		this.courseID = courseId;
		this.studentEmail = studentEmail;
	}
	
	
	public int getCourseId() {
		return courseID;
	}
	public void setCourseId(int courseId) {
		this.courseID = courseId;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	
	
}
