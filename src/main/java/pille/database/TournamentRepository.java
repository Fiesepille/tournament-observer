package pille.database;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface TournamentRepository extends JpaRepository<Tournament, Long> {

}
