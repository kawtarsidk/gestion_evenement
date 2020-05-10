package ma.pfa.gestion_evenement.entity;

import javax.persistence.*;

@Entity
public class Equipement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "type")
    private Type type;

    public Equipement() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
