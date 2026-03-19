package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.entity.Trainee;
@Repository
public interface ITraineeRepo extends JpaRepository<Trainee,Integer>{

}
