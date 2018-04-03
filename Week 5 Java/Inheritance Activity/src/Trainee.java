
public class Trainee extends Employee {

	public Trainee() {
		super();
	}

	public Trainee(long Id, String Name, String address, long phone, double salary) {
		super(Id, Name, address, phone);
		this.setBasicSalary(salary);
	}
	
}
