package ma.pfa.gestion_evenement.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Etat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String etatEvenement;

    @OneToMany(mappedBy = "etat")
    private List<Evenement> evenement;

    public Etat() {
    }

    public Etat(String etatEvenement) {
        this.etatEvenement = etatEvenement;
    }

    public Long getId() { return id; }

    public String getEtatEvenement() {
        return etatEvenement;
    }

    public void setEtatEvenement(String etatEvenement) {
        this.etatEvenement = etatEvenement;
    }


}
