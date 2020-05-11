package ma.pfa.gestion_evenement.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Salle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private int nbrPlace;
    private boolean disponibilite;

    @OneToMany(mappedBy = "salle")
    private List<InfoSalle> infoSalles;


    public Salle() {
    }

    public String getNom() {
        return nom;
    }

    public int getBnrPlace() {
        return nbrPlace;
    }

    public boolean isDisponibilite() {
        return disponibilite;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setBnrPlace(int bnrPlace) {
        this.nbrPlace = bnrPlace;
    }

    public void setDisponibilite(boolean disponibilite) {
        this.disponibilite = disponibilite;
    }
}
