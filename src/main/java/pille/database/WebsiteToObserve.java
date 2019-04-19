package pille.database;

import java.time.Month;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class WebsiteToObserve {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long websiteId;
	
	private String url;
	
	@Enumerated(EnumType.STRING)
	private Month month;
	
	@OneToOne
	private WebsiteUpdate lastUpdate;
	
	public WebsiteToObserve() {
		
	}
	
	public WebsiteToObserve(long websiteId, String url, Month month, WebsiteUpdate lastUpdate) {
		this.websiteId = websiteId;
		this.url = url;
		this.month = month;
		this.lastUpdate = lastUpdate;
	}

	public long getWebsiteId() {
		return websiteId;
	}

	public void setWebsiteId(long websiteId) {
		this.websiteId = websiteId;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Month getMonth() {
		return month;
	}

	public void setMonth(Month month) {
		this.month = month;
	}

	public WebsiteUpdate getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(WebsiteUpdate lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	
}
