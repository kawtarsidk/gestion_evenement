package ma.pfa.gestion_evenement.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Participant extends Personne{

    @OneToMany(mappedBy = "participant", fetch = FetchType.EAGER)
    private List<InfosParticipation> infosParticipations;

    public Participant() {
    }

    public Participant(String cin, String nom, String prenom, String mail, String telephone, Compte compte) {
        super(cin, nom, prenom, mail, telephone, compte);
    }
}
