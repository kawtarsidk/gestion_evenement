package ma.pfa.gestion_evenement.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Equipement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "type", referencedColumnName = "id", insertable = false, updatable = false)
    private Type type;

    @ManyToMany(mappedBy = "equipement", fetch = FetchType.LAZY)
    private List<Evenement> evenement;

    public Equipement() {
    }

    public Equipement(String nom, Type type) {
        this.nom = nom;
        this.type = type;
    }

    public Long getId() { return id; }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


}
