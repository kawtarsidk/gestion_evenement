package ma.pfa.gestion_evenement.Controller;

import ma.pfa.gestion_evenement.Repository.PersonneRepository;
import ma.pfa.gestion_evenement.Repository.TypeRepository;
import ma.pfa.gestion_evenement.entity.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Types")
public class TypeController {
    @Autowired
    private TypeRepository typeRepository;

    @PostMapping("/saveEvent")
    public void save(@RequestBody Type type){
        typeRepository.save(type);
    }

    @GetMapping("/getEvents")
    public List<Type> findAll() {
        return typeRepository.findAll();
    }

    @DeleteMapping("/deleteEvent/{id}")
    public void delete(@PathVariable Long id){
        typeRepository.deleteById(id);
    }

    @PutMapping("/updateEvent")
    public void update(@RequestBody Type type){
        typeRepository.save(type);
    }
}
