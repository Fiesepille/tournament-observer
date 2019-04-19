package pille.database.service;

import pille.database.dto.WebsiteToObserveDto;
import pille.database.dto.WebsiteUpdateDto;

public interface IWebsiteToObserveService {
	
	public WebsiteUpdateDto getLastUpdate();
	
	public void createWebsiteToObserve(WebsiteToObserveDto websiteToObserveDto);
	
	public void createUpdate(long websiteId);
	
	//@Override
//	public void legeKommentarAb(Long todoId, String text, String login) {

}
