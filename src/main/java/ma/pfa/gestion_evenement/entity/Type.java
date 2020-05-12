package ma.pfa.gestion_evenement.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "type")
    private List<Equipement> equipement;

    public Type() {
    }

    public Type(String type, List<Equipement> equipement) {
        this.type = type;
        this.equipement = equipement;
    }

    public Long getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public List<Equipement> getEquipement() {
        return equipement;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setEquipement(List<Equipement> equipement) {
        this.equipement = equipement;
    }
}
