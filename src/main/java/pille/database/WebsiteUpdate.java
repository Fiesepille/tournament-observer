package pille.database;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class WebsiteUpdate {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long updateId;
	
	@ManyToOne
	private WebsiteToObserve website;
	
	@OneToMany(mappedBy = "websiteUpdate")
	private Set<Tournament> tournaments;
	
	public WebsiteUpdate() {
		
	}
	
	public WebsiteUpdate(long updateId, WebsiteToObserve website, Set<Tournament> tournaments) {
		this.updateId = updateId;
		this.website = website;
		this.tournaments = tournaments;
	}

	public long getUpdateId() {
		return updateId;
	}

	public void setUpdateId(long updateId) {
		this.updateId = updateId;
	}

	public WebsiteToObserve getWebsite() {
		return website;
	}

	public void setWebsite(WebsiteToObserve website) {
		this.website = website;
	}

	public Set<Tournament> getTournaments() {
		return tournaments;
	}

	public void setTournaments(Set<Tournament> tournaments) {
		this.tournaments = tournaments;
	}
}
