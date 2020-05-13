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

        @PostMapping("/saveEquip")
        public void save(@RequestBody Equipement equipement){
            equipementRepository.save(equipement);
        }

        @GetMapping("/getEquip")
        public List<Equipement> findAll() {
            return equipementRepository.findAll();
        }

        @DeleteMapping("/deleteEquip/{id}")
        public void delete(@PathVariable Long id){
        equipementRepository.deleteById(id);

    }

        @PutMapping("/updateEquip")
        public void update(@RequestBody Equipement equipement){
        equipementRepository.save(equipement);
    }
}
