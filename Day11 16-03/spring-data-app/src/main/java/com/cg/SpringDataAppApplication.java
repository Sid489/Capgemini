package com.cg;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cg.entity.Employee;
import com.cg.repo.EmployeeRepo;
import com.cg.service.EmployeeService;
import com.cg.service.*;
@SpringBootApplication
public class SpringDataAppApplication {

    private final EmployeeRepo employeeRepo;

    SpringDataAppApplication(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SpringDataAppApplication.class, args);
//		EmployeeRepo erepo=ctx.getBean(EmployeeRepo.class);
//		erepo.save(new Employee(112,"sambit",LocalDate.of(2004, 11, 6),58000.66));
//		System.out.println("Employee Created");
		EmployeeService es=ctx.getBean(EmployeeService.class);
//		System.out.println(es.createEmployee(new Employee("samman",LocalDate.of(2005, 03, 03),81000)));
		System.out.println(es.getAllEmployee());
//		Employee e=es.getEmployee(2);
//		if(e!=null) {
//			e.setDob(LocalDate.of(2002, 05, 01));
//			es.updateEmployee(e);
//		}
		System.out.println(es.getEmployeeByName("saloni"));
		System.out.println(es.getEmployeeBySalary(83000.0));
		List<Employee> list = es.getEmployeesByMonth(1);

		for (Employee e : list) {
		    System.out.println(e);
		}
	}
}
