package pille.service;

import pille.exception.ServiceException;

public interface IAddWebsiteService {
	
	public void addWebsite(String website) throws ServiceException;

}
