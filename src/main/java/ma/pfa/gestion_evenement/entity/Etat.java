package ma.pfa.gestion_evenement.entity;

import javax.persistence.Entity;

@Entity
public class Etat {
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
