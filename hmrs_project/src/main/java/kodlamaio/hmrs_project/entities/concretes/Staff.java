package kodlamaio.hmrs_project.entities.concretes;

import javax.persistence.*;

import lombok.AllArgsConstructor;

import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="staff")
public class Staff extends Users {
	
	
	@GeneratedValue
	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "surname")
	private String surname;
	

}
