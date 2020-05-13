package ma.pfa.gestion_evenement.Controller;

import ma.pfa.gestion_evenement.Repository.EtatRepository;
import ma.pfa.gestion_evenement.entity.Administrateur;
import ma.pfa.gestion_evenement.entity.Etat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Etat")
public class EtatController {
    @Autowired
    private EtatRepository etatRepository;


    @PostMapping("/save")
    public void save(@RequestBody Etat etat){
        etatRepository.save(etat);
    }

    @GetMapping("/get")
    public List<Etat> findAll() {
        return etatRepository.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id")  Long id){
        etatRepository.deleteById(id);

    }

    @PutMapping("/update")
    public void update(@RequestBody Etat etat){
        etatRepository.save(etat);
    }
}

