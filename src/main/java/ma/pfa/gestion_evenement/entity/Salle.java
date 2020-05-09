package ma.pfa.gestion_evenement.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Salle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private int bnrPlace;
    private boolean disponibilite;

    public Salle() {
    }

    public String getNom() {
        return nom;
    }

    public int getBnrPlace() {
        return bnrPlace;
    }

    public boolean isDisponibilite() {
        return disponibilite;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setBnrPlace(int bnrPlace) {
        this.bnrPlace = bnrPlace;
    }

    public void setDisponibilite(boolean disponibilite) {
        this.disponibilite = disponibilite;
    }
}
