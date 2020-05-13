package ma.pfa.gestion_evenement.Controller;

import ma.pfa.gestion_evenement.Repository.SalleRepository;
import ma.pfa.gestion_evenement.entity.Salle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("salles")
public class SalleController {

    @Autowired
    private SalleRepository salleRepository;

    @PostMapping("/saveSalle")
    public void save(@RequestBody Salle salle){
        salleRepository.save(salle);
    }

    @GetMapping("/getsalles")
    public List<Salle> findAll() {
        return salleRepository.findAll();
    }

    @DeleteMapping("/deleteSalle/{id}")
    public void delete(@PathVariable Long id){
        salleRepository.deleteById(id);
    }

    @PutMapping("/updateSalle")
    public void update(@RequestBody Salle salle){
        salleRepository.save(salle);
    }
}
