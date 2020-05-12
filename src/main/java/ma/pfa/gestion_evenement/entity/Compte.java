package ma.pfa.gestion_evenement.entity;

import org.hibernate.validator.constraints.ScriptAssert;

import javax.persistence.*;

@Entity
public class Compte {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;
    private String login;
    private String password;
    private String privilege;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "personne")
    private Personne personne;

    public Compte() {
    }

    public Compte(String login, String password, String privilege, Personne personne) {
        this.login = login;
        this.password = password;
        this.privilege = privilege;
        this.personne = personne;
    }

    public Long getId() {
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
