package ma.pfa.gestion_evenement.Repository;

import ma.pfa.gestion_evenement.entity.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte,Long> {
	
	public Compte findByLoginAndPassword(String login,String password);


}
