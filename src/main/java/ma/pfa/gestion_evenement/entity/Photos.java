package ma.pfa.gestion_evenement.entity;

import javax.persistence.*;

@Entity
public class Photos {
    @Id
private String photo;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "event")
    private  Evenement evenement;
}
