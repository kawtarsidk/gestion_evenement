package ma.pfa.gestion_evenement.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Etat {
    @Id
    private String etatEvenement;

    @OneToMany(mappedBy = "etat")
    private List<Evenement> evenement;

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
