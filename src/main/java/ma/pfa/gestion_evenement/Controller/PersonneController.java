package ma.pfa.gestion_evenement.Controller;

import ma.pfa.gestion_evenement.Repository.PersonneRepository;

import ma.pfa.gestion_evenement.entity.Personne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("user")
public class PersonneController {

        @Autowired
        private PersonneRepository personneRepository;

        @PostMapping("/save")
        public void save(@RequestBody Personne personne){
            personneRepository.save(personne);
        }

        @GetMapping("/get")
        public List<Personne> findAll() {
            return personneRepository.findAll();
        }

        @DeleteMapping("/delete/{id}")
        public void delete(@PathVariable Long id){
            personneRepository.deleteById(id);
        }

        @PutMapping("/update")
        public void update(@RequestBody Personne personne){
            personneRepository.save(personne);
        }

    }
