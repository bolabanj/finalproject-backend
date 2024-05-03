package Final_Project.Final_Project.model;

import jakarta.persistence.Entity;

@Entity
public class Tulip extends Flower{
    public Tulip(int id, int price, String description){
        super(id, Type.TULIPS, Occasion.BIRTHDAY, Color.RED, price, description);
    }

    public Tulip() {

    }
}
