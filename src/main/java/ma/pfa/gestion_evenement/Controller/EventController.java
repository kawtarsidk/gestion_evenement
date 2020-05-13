package ma.pfa.gestion_evenement.Controller;

import ma.pfa.gestion_evenement.Repository.EventRepository;
import ma.pfa.gestion_evenement.entity.Evenement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("events")
public class EventController {
        @Autowired
        private EventRepository eventRepository;

        @PostMapping("/saveEvent")
        public void save(@RequestBody Evenement evenement){
            eventRepository.save(evenement);
        }

        @GetMapping("/getEvents")
        public List<Evenement> findAll() {
            return eventRepository.findAll();
        }

        @DeleteMapping("/deleteEvent/{id}")
        public void delete(@PathVariable Long id){
            eventRepository.deleteById(id);
        }

        @PutMapping("/updateEvent")
        public void update(@RequestBody Evenement evenement){
            eventRepository.save(evenement);
        }

    }
