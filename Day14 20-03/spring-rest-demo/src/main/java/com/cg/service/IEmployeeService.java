package com.cg.service;

import java.util.List;

import com.cg.dto.EmployeeDTO;
import com.cg.entity.Employee;

public interface IEmployeeService {
	public List<EmployeeDTO> getAllEmployee();
	public EmployeeDTO createEmployee(EmployeeDTO emp);
	public EmployeeDTO getEmployee(int empid);
	public String removeEmployee(int empid);
	public Employee updateEmployee(Employee e);
	public List<EmployeeDTO> getEmployeeByName(String name);
}
