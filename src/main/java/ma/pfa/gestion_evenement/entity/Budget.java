package ma.pfa.gestion_evenement.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Budget {
    @EmbeddedId
    private BudgetID id;
    @ManyToOne
    @JoinColumn(name ="Sponsors", referencedColumnName = "id",insertable = false, updatable = false)
    private Salle salle;
    @ManyToOne
    @JoinColumn(name ="evenement", referencedColumnName = "id",insertable = false, updatable = false)
    private Evenement evenement;

    public Budget() {
    }

    public Budget(BudgetID id, Salle salle, Evenement evenement) {
        this.id = id;
        this.salle = salle;
        this.evenement = evenement;
    }
}
