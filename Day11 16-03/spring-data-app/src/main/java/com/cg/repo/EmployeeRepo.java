package com.cg.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.*;
import org.springframework.stereotype.Repository;

import com.cg.entity.Employee;
//import com.sun.tools.javac.util.List;
@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer>{
	public List<Employee> findByName(String name);
	public List<Employee> findBySalaryLessThan(double salary);
	@Query("SELECT e FROM Employee e WHERE MONTH(e.dob) = :month")
	List<Employee> findByBirthMonth(@Param("month") int month);
//	List<Employee> findByDobBetween(LocalDate start, LocalDate end);
}
