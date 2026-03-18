package com.cg;

import com.cg.entity.Employee;
import com.cg.entity.SBU;
import com.cg.repository.IEmployeeRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class EmployeeMain {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(SpringLab1SolutionUsingSpringBootApplication.class, args);
        Employee emp = new Employee("Ramesh", 26,25874);
        emp.setSbu(new SBU("Product Engineering Services", "Robin"));
        IEmployeeRepo repo=ctx.getBean(IEmployeeRepo.class);
//        Problem Statement 1.1
        emp.printEmployeeDetails();
        System.out.println();
//        Problem Statement 1.2
        emp.getSbuDetails();
        System.out.println();
        System.out.println();
////        Problem Statement 1.3
        SBU sbu = new SBU("Product Engineering Services","Rakesh");

        Employee e1 = new Employee("Rahul",25,50000);
        Employee e2 = new Employee("Aman",28,60000);

        e1.setSbu(sbu);
        e2.setSbu(sbu);

        sbu.setEmpList(List.of(e1,e2));

        repo.saveAll(List.of(e1,e2));

        System.out.println("Employees saved successfully\n");

        // FETCH AND PRINT
        List<Employee> empList = repo.findAll();

        for(Employee e : empList){
            e.printEmployeeDetails();
        }
        sbu.printSbuDetailsWithList();

//        Problem Statement 1.4

        ctx.close();
    }
}