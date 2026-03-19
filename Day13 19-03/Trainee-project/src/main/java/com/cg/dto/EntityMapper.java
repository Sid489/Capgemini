package com.cg.dto;

//import com.cg.Entity.Employee;
import com.cg.entity.Trainee;

public class EntityMapper {
	public static Trainee convertObjectToEntity(TraineeDTO eDto){
        return new Trainee(eDto.getTid(),eDto.gettName(), eDto.gettDomain(), eDto.gettLocation());
    }
    public static TraineeDTO convertEntityToObject(Trainee t) {
    	return new TraineeDTO(t.getTraineeId(),t.getTraineeName(),t.getTraineeDomain(),t.getTraineeLocation());
    }
}
