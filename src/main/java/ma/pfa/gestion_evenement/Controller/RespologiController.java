package ma.pfa.gestion_evenement.Controller;


import ma.pfa.gestion_evenement.Repository.RespoLogistiqueRepository;
import ma.pfa.gestion_evenement.entity.RespoLogistique;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("resplogistique")
public class RespologiController {

    @Autowired
    private RespoLogistiqueRepository RespoLogistiqueRepository;


    @PostMapping("/save")
    public void save(@RequestBody RespoLogistique respoLogistique){
        RespoLogistiqueRepository.save(respoLogistique);
    }

    @GetMapping("/get")
    public List<RespoLogistique> findAll() {
        return RespoLogistiqueRepository.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable("id") Long id){
        RespoLogistiqueRepository.deleteById(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody RespoLogistique respoLogistique){
        RespoLogistiqueRepository.save(respoLogistique);
    }
}
