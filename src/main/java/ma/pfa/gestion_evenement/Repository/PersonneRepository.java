package ma.pfa.gestion_evenement.Repository;

import ma.pfa.gestion_evenement.entity.Personne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonneRepository extends JpaRepository<Personne,Integer> {
}
