package Final_Project.Final_Project.model;

import jakarta.persistence.Entity;

@Entity
public class Mixed extends Flower{
    public Mixed(int id, Occasion occasion, Color color, int price, String description){
        super(id, Type.MIXED, occasion, color,price, description);
    }

    public Mixed() {

    }
}
