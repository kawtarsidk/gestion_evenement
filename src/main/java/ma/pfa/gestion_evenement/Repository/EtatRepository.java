package ma.pfa.gestion_evenement.Repository;

import ma.pfa.gestion_evenement.entity.Etat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtatRepository extends JpaRepository<Etat,Long> {
}
