package kodlamaio.hmrs_project.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hmrs_project.entities.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer, Integer>{

}
