package ma.pfa.gestion_evenement.entity;

import javax.persistence.Entity;

@Entity
public class RespoLogistique extends Personne {

    public RespoLogistique() {
    }

    public RespoLogistique(String cin, String nom, String prenom, String mail, String telephone, Compte compte) {
        super(cin, nom, prenom, mail, telephone, compte);
    }
}
