package com.cg.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.entity.Employee;

public interface IEmployeeRepo  extends JpaRepository<Employee, Integer>{
	public List<Employee> findByName(String name);
}
