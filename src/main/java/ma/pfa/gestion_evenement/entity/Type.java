package ma.pfa.gestion_evenement.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String type;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "type")
    private List<Evenement> equipement;

    public Type() {
    }

    public Type(String type) {
        this.type = type;
    }
}
