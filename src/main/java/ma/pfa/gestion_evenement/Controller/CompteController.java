package ma.pfa.gestion_evenement.Controller;


import ma.pfa.gestion_evenement.Repository.CompteRepository;
import ma.pfa.gestion_evenement.entity.Compte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("comptes")
public class CompteController{
    @Autowired
    private CompteRepository compteRepository;


    @PostMapping("/saveAccount")
    public void save(@RequestBody Compte compte){
        compteRepository.save(compte);
    }
    @GetMapping("/getAccounts")
    public List<Compte> findAll() {
        return compteRepository.findAll();
    }

    @DeleteMapping("/deleteAccount/{id}")
    public void delete(@PathVariable(required = true)  String id){
        Compte c = compteRepository.findById(Integer.parseInt(id));
        compteRepository.delete(c);
    }
}
