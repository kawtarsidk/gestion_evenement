package ma.pfa.gestion_evenement.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Sponsors {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    @OneToMany(mappedBy = "sponsors",fetch = FetchType.EAGER)
    private List<Budget> Budget;

    public Sponsors() {
    }

    public Sponsors(String nom, List<ma.pfa.gestion_evenement.entity.Budget> budget) {
        this.nom = nom;
        Budget = budget;
    }
}
