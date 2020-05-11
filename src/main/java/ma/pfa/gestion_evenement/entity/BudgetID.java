package ma.pfa.gestion_evenement.entity;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class BudgetID implements Serializable{
    private int sponsors;
    private int evenement;
    private int budget;

    public BudgetID() {
    }

    public BudgetID(int sponsors, int evenement, int budget) {
        this.sponsors = sponsors;
        this.evenement = evenement;
        this.budget = budget;
    }
}
