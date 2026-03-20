package com.cg.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.IEmployeeRepo;
import com.cg.dto.EmployeeDTO;
import com.cg.dto.EntityMapper;
import com.cg.entity.Employee;
import com.cg.exception.EmployeNotFoundException;

@Service
public class EmployeeService implements IEmployeeService{
	@Autowired
	private IEmployeeRepo repo;
	@Override
	public List<EmployeeDTO> getAllEmployee() {
		List<Employee> emps=repo.findAll();
		List<EmployeeDTO> employees=new ArrayList<EmployeeDTO>();
		emps.forEach(e->employees.add(EntityMapper.convertEntityToDto(e)));
		return employees;
	}

	@Override
	public EmployeeDTO createEmployee(EmployeeDTO emp) {
		// TODO Auto-generated method stub
		Employee e=repo.saveAndFlush(EntityMapper.convertObjectToEntity(emp));
		return EntityMapper.convertEntityToDto(e);
	}

	@Override
	public EmployeeDTO getEmployee(int empid) {
		Optional<Employee> op=repo.findById(empid);
		if(op.isPresent()) 
			return EntityMapper.convertEntityToDto(op.get());
		else
			throw new EmployeNotFoundException("Employee Not Found");
	}

	@Override
	public String removeEmployee(int empid) {
		if(getEmployee(empid)!=null) {
			repo.deleteById(empid);
			return "Employee Deleted";
		} else {
			return "Employee Not Found";
		}
	}

	@Override
	public Employee updateEmployee(Employee e) {	
		if(getEmployee(e.getEmpid())!=null)
			return repo.saveAndFlush(e);
		else 
			return null;
	}

	@Override
	public List<EmployeeDTO> getEmployeeByName(String name) {
		
		List<Employee> emps=repo.findByName(name);
		List<EmployeeDTO> employees=new ArrayList<EmployeeDTO>();
		emps.forEach(e->employees.add(EntityMapper.convertEntityToDto(e)));
		return employees;
	}
	

}
