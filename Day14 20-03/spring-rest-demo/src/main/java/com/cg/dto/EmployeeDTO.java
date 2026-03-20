package com.cg.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class EmployeeDTO {
	private int employeeId;
	@NotNull(message="Name is required")
	@NotBlank(message="Enter valid name")
	private String fullName;
	@JsonFormat(pattern = "dd-MMM-yyyy")
	private LocalDate dateOfBirth;
	@NotNull(message="salary is required")
	@Min(value=10000)
	private double salary;
	
	public EmployeeDTO() {
		// TODO Auto-generated constructor stub
	}
	public EmployeeDTO( String fullName, LocalDate dateOfBirth, double salary) {
		super();
		this.employeeId = employeeId;
		this.fullName = fullName;
		this.dateOfBirth = dateOfBirth;
		this.salary = salary;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
