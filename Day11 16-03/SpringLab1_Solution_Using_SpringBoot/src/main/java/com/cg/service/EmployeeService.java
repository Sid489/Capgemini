package com.cg.service;

import com.cg.entity.Employee;
import com.cg.repository.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("eS")
public class EmployeeService {
    @Autowired
    private IEmployeeRepo repo;

    private List<Employee> employeeList;

    public EmployeeService(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public Employee getEmployeeById(int id) {
        return repo.findById(id).orElse(null);
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
