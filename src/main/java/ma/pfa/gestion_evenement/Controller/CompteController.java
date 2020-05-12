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
    public boolean delete(@PathVariable int id){
        compteRepository.deleteById(id);
        return true;
    }

    @PutMapping("/update")
    public void update(@RequestBody Compte compte){
        compteRepository.save(compte);
    }
}
