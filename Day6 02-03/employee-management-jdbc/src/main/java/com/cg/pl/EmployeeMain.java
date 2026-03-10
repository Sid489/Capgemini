package com.cg.pl;

import com.cg.bean.Employee;
import com.cg.service.EmployeeService;
import com.cg.service.IEmployeeService;

public class EmployeeMain {

	public static void main(String[] args) {
		IEmployeeService es=new EmployeeService();
		String result=es.createEmployee(new Employee("Anant", "an@gmail.com", "1985-07-28"));
		System.out.println(result);

	}

}
