package pille.database;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;

@Entity
public class Observer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long observerId;
	
	@Email
	public String email;
	
	public Observer() {
		
	}

	public Observer(long observerId, @Email String email) {
		this.observerId = observerId;
		this.email = email;
	}

	public long getObserverId() {
		return observerId;
	}

	public void setObserverId(long observerId) {
		this.observerId = observerId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
