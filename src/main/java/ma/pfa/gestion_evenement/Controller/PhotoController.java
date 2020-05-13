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

    @PostMapping("/saveEvent")
    public void save(@RequestBody Photos photos){
        photoRepository.save(photos);
    }

    @GetMapping("/getEvents")
    public List<Photos> findAll() {
        return photoRepository.findAll();
    }

    @DeleteMapping("/deleteEvent/{id}")
    public void delete(@PathVariable Long id){
        photoRepository.deleteById(id);
    }

    @PutMapping("/updateEvent")
    public void update(@RequestBody Photos photos){
        photoRepository.save(photos);
    }

}
