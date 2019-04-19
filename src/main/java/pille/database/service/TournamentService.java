package pille.database.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pille.database.TournamentRepository;
import pille.database.dto.TournamentDto;

@Service
@Transactional
public class TournamentService implements ITournamentService {
	
	private TournamentRepository tournamentRepository;
	
	@Autowired
	public TournamentService(TournamentRepository tournamentRepository) {
		this.tournamentRepository = tournamentRepository;
	}



	@Override
	public void createTournament(TournamentDto tournamentDto) {
		
	}
	
	

}
