package pille.database.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pille.database.WebsiteToObserve;
import pille.database.WebsiteToObserveRepository;
import pille.database.dto.WebsiteToObserveDto;
import pille.database.dto.WebsiteUpdateDto;

@Service
@Transactional
public class WebsiteToObserveService implements IWebsiteToObserveService {
	
	private WebsiteToObserveRepository websiteRepository;
	
	@Autowired
	public WebsiteToObserveService(WebsiteToObserveRepository websiteRepository) {
		this.websiteRepository = websiteRepository;
	}

	@Override
	public WebsiteUpdateDto getLastUpdate() {
		return null;
	}

	@Override
	public void createWebsiteToObserve(WebsiteToObserveDto websiteToObserveDto) {
		WebsiteToObserve websiteToObserve = new WebsiteToObserve();
		websiteToObserve.setMonth(websiteToObserveDto.getMonth());
		websiteToObserve.setUrl(websiteToObserveDto.getUrl());
		websiteRepository.save(websiteToObserve);
	}

	@Override
	public void createUpdate(long websiteId) {
		Optional<WebsiteToObserve> website = websiteRepository.findById(websiteId);
		
	}
	
	


}
