package kodlamaio.hmrs_project.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hmrs_project.business.abstracts.JobService;
import kodlamaio.hmrs_project.entities.concretes.JobPositions;


@RestController
@RequestMapping("/api/position")
public class JobController {
	
private JobService jobservice;
	
	
@Autowired
public JobController(JobService jobservice) {
	super();
	this.jobservice = jobservice;
}
	
	

@GetMapping("/getAll")	
public List<JobPositions> getAll(){
	return this.jobservice.getAll();
	
}

public JobController() {
		super();
	}




}
