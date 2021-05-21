package kodlamaio.hmrs_project.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hmrs_project.entities.concretes.Candidate;

public interface CandidateDao extends JpaRepository<Candidate, Integer> {

}
