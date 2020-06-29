package ma.pfa.gestion_evenement.entity;

import javax.persistence.Entity;

@Entity
public class Directeur extends Personne {

    public Directeur() {
    }

    public Directeur(String cin, String nom, String prenom, String mail, String telephone, Long compte) {
        super(cin, nom, prenom, mail, telephone, compte);
    }

}
