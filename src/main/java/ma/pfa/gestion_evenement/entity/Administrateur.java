package ma.pfa.gestion_evenement.entity;

import javax.persistence.Entity;

@Entity
public class Administrateur extends Personne {

    public Administrateur() {
    }

    public Administrateur(String cin, String nom, String prenom, String mail, String telephone, Long compte) {
        super(cin, nom, prenom, mail, telephone, compte);
    }
}
