package newTpSpring;

import javax.persistence.Column; 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_")
public class User2 implements IoEntity {
	
	@Id
	@GeneratedValue
	private Long id;
	@Column
	private String login;
	@Column
	private String password;
	@Column
	private String name;
	
	public User2() {
		
	}
	
	public User2(Long id, String login, String password, String name) {
		this.id = id;
		this.login = login;
		this.password = password;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
