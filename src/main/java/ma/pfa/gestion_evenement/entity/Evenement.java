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
    private int budget;
    private String objectif;
    private String publicConcerne;
    private String details;
    private String etat;
    private String equipements;
    private int  salle_id;

    public int getSalle_id() {
        return salle_id;
    }

    public void setSalle_id(int salle_id) {
        this.salle_id = salle_id;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public String getEquipements() {
        return equipements;
    }

    public void setEquipements(String equipements) {
        this.equipements = equipements;
    }

    @OneToMany(mappedBy = "evenement",fetch = FetchType.LAZY)
    private List<Photos> photos;
    public Evenement() {
    }

    public Evenement(String titre, Date datedebut, Date datefin, String theme, int nbrParticipant, String objectif, int budget, String publicConcerne, String details, String etat, String equipements, int salle_id) {
        this.titre = titre;
        this.datedebut = datedebut;
        this.datefin = datefin;
        this.theme = theme;
        this.nbrParticipant = nbrParticipant;
        this.objectif = objectif;
        this.publicConcerne = publicConcerne;
        this.details = details;
        this.etat = etat;
        this.salle_id = salle_id;
        this.equipements=equipements;
        this.budget=budget;
    }

    public Evenement(Long id) { this.id = id; }

    public Long getId() {
        return id;
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





}

