package ma.pfa.gestion_evenement.Controller;

import ma.pfa.gestion_evenement.Repository.EventRepository;
import ma.pfa.gestion_evenement.entity.Compte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("events")
public class EventController {
        @Autowired
        private EventRepository eventRepository;

        @PostMapping("/saveEvent")
        public void save(@RequestBody Compte evenement){
            eventRepository.save(evenement);
        }
        @GetMapping("/getEvents")
        public List<Compte> findAll() {
            return eventRepository.findAll();
        }

        @DeleteMapping("/deleteEvent/{id}")
        public boolean delete(@PathVariable int id){
            eventRepository.deleteById(id);
            return true;
        }

        @PutMapping("/updateEvent")
        public void update(@RequestBody Compte evenement){
            eventRepository.save(evenement);
        }

    }
