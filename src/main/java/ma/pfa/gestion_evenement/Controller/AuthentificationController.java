package ma.pfa.gestion_evenement.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.pfa.gestion_evenement.Repository.CompteRepository;
import ma.pfa.gestion_evenement.entity.Authentification;
import ma.pfa.gestion_evenement.entity.Compte;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("authentification")
public class AuthentificationController {

    @Autowired
    private CompteRepository compteRepository;
    
    @PostMapping("/login")
    public Compte login(@RequestBody Authentification authentification){
            return compteRepository.findByLoginAndPassword(authentification.getLogin(), authentification.getPassword());
            }

}
