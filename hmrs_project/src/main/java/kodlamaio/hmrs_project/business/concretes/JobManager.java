package kodlamaio.hmrs_project.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hmrs_project.business.abstracts.JobService;
import kodlamaio.hmrs_project.dataAccess.abstracts.JobDao;
import kodlamaio.hmrs_project.entities.concretes.JobPositions;


@Service
public class JobManager implements JobService{

	
	private JobDao jobDao; 
	
	
	@Autowired
	public JobManager(JobDao jobDao) {
		super();
		this.jobDao = jobDao;
	}


	@Override
	public List<JobPositions> getAll() {
		
		return this.jobDao.findAll();
	}

}
