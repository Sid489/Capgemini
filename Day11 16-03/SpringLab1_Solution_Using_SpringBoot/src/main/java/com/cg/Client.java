package com.cg;

import com.cg.entity.Employee;
import com.cg.service.EmployeeService;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx= SpringApplication.run(SpringLab1SolutionUsingSpringBootApplication.class, args);
        EmployeeService eS= ctx.getBean("eS", EmployeeService.class);
        Scanner sc= new Scanner(System.in);
        System.out.println("Employee Id: ");
        int id=sc.nextInt();
        Employee emp=eS.getEmployeeById(id);
        if(emp!=null){
            System.out.println("Employee Info: ");
//            System.out.println("Employee Age: "+ emp.getAge());
            System.out.println("Employee ID: \t \t"+ emp.getEmployeeId());
            System.out.println("Employee NAME: \t \t"+ emp.getEmployeeName());
            System.out.println("Employee SALARY: \t"+ emp.getSalary());
        }
        else{
            System.out.println("Employee Not Found");
        }
        ctx.close();
    }
}
