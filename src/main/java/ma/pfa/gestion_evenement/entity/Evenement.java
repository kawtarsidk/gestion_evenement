package ma.pfa.gestion_evenement.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Evenement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "organisateur_id",referencedColumnName = "id", insertable = false, updatable = false)
    private Organisateur organisateur;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "etat_id" , referencedColumnName = "id", insertable = false, updatable = false)
    private Etat etat;

    @OneToMany(mappedBy = "evenement",fetch = FetchType.LAZY)
    private List<Photos> photos;

    @OneToMany(mappedBy = "evenement",fetch = FetchType.LAZY)
    private List<InfosParticipation> infosParticipations;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinTable(name = "InfoEquipement",
            joinColumns = {
                    @JoinColumn(name = "evenement_id", referencedColumnName = "id",
                            nullable = false, updatable = false)},
            inverseJoinColumns = {
                    @JoinColumn(name = "equipement_id", referencedColumnName = "id",
                            nullable = false, updatable = false)})
    private List<Equipement> equipement;

    @OneToMany(mappedBy = "evenement",fetch = FetchType.LAZY)
    private List<Budget> Budget;

    @OneToMany(mappedBy = "evenement")
    private List<InfoSalle> infoSalle;



    public Evenement() {
    }

    public Evenement(String titre, Date datedebut, Date datefin, String theme, int nbrParticipant, String objectif, String publicConcerne, String details, Organisateur organisateur, Etat etat, List<Photos> photos, List<InfosParticipation> infosParticipations, List<Equipement> equipement, List<Budget> budget, List<InfoSalle> infoSalle) {
        this.titre = titre;
        this.datedebut = datedebut;
        this.datefin = datefin;
        this.theme = theme;
        this.nbrParticipant = nbrParticipant;
        this.objectif = objectif;
        this.publicConcerne = publicConcerne;
        this.details = details;
        this.organisateur = organisateur;
        this.etat = etat;
        this.photos = photos;
        this.infosParticipations = infosParticipations;
        this.equipement = equipement;
        this.Budget = budget;
        this.infoSalle = infoSalle;
    }

    public Evenement(Long id) { this.id = id; }

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





}

