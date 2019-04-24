package pille.database.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pille.database.Observer;
import pille.database.ObserverRepository;

@Service
@Transactional
public class ObserverService implements IObserverService {
	
	private ObserverRepository observerRepository;
	
	@Autowired
	public ObserverService(ObserverRepository observerRepository) {
		this.observerRepository = observerRepository;
	}

	@Override
	public void createEmail(String email) {
		Observer observer = new Observer();
		observer.setEmail(email);
		observerRepository.save(observer);
		
	}

}
