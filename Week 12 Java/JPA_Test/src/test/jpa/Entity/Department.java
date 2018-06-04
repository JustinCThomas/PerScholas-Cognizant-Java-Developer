package test.jpa.Entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "department")
public class Department {
	
	@Id
	@Column(name = "did")
	private int did;
	
	@Basic
	@Column(name = "name")
	private String name;
	
	@Basic
	@Column(name = "state")
	private String state;
	
	
	public Department(int did, String name, String state) {
		super();
		this.did = did;
		this.name = name;
		this.state = state;
	}
	
	public Department(){
		super();
	}
	
	public int getDid() {
		return did;
	}
	
	public void setDid(int did) {
		this.did = did;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Department [did=" + did + ", name=" + name + ", state=" + state + "]";
	}
}
