package ma.pfa.gestion_evenement.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class InfosParticipation  {

    @EmbeddedId
    private InfosPaticipationID id;
    @ManyToOne
    @JoinColumn(name = "evenement_id", referencedColumnName = "id", insertable = false, updatable = false)
    private  Evenement evenement;
    @ManyToOne
    @JoinColumn(name = "participant_id", referencedColumnName = "id", insertable = false, updatable = false)
    private  Participant participant;

    public InfosParticipation() {
    }

    public InfosParticipation(Evenement evenement, Participant participant) {
        this.evenement = evenement;
        this.participant = participant;
    }
}
