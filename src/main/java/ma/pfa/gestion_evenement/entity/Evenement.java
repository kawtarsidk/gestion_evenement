package ma.pfa.gestion_evenement.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Evenement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String titre;

    @Temporal(TemporalType.DATE)
    private Date datedebut;

    @Temporal(TemporalType.DATE)
    private Date datefin;

    private String theme;

    private int nbrParticipant;

    private String objectif;

    private String publicConcerne;

    private String details;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "organisateur_id",referencedColumnName = "id", insertable = false, updatable = false)
    private Organisateur organisateur;


    public Evenement() {
    }

    public String getTitre() {
        return titre;
    }

    public Date getDatedebut() {
        return datedebut;
    }

    public Date getDatefin() {
        return datefin;
    }

    public String getTheme() {
        return theme;
    }

    public int getNbrParticipant() {
        return nbrParticipant;
    }

    public String getObjectif() {
        return objectif;
    }

    public String getPublicConcerne() {
        return publicConcerne;
    }

    public String getDetails() {
        return details;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setDatedebut(Date datedebut) {
        this.datedebut = datedebut;
    }

    public void setDatefin(Date datefin) {
        this.datefin = datefin;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public void setNbrParticipant(int nbrParticipant) {
        this.nbrParticipant = nbrParticipant;
    }

    public void setObjectif(String objectif) {
        this.objectif = objectif;
    }

    public void setPublicConcerne(String publicConcerne) {
        this.publicConcerne = publicConcerne;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "etat_id" , referencedColumnName = "id", insertable = false, updatable = false)
    private Etat etat;

    @OneToMany(mappedBy = "evenement",fetch = FetchType.LAZY)
    private List<Photos> photos;

    @OneToMany(mappedBy = "evenement",fetch = FetchType.LAZY)
    private List<InfosParticipation> infosParticipations;

    @OneToMany(mappedBy = "evenement")
    private List<InfoSalle> infoSalles;

}

