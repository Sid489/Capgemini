package com.cg.dto;

import com.cg.entity.Employee;

public class EntityMapper {
	public static Employee convertObjectToEntity(EmployeeDTO edto) {
		return new Employee(edto.getFullName(), edto.getDateOfBirth(),edto.getSalary());
	}
	public static EmployeeDTO convertEntityToDto(Employee emp) {
		EmployeeDTO edto=new EmployeeDTO( emp.getName(), emp.getDob(), emp.getSalary());
		edto.setEmployeeId(emp.getEmpid());
//		return new EmployeeDTO( emp.getName(), emp.getDob(), emp.getSalary());
		return edto;
	}
}
