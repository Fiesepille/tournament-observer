package pille.database;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import pille.tournament.ITournament;

@Entity
public class Tournament implements ITournament {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long tournamentId;
	
	@ManyToOne
	private WebsiteUpdate websiteUpdate;
	
	@Temporal(TemporalType.DATE)
	private Date time;
	
	private String targetLink;
	
	private String organizer;
	
	private int numberOfFreePlaces;
	
	private int numberOfParticipants;
	
	private int queueSize;
	
	private String location;
	
	public Tournament() {
		
	}
	
	public Tournament(long tournamentId, WebsiteUpdate websiteUpdate, Date time, String targetLink, String organizer,
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

	public WebsiteUpdate getWebsiteUpdate() {
		return websiteUpdate;
	}

	public void setWebsiteUpdate(WebsiteUpdate websiteUpdate) {
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
