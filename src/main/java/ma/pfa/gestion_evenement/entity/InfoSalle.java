package ma.pfa.gestion_evenement.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class InfoSalle {
    @EmbeddedId
    private InfosSalleID id;
    @ManyToOne
    @JoinColumn(name ="salle", referencedColumnName = "id",insertable = false, updatable = false)
    private Salle salle;


    public InfoSalle() {
    }

}
