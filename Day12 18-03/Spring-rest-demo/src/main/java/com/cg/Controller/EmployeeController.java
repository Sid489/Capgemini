package com.cg.Controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.Entity.Employee;
import com.cg.Service.IEmployeeService;

import java.util.*;

@RestController
@RequestMapping("employees")
public class EmployeeController {
//	@Autowired
	private IEmployeeService service;
	
	public EmployeeController(IEmployeeService service) {
		super();
		this.service = service;
	}
	@GetMapping
     public List<Employee> getEmployee() {
    	 return service.getAllEmployee();
     }
	@GetMapping("/{empid}")
	public Employee getEmp(@PathVariable int empid) {
		return service.getEmployee(empid);
	}
	@PostMapping
	public Employee createNewEmployee(@RequestBody Employee emp) {
		return service.createEmployee(emp);
	}
	@DeleteMapping("/{eid}")
	public String deleteEmployee(@PathVariable int eid) {
		return service.removeEmployee(eid);
	}
	@PutMapping
	public Employee updateEmployee(@RequestBody Employee emp) {
		service.updateEmployee(emp);
	}
}
