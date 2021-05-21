package kodlamaio.hmrs_project.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hmrs_project.entities.concretes.Staff;

public interface StaffDao extends JpaRepository<Staff, Integer>{

}
