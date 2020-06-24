package ma.pfa.gestion_evenement.Controller;


import ma.pfa.gestion_evenement.Repository.CompteRepository;
import ma.pfa.gestion_evenement.entity.Compte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("comptes")
public class CompteController{
    @Autowired
private CompteRepository compteRepository;


@PostMapping("/save")
public void save(@RequestBody Compte compte){
        compteRepository.save(compte);
        }

@GetMapping("/get")
public List<Compte> findAll() {
        return compteRepository.findAll();
        }

@DeleteMapping("/delete/{id}")
public void delete(@PathVariable("id") Long id){
        compteRepository.deleteById(id);

        }

@PutMapping("/update")
public void update(@RequestBody Compte compte){
        compteRepository.save(compte);
        }
        }
