package pille.database.dto;

import java.util.Date;

public class TournamentDto {
	
	private long tournamentId;
	
	private WebsiteUpdateDto websiteUpdate;
	
	private Date time;
	
	private String targetLink;
	
	private String organizer;
	
	private int numberOfFreePlaces;
	
	private int numberOfParticipants;
	
	private int queueSize;
	
	private String location;

	public TournamentDto(long tournamentId, WebsiteUpdateDto websiteUpdate, Date time, String targetLink, String organizer,
			int numberOfFreePlaces, int numberOfParticipants, int queueSize, String location) {
		this.tournamentId = tournamentId;
		this.websiteUpdate = websiteUpdate;
		this.time = time;
		this.targetLink = targetLink;
		this.organizer = organizer;
		this.numberOfFreePlaces = numberOfFreePlaces;
		this.numberOfParticipants = numberOfParticipants;
		this.queueSize = queueSize;
		this.location = location;
	}

	public long getTournamentId() {
		return tournamentId;
	}

	public void setTournamentId(long tournamentId) {
		this.tournamentId = tournamentId;
	}

	public WebsiteUpdateDto getWebsiteUpdate() {
		return websiteUpdate;
	}

	public void setWebsiteUpdate(WebsiteUpdateDto websiteUpdate) {
		this.websiteUpdate = websiteUpdate;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getTargetLink() {
		return targetLink;
	}

	public void setTargetLink(String targetLink) {
		this.targetLink = targetLink;
	}

	public String getOrganizer() {
		return organizer;
	}

	public void setOrganizer(String organizer) {
		this.organizer = organizer;
	}

	public int getNumberOfFreePlaces() {
		return numberOfFreePlaces;
	}

	public void setNumberOfFreePlaces(int numberOfFreePlaces) {
		this.numberOfFreePlaces = numberOfFreePlaces;
	}

	public int getNumberOfParticipants() {
		return numberOfParticipants;
	}

	public void setNumberOfParticipants(int numberOfParticipants) {
		this.numberOfParticipants = numberOfParticipants;
	}

	public int getQueueSize() {
		return queueSize;
	}

	public void setQueueSize(int queueSize) {
		this.queueSize = queueSize;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
}
