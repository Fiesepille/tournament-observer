package pille.database.dto;

import java.time.Month;

public class WebsiteToObserveDto {
	
	private long websiteId;
	
	private String url;
	
	private Month month;
	
	private WebsiteUpdateDto lastUpdate;
	
	public WebsiteToObserveDto(long websiteId, String url, Month month, WebsiteUpdateDto lastUpdate) {
		this.websiteId = websiteId;
		this.url = url;
		this.month = month;
		this.lastUpdate = lastUpdate;
	}
	
	public WebsiteToObserveDto() {}

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

	public WebsiteUpdateDto getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(WebsiteUpdateDto lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
}
