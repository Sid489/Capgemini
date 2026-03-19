package com.cg.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.Service.ITraineeService;
import com.cg.dto.TraineeDTO;

@RestController
@RequestMapping("trainee")
public class TraineeController {
	@Autowired
	private ITraineeService service;

	public TraineeController(ITraineeService service) {
		super();
		this.service = service;
	}
	@GetMapping
	public List<TraineeDTO> getTrainee(){
		return service.getAllTrainee();
	}
    @GetMapping("/{tid}")
    public ResponseEntity<TraineeDTO> getTrainee(@PathVariable int tid) {
		TraineeDTO t=service.getTrainee(tid);
		if(t!=null) {
			return new ResponseEntity<TraineeDTO>(t,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
    @PostMapping(consumes= {"application/json","application/xml"})
	public TraineeDTO createNewEmployee(@RequestBody TraineeDTO td) {
		return service.createTrainee(td);
	}
    @DeleteMapping("/{tid}")
	public String deleteTrainee(@PathVariable int tid) {
		return service.removeTrainee(tid);
	}
    @PutMapping
	public TraineeDTO updateTrainee(@RequestBody TraineeDTO td) {
		return service.updateTrainee(td);
	}

}
