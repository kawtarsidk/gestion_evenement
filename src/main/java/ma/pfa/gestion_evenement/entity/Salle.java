package ma.pfa.gestion_evenement.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Salle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private int nbrPlace;
    private boolean disponibilite;

    @OneToMany(mappedBy = "salle")
    private List<InfoSalle> infoSalle;


    public Salle() {
    }

    public Salle(Long id,String nom, int nbrPlace, boolean disponibilite, List<InfoSalle> infoSalle) {
        this.id=id;
        this.nom = nom;
        this.nbrPlace = nbrPlace;
        this.disponibilite = disponibilite;
        this.infoSalle = infoSalle;
    }

    public Long getId() { return id; }

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
