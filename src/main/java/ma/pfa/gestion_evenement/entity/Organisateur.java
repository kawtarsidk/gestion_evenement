package ma.pfa.gestion_evenement.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Organisateur extends Personne{
@OneToMany(mappedBy = "organisateur", fetch = FetchType.EAGER)
    private List<Evenement> evenements;

    public Organisateur() {
    }

    public List<Evenement> getEvenements() {
        return evenements;
    }

    public void setEvenements(List<Evenement> evenements) {
        this.evenements = evenements;
    }
}
