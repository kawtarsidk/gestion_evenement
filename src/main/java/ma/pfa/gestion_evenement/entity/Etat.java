package ma.pfa.gestion_evenement.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Etat {
    @Id
    private String etatEvenement;

    public Etat() {
    }

    public String getEtatEvenement() {
        return etatEvenement;
    }

    public void setEtatEvenement(String etatEvenement) {
        this.etatEvenement = etatEvenement;
    }
}
