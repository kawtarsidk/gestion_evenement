package ma.pfa.gestion_evenement.Repository;

import ma.pfa.gestion_evenement.entity.Participant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParticipantRepository extends JpaRepository<Participant,Long> {
}
