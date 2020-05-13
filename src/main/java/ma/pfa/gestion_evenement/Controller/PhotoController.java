package ma.pfa.gestion_evenement.Controller;

import ma.pfa.gestion_evenement.Repository.PhotoRepository;
import ma.pfa.gestion_evenement.entity.Photos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("Photos")
public class PhotoController {

    @Autowired
    private PhotoRepository photoRepository;

    @PostMapping("/save")
    public void save(@RequestBody Photos photos){
        photoRepository.save(photos);
    }

    @GetMapping("/get")
    public List<Photos> findAll() {
        return photoRepository.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        photoRepository.deleteById(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody Photos photos){
        photoRepository.save(photos);
    }

}
