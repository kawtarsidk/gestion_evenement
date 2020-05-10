package ma.pfa.gestion_evenement.entity;

import javax.persistence.*;

@Entity
public class Compte  {
    @Id
    private  long id;
    private String cin;
    private  String login;
    private String password;
    private String privilege;


}
