package com.cg.Service;

import java.util.List;

import com.cg.dto.TraineeDTO;

public interface ITraineeService {
   public List<TraineeDTO> getAllTrainee();
   public TraineeDTO createTrainee(TraineeDTO t);
	public TraineeDTO getTrainee(int traineeId);
	public String removeTrainee(int traineeId);
	public TraineeDTO updateTrainee(TraineeDTO t);
}
