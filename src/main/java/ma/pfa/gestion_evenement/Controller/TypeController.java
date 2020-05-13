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

    @PostMapping("/save")
    public void save(@RequestBody Type type){
        typeRepository.save(type);
    }

    @GetMapping("/get")
    public List<Type> findAll() {
        return typeRepository.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        typeRepository.deleteById(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody Type type){
        typeRepository.save(type);
    }
}
