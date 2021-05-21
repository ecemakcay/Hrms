package kodlamaio.hmrs_project.entities.concretes;
import javax.persistence.*;

import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="users")
public class Users {
	
	@GeneratedValue
	@Id
	@Column(name = "id")
    private int id;
	
	@Column(name = "mail")
    private String mail;
	
	@Column(name = "password")
    private String password;

}
