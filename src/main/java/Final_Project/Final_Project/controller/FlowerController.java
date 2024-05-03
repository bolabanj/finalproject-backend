package Final_Project.Final_Project.controller;

import Final_Project.Final_Project.model.Flower;
import Final_Project.Final_Project.repository.FlowerRepository;
import Final_Project.Final_Project.repository.ImageHelper;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/flowers")
@CrossOrigin
public class FlowerController {
    FlowerRepository flowerRepository;
    public FlowerController(FlowerRepository flowerRepository) {
        this.flowerRepository = flowerRepository;
    }

    @GetMapping
    public List<Flower> getAllFlowers() {
        try{
            return flowerRepository.findAll();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
    @GetMapping("/{id}/image")
    public ResponseEntity<?> getImage(@PathVariable int id ) throws IOException {
        try{
            byte[] image = ImageHelper.getImage(id);
            return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(image);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
