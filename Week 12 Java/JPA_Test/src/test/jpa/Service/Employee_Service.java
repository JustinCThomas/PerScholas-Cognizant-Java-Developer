package test.jpa.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import test.jpa.Entity.Employee;

public class Employee_Service {
	
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setEid(1);
		e.setEname("Justin");
		e.setSalary(60000);
		e.setDeg("Something");
		
//		createEmployee(e);
		
//		System.out.println(findEmployee(1));
//		System.out.println();
//		
//		updateEmployeeSalary(1, 85000);
//		
//		System.out.println(findEmployee(1));
		
		removeEmployee(1);
	}
	
	public static void createEmployee(Employee e) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA_Test");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(e);
		manager.getTransaction().commit();
		manager.close();
		factory.close();
	}
	
	public static Employee findEmployee(int eid) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA_Test");
		EntityManager manager = factory.createEntityManager();
		Employee foundEmployee = manager.find(Employee.class, eid);
		return foundEmployee;
	}
	
	public static void updateEmployeeSalary(int eid, double newSalary) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA_Test");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		Employee foundEmployee = manager.find(Employee.class, eid);
		foundEmployee.setSalary(newSalary);
		manager.getTransaction().commit();
		manager.close();
		factory.close();
	}
	
//	public static void updateEmployeeSalary2(Employee e, double newSalary) {
//		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA_Test");
//		EntityManager manager = factory.createEntityManager();
//		manager.getTransaction().begin();
//		manager.merge(e);
//		e.setSalary(newSalary);
//		manager.getTransaction().commit();
//	}
	
	public static void removeEmployee(int eid) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA_Test");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		Employee foundEmployee = manager.find(Employee.class, eid);
		manager.remove(foundEmployee);
		manager.getTransaction().commit();
		manager.close();
		factory.close();
	}
}
