package oneTomany.unidirectional;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class DepartmentMain {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("unidirectional");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee("Anant",21,19000.0));
		emp.add(new Employee("Aman",20,20300.0));
		emp.add(new Employee("Aditya",19,18000.0));
		emp.add(new Employee("Abhigyan",44,30000.0));
		Department d = new Department("CSE",emp);
		em.persist(d);
		em.getTransaction().commit();
	}

}
