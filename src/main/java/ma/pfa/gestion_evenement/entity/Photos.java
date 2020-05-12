package ma.pfa.gestion_evenement.entity;

import javax.persistence.*;

@Entity
public class Photos {
    @Id
    private Long id;
    private String photo;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "evenement_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Compte evenement;

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Photos() {
    }

    public Long getId() { return id; }

    public Photos(String photo) {
        this.photo = photo;
    }
}
