package pille.service;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pille.database.dto.WebsiteToObserveDto;
import pille.database.service.IWebsiteToObserveService;
import pille.exception.ServiceException;

@Service
public class AddWebsiteService implements IAddWebsiteService {
	
	private IWebsiteToObserveService websiteService;

	@Autowired
	public AddWebsiteService(IWebsiteToObserveService websiteService) {
		this.websiteService = websiteService;
	}



	public void addWebsite(String website) throws ServiceException {
		
		Document doc;
		try {
			doc = Jsoup.connect(website).get();
		} catch (IOException e) {
			throw new ServiceException(e);
		}
		List<Element> elements = doc.select("table[width],[border],[cellpadding],[cellspacing]");
		
		String header = elements.stream()
			.map(element -> element.select("tr").select("td").select("h2").text())
			.filter(x -> Pattern.matches("Turniere im .*", x))
			.findFirst().get();
		
		Month month;
		try {
			month = Month.valueOf(new SimpleDateFormat("MMMM", Locale.US).format(new SimpleDateFormat("MMMMM", Locale.GERMAN).parse(header.split(" ")[2])).toUpperCase());
		} catch (ParseException e) {
			throw new ServiceException(e);
		}
		
		WebsiteToObserveDto page = new WebsiteToObserveDto();
		page.setMonth(month);
		page.setUrl(website);
		
		websiteService.createWebsiteToObserve(page);
		
	}

}
