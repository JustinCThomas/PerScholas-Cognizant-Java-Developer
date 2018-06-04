package test.jpa.Entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "jpa_employee")
public class Employee {
	

	@Id
	@Column(name = "eid")
	private int eid;
	
	@Basic
	@Column(name = "ename")
	private String ename;
	
	@Basic
	@Column(name = "salary")
	private double salary;
	
	@Basic
	@Column(name = "deg")
	private String deg;
	
	public Employee(int eid, String ename, double salary, String deg) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.deg = deg;
	}
	
	public Employee() {
		super();
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDeg() {
		return deg;
	}

	public void setDeg(String deg) {
		this.deg = deg;
	}
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", deg=" + deg + "]";
	}	
}
