package ma.pfa.gestion_evenement.Controller;

import ma.pfa.gestion_evenement.Repository.AdministrateurRepository;
import ma.pfa.gestion_evenement.Repository.CompteRepository;
import ma.pfa.gestion_evenement.entity.Administrateur;
import ma.pfa.gestion_evenement.entity.Compte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("admin")
public class AdminController {
    @Autowired
    private AdministrateurRepository adminRepository;


    @PostMapping("/save")
    public void save(@RequestBody Administrateur admin){
        adminRepository.save(admin);
    }

    @GetMapping("/get")
    public List<Administrateur> findAll() {
        return adminRepository.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id")  Long id){
        adminRepository.deleteById(id);

    }

    @PutMapping("/update")
    public void update(@RequestBody Administrateur admin){
        adminRepository.save(admin);
    }
}

