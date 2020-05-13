package ma.pfa.gestion_evenement.Controller;

import ma.pfa.gestion_evenement.Repository.EquipementRepository;
import ma.pfa.gestion_evenement.entity.Evenement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("equipements")
    public class EquipementController {
        @Autowired
        private EquipementRepository equipementRepository;

        @PostMapping("/saveEquip")

        public void save(@RequestBody Evenement equipement){
            equipementRepository.save(equipement);
        }
        @GetMapping("/getEquip")
        public List<Evenement> findAll() {
            return equipementRepository.findAll();
        }

        @DeleteMapping("/deleteEquip/{id}")
        public boolean delete(@PathVariable Long id){
        equipementRepository.deleteById(id);
        return true;
    }

        @PutMapping("/updateEquip")
        public void update(@RequestBody Evenement equipement){
        equipementRepository.save(equipement);
    }
}
