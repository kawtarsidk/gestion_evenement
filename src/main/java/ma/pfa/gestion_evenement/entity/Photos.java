package ma.pfa.gestion_evenement.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Photos {
    @Id
private String photo;
    @ManyToOne
    @JoinColumn(name = "event")
    private  Evenement evenement;
}
