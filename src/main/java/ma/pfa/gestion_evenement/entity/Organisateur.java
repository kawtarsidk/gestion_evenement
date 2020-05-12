package ma.pfa.gestion_evenement.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Organisateur extends Personne{

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "organisateur")
    private List<Compte> evenement;

    public Organisateur() {
    }

    public Organisateur(String cin, String nom, String prenom, String mail, String telephone, Compte compte) {
        super(cin, nom, prenom, mail, telephone, compte);
    }

}
