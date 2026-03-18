package com.cg.service;
import com.cg.entity.*;
import com.cg.repo.EmployeeRepo;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service 
public class EmployeeService {
	 @Autowired
	 private EmployeeRepo erepo;
	 public String createEmployee(Employee emp) {
		 erepo.saveAndFlush(emp);
		 return "Employee created successfully.....";
	 
 }
	 public List<Employee> getAllEmployee(){
		 return erepo.findAll();
	 }
	 public Employee getEmployee(int id) {
		 return erepo.findById(id).orElse(null);
	 }
	 public String removeEmployee(int empid) {
		 if(getEmployee(empid)!=null) {
		 erepo.deleteById(empid);
		 return "Employee deleted successfully";
		 }
		 else {
			 return "Employee not found";
		 }
	 }
	 public String updateEmployee(Employee e) {
		 erepo.saveAndFlush(e);
		 return "employee updated";
	 }
	 public List<Employee> getEmployeeByName(String name){
		 return erepo.findByName(name);
	 }
	 public List<Employee> getEmployeeBySalary(double sal){
		 return erepo.findBySalaryLessThan(sal);
	 }
	 public List<Employee> getEmployeesByMonth(int month) {
		    return erepo.findByDobBetween("");
		}
}
