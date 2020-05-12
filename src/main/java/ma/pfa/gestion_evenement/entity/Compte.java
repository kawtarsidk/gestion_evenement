package ma.pfa.gestion_evenement.entity;

import javax.persistence.*;

@Entity
public class Compte  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String login;
    private String password;
    private String privilege;

    @OneToOne(mappedBy = "compte", fetch = FetchType.EAGER)
    private Personne personne;

    public Compte() {
    }

    public Compte(String login, String password, String privilege, Personne personne) {
        this.login = login;
        this.password = password;
        this.privilege = privilege;
        this.personne = personne;
    }

    public long getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getPrivilege() {
        return privilege;
    }

    public Personne getPersonne() {
        return personne;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPrivilege(String privilege) {
        this.privilege = privilege;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }
}
