package pille.service;

import pille.exception.ServiceException;

public interface IAddEmailService {
	
	public void addEmail(String email) throws ServiceException;

}
