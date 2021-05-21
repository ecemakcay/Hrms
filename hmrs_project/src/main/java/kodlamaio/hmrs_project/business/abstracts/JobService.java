package kodlamaio.hmrs_project.business.abstracts;

import java.util.List;

import kodlamaio.hmrs_project.entities.concretes.JobPositions;


public interface JobService {
	
	List<JobPositions> getAll(); 

}
