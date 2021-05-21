package kodlamaio.hmrs_project.entities.concretes;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="job_positions")
public class JobPositions {

	@GeneratedValue
	@Id
	@Column(name = "id")
    private int id;
	
	@Column(name = "position")
    private String position;
	
	
}
