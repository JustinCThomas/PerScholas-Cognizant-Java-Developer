
public class Manager extends Employee {

	public Manager() {
		super();
	}

	public Manager(long Id, String Name, String address, long phone, double salary) {
		super(Id, Name, address, phone);
		this.setBasicSalary(salary);
	}
	
	public void calculateTransportAllowance(){
		double transportAllowance = (15.0 / 100.0 * this.getBasicSalary()); 
		System.out.println(this.getEmployeeName() + " has a transport allowance of " + transportAllowance + ".");
	}

}
