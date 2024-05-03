package Final_Project.Final_Project.service;

import Final_Project.Final_Project.model.*;
import Final_Project.Final_Project.repository.FlowerRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlowerInitializationService {
    @Autowired
    private FlowerRepository flowerRepository;

    @PostConstruct
    public void init(){
        Flower tulip1 = new Tulip(1, 54, "CHERRY LOVE");
        Flower rose2  = new Rose(2, 45, " LOVE BLOSSOM");
        Flower daisy3 = new Daisy(3, 34, "SUNSHINE");
        Flower daisy4 = new Daisy(4, 34, "GARDEN PARTY");
        Flower mixed5 = new Mixed(5,Occasion.BIRTHDAY, Color.ORANGE ,50, "ORANGE DELIGHT");
        Flower tulip6 = new Tulip(6, 54, "NATURE'S BEAUTY");
        Flower mixed7 = new Mixed(7,Occasion.THANKYOU, Color.MIXED ,50, "MELLOW YELLOW");
        Flower mixed8 = new Mixed(8,Occasion.MOTHERSDAY, Color.YELLOW ,50, "YELLOW SUNSHINE");
        Flower mixed9 = new Mixed(9,Occasion.BIRTHDAY, Color.RED ,50, "HAPPETITE");
        Flower rose10 = new Rose(10, 45, "SWEETHEART");
        Flower lily11 = new Lily(11, 60, "WHITE BEAUTY");
        Flower lily12 = new Lily(12, 60, "ARIZONA SUNSET");
        Flower rose13 = new Rose(13, Occasion.BIRTHDAY, Color.GREEN,  45, " GREEN ENVY");
        Flower mixed14 = new Mixed(14,Occasion.MOTHERSDAY, Color.GREEN ,50, "GREEN GARDEN");
        Flower mixed15 = new Mixed(15,Occasion.BIRTHDAY, Color.WHITE ,50, "FLAME");
        Flower rose16 = new Tulip(16, 45, "PINK PEARL");
        Flower rose17 = new Rose(17,Occasion.THANKYOU, Color.ORANGE,  45, "AUTUMN ");
        flowerRepository.save(tulip1);
        flowerRepository.save(rose2);
        flowerRepository.save(daisy3);
        flowerRepository.save(daisy4);
        flowerRepository.save(mixed5);
        flowerRepository.save(tulip6);
        flowerRepository.save(mixed7);
        flowerRepository.save(mixed8);
        flowerRepository.save(mixed9);
        flowerRepository.save(rose10);
        flowerRepository.save(lily11);
        flowerRepository.save(lily12);
        flowerRepository.save(rose13);
        flowerRepository.save(mixed14);
        flowerRepository.save(mixed15);
        flowerRepository.save(rose16);
        flowerRepository.save(rose17);






    }
}
