package ma.pfa.gestion_evenement.Repository;

import ma.pfa.gestion_evenement.entity.Type;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeRepository extends JpaRepository<Type,Long> {
}
