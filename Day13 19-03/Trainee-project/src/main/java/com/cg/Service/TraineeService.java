package com.cg.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.ITraineeRepo;
import com.cg.dto.EntityMapper;
import com.cg.dto.TraineeDTO;
import com.cg.entity.Trainee;
@Service
public class TraineeService implements ITraineeService {
	@Autowired
	private ITraineeRepo repo;
	@Override
	public List<TraineeDTO> getAllTrainee() {
		List<Trainee> t=repo.findAll();
		List<TraineeDTO> tdto=new ArrayList<>();
		t.forEach(tt->tdto.add(EntityMapper.convertEntityToObject(tt)));
		return tdto;
	}

	@Override
	public TraineeDTO createTrainee(TraineeDTO t) {
		Trainee t1=repo.saveAndFlush(EntityMapper.convertObjectToEntity(t));
		return EntityMapper.convertEntityToObject(t1);
	}

	@Override
	public TraineeDTO getTrainee(int traineeId) {
		Optional<Trainee> existing=repo.findById(traineeId);
        if(existing.isPresent()){
;
            return EntityMapper.convertEntityToObject(existing.get());
        }
        return null;
	}

	@Override
	public String removeTrainee(int traineeId) {
		if(getTrainee(traineeId)!=null){
            repo.deleteById(traineeId);
            return "Employee Deleted !!!";
        }
        else return "Employee Not Found !!";
	}

	@Override
	public TraineeDTO updateTrainee(TraineeDTO t) {
		 if(getTrainee(t.getTid())!=null){
	            Trainee td= repo.saveAndFlush(EntityMapper.convertObjectToEntity(t));
	            return EntityMapper.convertEntityToObject(td);
	        }
	        else return null;
	}

}
