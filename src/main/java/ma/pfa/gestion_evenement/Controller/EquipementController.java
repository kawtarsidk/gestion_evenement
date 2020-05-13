package ma.pfa.gestion_evenement.Controller;

import ma.pfa.gestion_evenement.Repository.EquipementRepository;
import ma.pfa.gestion_evenement.entity.Equipement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("equipements")
    public class EquipementController {
        @Autowired
        private EquipementRepository equipementRepository;

        @PostMapping("/save")
        public void save(@RequestBody Equipement equipement){
            equipementRepository.save(equipement);
        }

        @GetMapping("/get")
        public List<Equipement> findAll() {
            return equipementRepository.findAll();
        }

        @DeleteMapping("/delete/{id}")
        public void delete(@PathVariable Long id){
        equipementRepository.deleteById(id);

    }

        @PutMapping("/update")
        public void update(@RequestBody Equipement equipement){
        equipementRepository.save(equipement);
    }
}
