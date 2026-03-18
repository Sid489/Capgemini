package com.cg.Service;
import java.util.*;

import com.cg.Entity.Employee;
public interface IEmployeeService {
	public List<Employee> getAllEmployee();
	public Employee createEmployee(Employee emp);
	public Employee getEmployee(int empid);
	public String removeEmployee(int empid);
	public Employee updateEmployee(Employee e);
}
