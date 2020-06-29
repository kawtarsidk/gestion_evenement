package ma.pfa.gestion_evenement.Repository;

import ma.pfa.gestion_evenement.entity.Administrateur;
import ma.pfa.gestion_evenement.entity.InfosParticipation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParticipationInfos extends JpaRepository<InfosParticipation,Long> {
}
