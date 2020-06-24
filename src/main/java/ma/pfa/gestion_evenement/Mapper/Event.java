package ma.pfa.gestion_evenement.Mapper;

import ma.pfa.gestion_evenement.entity.Evenement;

import javax.persistence.*;
import java.util.Date;

public class Event {
    private Long id;
    private String titre;
    private Date datedebut;
    private Date datefin;
    private String theme;
    private int nbrParticipant;
    private String objectif;
    private String publicConcerne;
    private String details;

    public Event(Long id, String titre, Date datedebut, Date datefin, String theme, int nbrParticipant, String objectif, String publicConcerne, String details) {
        this.id = id;
        this.titre = titre;
        this.datedebut = datedebut;
        this.datefin = datefin;
        this.theme = theme;
        this.nbrParticipant = nbrParticipant;
        this.objectif = objectif;
        this.publicConcerne = publicConcerne;
        this.details = details;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Date getDatedebut() {
        return datedebut;
    }

    public void setDatedebut(Date datedebut) {
        this.datedebut = datedebut;
    }

    public Date getDatefin() {
        return datefin;
    }

    public void setDatefin(Date datefin) {
        this.datefin = datefin;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public int getNbrParticipant() {
        return nbrParticipant;
    }

    public void setNbrParticipant(int nbrParticipant) {
        this.nbrParticipant = nbrParticipant;
    }

    public String getObjectif() {
        return objectif;
    }

    public void setObjectif(String objectif) {
        this.objectif = objectif;
    }

    public String getPublicConcerne() {
        return publicConcerne;
    }

    public void setPublicConcerne(String publicConcerne) {
        this.publicConcerne = publicConcerne;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Event() {
    }

    public Event evenementToEvent(Evenement evenement){
        Event event = new Event();
        event.setId(evenement.getId());
        event.setTitre(evenement.getTitre());
        event.setTheme(evenement.getTheme());
        event.setDatedebut(evenement.getDatedebut());
        event.setDatefin(evenement.getDatefin());
        event.setDetails(evenement.getDetails());
        event.setNbrParticipant(evenement.getNbrParticipant());
        event.setPublicConcerne(evenement.getPublicConcerne());
        event.setObjectif(evenement.getObjectif());

        return event;

    }
}
