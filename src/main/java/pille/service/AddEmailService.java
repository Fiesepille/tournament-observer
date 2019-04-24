package pille.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pille.database.service.IObserverService;
import pille.exception.ServiceException;

@Service
public class AddEmailService implements IAddEmailService {
	
	private IObserverService observerService;
	
	@Autowired
	public AddEmailService(IObserverService observerService) {
		this.observerService = observerService;
	}



	@Override
	public void addEmail(String email) throws ServiceException {
		observerService.createEmail(email);
	}

}
