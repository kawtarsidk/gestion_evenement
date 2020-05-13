package ma.pfa.gestion_evenement.Controller;

import ma.pfa.gestion_evenement.Repository.DirecteurRepository;
import ma.pfa.gestion_evenement.entity.Compte;
import ma.pfa.gestion_evenement.entity.Directeur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("directeurs")
public class DirecteurController {

        @Autowired
        private DirecteurRepository directeurRepository;


        @PostMapping("/saveAccount")
        public void save(@RequestBody Directeur directeur){
            directeurRepository.save(directeur);
        }

        @GetMapping("/getAccounts")
        public List<Directeur> findAll() {
            return directeurRepository.findAll();
        }

        @DeleteMapping("/deleteAccount/{id}")
        public void delete(@PathVariable("id") Long id){
            directeurRepository.deleteById(id);

        }

        @PutMapping("/update")
        public void update(@RequestBody Directeur directeur){
            directeurRepository.save(directeur);
        }
    }

