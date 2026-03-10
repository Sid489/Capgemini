package oneTomany.bidirectional;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class DepartmentMain {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("bidirectional");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
//		List<Employee> emp = new ArrayList<>();
//		Department d = new Department("CSE",emp);
//		emp.add(new Employee("Amit",23,20000.0,d));
//		emp.add(new Employee("Abhishek",25,20900.0,d));
//		emp.add(new Employee("Ashtam",24,29000.0,d));
//		emp.add(new Employee("Sahil",23,30000.0,d));
//		em.persist(d);

		List<Employee> emp = em.createQuery("FROM Employee", Employee.class)
				.getResultList();
		System.out.println(emp);

		em.getTransaction().commit();
	}

}
