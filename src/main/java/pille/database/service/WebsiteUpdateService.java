package pille.database.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pille.database.WebsiteUpdate;
import pille.database.WebsiteUpdateRepository;
import pille.database.dto.WebsiteUpdateDto;

@Service
@Transactional
public class WebsiteUpdateService implements IWebsiteUpdateService {
	
	private WebsiteUpdateRepository websiteUpdateRepository;
	
	@Autowired
	public WebsiteUpdateService(WebsiteUpdateRepository websiteUpdateRepository) {
		this.websiteUpdateRepository = websiteUpdateRepository;
	}

	@Override
	public void createWebsiteUpdate(WebsiteUpdateDto websiteUpdateDto) {

	}

}
