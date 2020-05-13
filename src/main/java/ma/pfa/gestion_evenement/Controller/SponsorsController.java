package ma.pfa.gestion_evenement.Controller;

import ma.pfa.gestion_evenement.Repository.SponsorsRepository;
import ma.pfa.gestion_evenement.entity.Sponsors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("sponsors")
public class SponsorsController {

    @Autowired
    private SponsorsRepository sponsorsRepository;


    @PostMapping("/save")
    public void save(@RequestBody Sponsors sponsors){
        sponsorsRepository.save(sponsors);
    }

    @GetMapping("/get")
    public List<Sponsors> findAll() {
        return sponsorsRepository.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Long id){
        sponsorsRepository.deleteById(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody Sponsors sponsors){
        sponsorsRepository.save(sponsors);
    }
}
