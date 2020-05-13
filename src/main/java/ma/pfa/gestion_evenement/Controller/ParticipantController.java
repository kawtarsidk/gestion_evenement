package ma.pfa.gestion_evenement.Controller;

import ma.pfa.gestion_evenement.Repository.ParticipantRepository;
import ma.pfa.gestion_evenement.entity.Participant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("participants")
public class ParticipantController {
    @Autowired
    private ParticipantRepository participantRepository;


    @PostMapping("/save")
    public void save(@RequestBody Participant participant){
        participantRepository.save(participant);
    }

    @GetMapping("/get")
    public List<Participant> findAll() {
        return participantRepository.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id")  Long id){
        participantRepository.deleteById(id);

    }

    @PutMapping("/update")
    public void update(@RequestBody Participant participant){
        participantRepository.save(participant);
    }
}

