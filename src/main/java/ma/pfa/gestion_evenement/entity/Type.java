package ma.pfa.gestion_evenement.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Type {
    @Id
    private String type;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "type")
    private List<Equipement> equipement;
}
