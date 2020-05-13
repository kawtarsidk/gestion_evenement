package ma.pfa.gestion_evenement.Controller;

import ma.pfa.gestion_evenement.Repository.PersonneRepository;

import ma.pfa.gestion_evenement.entity.Personne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Perosnnes")
public class PersonneController {

        @Autowired
        private PersonneRepository personneRepository;

        @PostMapping("/saveEvent")
        public void save(@RequestBody Personne personne){
            personneRepository.save(personne);
        }

        @GetMapping("/getEvents")
        public List<Personne> findAll() {
            return personneRepository.findAll();
        }

        @DeleteMapping("/deleteEvent/{id}")
        public void delete(@PathVariable Long id){
            personneRepository.deleteById(id);
        }

        @PutMapping("/updateEvent")
        public void update(@RequestBody Personne personne){
            personneRepository.save(personne);
        }

    }
