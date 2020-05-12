package ma.pfa.gestion_evenement.Repository;

import ma.pfa.gestion_evenement.entity.Evenement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipementRepository extends JpaRepository<Evenement,Integer> {
}
