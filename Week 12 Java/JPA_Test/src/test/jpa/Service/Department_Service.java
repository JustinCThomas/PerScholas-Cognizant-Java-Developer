package test.jpa.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import test.jpa.Entity.Department;

public class Department_Service {
	
	public static void main(String[] args) {
		Department d = new Department();
		d.setDid(1);
		d.setName("Server Management");
		d.setState("Washington");
		
		createDepartment(d);
		
		Department foundDepartment = findDepartment(1);
		System.out.println(foundDepartment);
		
		updateDepartmentState(1, "Texas");
		
		System.out.println(d);
		
		removeDepartment(1);
	}
	
	
	public static void createDepartment(Department d) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA_Test");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(d);
		manager.getTransaction().commit();
		manager.close();
		factory.close();
	}
	
	public static Department findDepartment(int did) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA_Test");
		EntityManager manager = factory.createEntityManager();
		Department foundDepartment = manager.find(Department.class, did);
		return foundDepartment;
	}
	
	public static void updateDepartmentState(int did, String state) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA_Test");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		Department departmentToUpdate = manager.find(Department.class, did);
		departmentToUpdate.setState(state);
		manager.getTransaction().commit();
		manager.close();
		factory.close();
	}
	
	public static void removeDepartment(int did) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA_Test");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		Department departmentToUpdate = manager.find(Department.class, did);
		manager.remove(departmentToUpdate);
		manager.getTransaction().commit();
		manager.close();
		factory.close();
	}
}
