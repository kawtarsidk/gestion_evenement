package ma.pfa.gestion_evenement.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Participant extends Personne{
    public Participant() {
    }
    @OneToMany(mappedBy = "participant", fetch = FetchType.LAZY)
    private List<InfosParticipation> infosParticipations;
}
