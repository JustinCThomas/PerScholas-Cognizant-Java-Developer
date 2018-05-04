package CoreJava.Models;

public class Instructor {
	private int instructor_id;
	private String full_name;
	private String email;
	private String speciality;
	private int Student_role;
	private String pass;
	
	public Instructor() {
		this.instructor_id = -100;
		this.full_name = "N/A";
		this.email = "N/A";
		this.speciality = "N/A";
		this.Student_role = -100;
		this.pass = "N/A";
	}
	
	public Instructor(int instructor_id, String full_name, String email, String speciality, int student_role,
			String pass) {
		this.instructor_id = instructor_id;
		this.full_name = full_name;
		this.email = email;
		this.speciality = speciality;
		this.Student_role = student_role;
		this.pass = pass;
	}

	
	public int getInstructor_id() {
		return instructor_id;
	}
	public void setInstructor_id(int instructor_id) {
		this.instructor_id = instructor_id;
	}
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public int getStudent_role() {
		return Student_role;
	}
	public void setStudent_role(int student_role) {
		Student_role = student_role;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
}
