package pille.tournament;
import java.util.Date;

public interface ITournament {

	public Date getTime();
	
	public String getLocation();
	
	public String getTargetLink();
	
	public String getOrganizer();
	
	public int getNumberOfFreePlaces();
	
	public int getNumberOfParticipants();
	
	public int getQueueSize();
	
}
