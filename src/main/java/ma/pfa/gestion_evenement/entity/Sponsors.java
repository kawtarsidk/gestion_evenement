package ma.pfa.gestion_evenement.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Sponsors {
    @Id
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
