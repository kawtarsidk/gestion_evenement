package ma.pfa.gestion_evenement.entity;

import javax.persistence.*;

@Entity
public class Photos {
    @Id
    private String photo;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "evenement_id", referencedColumnName = "id", insertable = false, updatable = false)
    private  Evenement evenement;

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Photos() {
    }

    public Photos(String photo) {
        this.photo = photo;
    }
}
