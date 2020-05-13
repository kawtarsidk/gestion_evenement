package ma.pfa.gestion_evenement.Controller;

import ma.pfa.gestion_evenement.Repository.OrganisateurRepository;
import ma.pfa.gestion_evenement.entity.Organisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("organisateur")
public class OrganisateurController {
    @Autowired
    private OrganisateurRepository organisateurRepository;


    @PostMapping("/save")
    public void save(@RequestBody Organisateur organisateur){
        organisateurRepository.save(organisateur);
    }

    @GetMapping("/get")
    public List<Organisateur> findAll() {
        return organisateurRepository.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id")  Long id){
        organisateurRepository.deleteById(id);

    }

    @PutMapping("/update")
    public void update(@RequestBody Organisateur organisateur){
        organisateurRepository.save(organisateur);
    }
}

