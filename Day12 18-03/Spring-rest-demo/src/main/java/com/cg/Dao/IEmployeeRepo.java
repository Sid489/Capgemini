package com.cg.Dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.*;
import org.springframework.stereotype.Repository;

import com.cg.Entity.Employee;
@Repository
public interface IEmployeeRepo extends JpaRepository<Employee,Integer>{

}
