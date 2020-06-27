package ma.pfa.gestion_evenement.Repository;
import ma.pfa.gestion_evenement.entity.Evenement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.Date;

public interface EventRepository extends JpaRepository<Evenement,Long> {

}

