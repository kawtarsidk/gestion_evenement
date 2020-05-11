package ma.pfa.gestion_evenement.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class InfosPaticipationID implements Serializable {
    private int evenement;
    private  int patricipant;
    private Date dateInscription;
    private  boolean presence;


    public InfosPaticipationID() {
    }
}
