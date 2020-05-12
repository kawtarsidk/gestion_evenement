package ma.pfa.gestion_evenement.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Etat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String etatEvenement;

    @OneToMany(mappedBy = "etat")
    private List<Compte> evenement;

    public Etat() {
    }

    public Etat(String etatEvenement) {
        this.etatEvenement = etatEvenement;
    }

    public String getEtatEvenement() {
        return etatEvenement;
    }

    public void setEtatEvenement(String etatEvenement) {
        this.etatEvenement = etatEvenement;
    }


}
