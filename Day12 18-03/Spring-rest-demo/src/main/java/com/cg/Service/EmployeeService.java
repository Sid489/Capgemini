package com.cg.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.Dao.IEmployeeRepo;
import com.cg.Entity.Employee;
@Service
public class EmployeeService implements IEmployeeService {
	@Autowired
    private IEmployeeRepo repo;
	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Employee createEmployee(Employee emp) {
//		Optional<Employee> op=repo.findById(empid);
		return repo.saveAndFlush(emp);
	}

	@Override
	public Employee getEmployee(int empid) {
		return repo.findById(empid).get();
//		return null;
	}

	@Override
	public String removeEmployee(int empid) {
		if(getEmployee(empid)!=null) {
		repo.deleteById(empid);
		return "Employee deleted";
		}
		else {
			return "Employee not found";
		}
	}

	@Override
	public Employee updateEmployee(Employee e) {
		return repo.saveAndFlush(e);
	
	}

}
