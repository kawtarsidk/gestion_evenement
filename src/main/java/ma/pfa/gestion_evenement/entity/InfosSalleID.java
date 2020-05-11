package ma.pfa.gestion_evenement.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class InfosSalleID implements Serializable {
    private int salle;
    private int evenement;
    private int nbPlaces;

    public InfosSalleID() {
    }

}
