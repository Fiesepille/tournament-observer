package pille.database;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WebsiteUpdateRepository extends JpaRepository<WebsiteUpdate, Long> {

}
