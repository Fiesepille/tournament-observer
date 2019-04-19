package pille.database;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WebsiteToObserveRepository extends JpaRepository<WebsiteToObserve, Long> {

}
