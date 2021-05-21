package kodlamaio.hmrs_project.entities.concretes;

import javax.persistence.*;

import lombok.AllArgsConstructor;

import lombok.NoArgsConstructor;

@Entity

@NoArgsConstructor
@AllArgsConstructor
@Table(name="employers")
public class Employer extends Users{
	
	@GeneratedValue
	@Id
	@Column(name = "id")
    private int id;
	
	@Column(name = "company_name")
    private String companyName;
	
	@Column(name = "web_address")
    private String webAddress;
	
	@Column(name = "phone_number")
    private String phoneNumber;
}
