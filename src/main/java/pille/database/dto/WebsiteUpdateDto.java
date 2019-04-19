package pille.database.dto;

import java.util.HashSet;
import java.util.Set;

public class WebsiteUpdateDto {

	private long updateId;

	private WebsiteToObserveDto website;

	private Set<TournamentDto> tournaments = new HashSet<>();

	public WebsiteUpdateDto(long updateId, WebsiteToObserveDto website, Set<TournamentDto> tournaments) {
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

	public WebsiteToObserveDto getWebsite() {
		return website;
	}

	public void setWebsite(WebsiteToObserveDto website) {
		this.website = website;
	}

	public Set<TournamentDto> getTournaments() {
		return tournaments;
	}

	public void setTournaments(Set<TournamentDto> tournaments) {
		this.tournaments = tournaments;
	}

}
