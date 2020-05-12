package ma.pfa.gestion_evenement.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Sponsors {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    @OneToMany(mappedBy = "sponsors",fetch = FetchType.LAZY)
    private List<Budget> Budget;

    public Sponsors() {
    }

    public Sponsors(String nom, List<ma.pfa.gestion_evenement.entity.Budget> budget) {
        this.nom = nom;
        Budget = budget;
    }

    public Long getId() { return id; }

    public String getNom() {
        return nom;
    }

    public List<Budget> getBudget() {
        return Budget;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setBudget(List<Budget> budget) {
        Budget = budget;
    }
}
