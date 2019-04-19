package pille.tournament;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.jsoup.nodes.Element;
import org.springframework.stereotype.Component;

import pille.database.Tournament;

@Component
public class TournamentFactory {
	
	private SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm");
	
	public Tournament create(Element htmlElement) {
		
		Tournament tournament = new Tournament();
		
		List<Element> data = htmlElement.select("td");
		
		String dateString = data.get(0).text().substring(4, 20);
		try {
			tournament.setTime(dateFormat.parse(dateString));
		} catch (ParseException e) {
			e.printStackTrace();
			throw new RuntimeException("Parsing data failed");
		}
		
		Element secondElement = data.get(1);
		String url = "https://bttv.click-tt.de" + secondElement.select("a").attr("href");
		tournament.setTargetLink(url);
		tournament.setOrganizer(secondElement.text().substring(22));
		
		Element thirdElement = data.get(2);
		String[] array = thirdElement.text().split("/", 2);
		tournament.setNumberOfFreePlaces(Integer.parseInt(array[0]));
		tournament.setNumberOfParticipants(Integer.parseInt(array[1]));
		
		String queueSize = data.get(3).text();
		tournament.setQueueSize(isNumeric(queueSize) ? Integer.parseInt(queueSize) : 0);
		
		tournament.setLocation(data.get(4).text());
		
		return tournament;
		
	}
	
	public static boolean isNumeric(String str) { 
		  try {  
		    Integer.parseInt(str);  
		    return true;
		  } catch(NumberFormatException e){  
		    return false;  
		  }  
		}

}
