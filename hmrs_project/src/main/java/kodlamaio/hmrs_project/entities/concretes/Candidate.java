package kodlamaio.hmrs_project.entities.concretes;

import java.time.LocalDate;

import javax.persistence.*;

import lombok.AllArgsConstructor;

import lombok.NoArgsConstructor;


@Entity

@NoArgsConstructor
@AllArgsConstructor
@Table(name="candidates")
public class Candidate extends Users{
	
	@GeneratedValue
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="surname")
	private String surname;
	
	@Column(name="identity_number")
	private String identityNumber;
	
	@Column(name="birth_date")
	private LocalDate birthYear;

}
