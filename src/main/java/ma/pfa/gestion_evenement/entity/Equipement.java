package ma.pfa.gestion_evenement.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Equipement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "type")
    private Type type;

    @ManyToMany(mappedBy = "equipement", fetch = FetchType.EAGER)
    private Set<Evenement> evenement = new HashSet<>();

    public Equipement() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
