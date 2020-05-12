package ma.pfa.gestion_evenement.Repository;

import ma.pfa.gestion_evenement.entity.Photos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhotoRepository extends JpaRepository<Photos,Long> {
}
