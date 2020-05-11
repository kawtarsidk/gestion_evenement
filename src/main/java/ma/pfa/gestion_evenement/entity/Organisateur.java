package ma.pfa.gestion_evenement.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Organisateur extends Personne{

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "organisateur")
    private List<Evenement> evenement;

    public Organisateur() {
    }

    public Organisateur(String cin, String nom, String prenom, String mail, String telephone, Compte compte) {
        super(cin, nom, prenom, mail, telephone, compte);
    }

}
