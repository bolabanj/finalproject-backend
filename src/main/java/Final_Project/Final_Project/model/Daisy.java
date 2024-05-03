package Final_Project.Final_Project.model;

import jakarta.persistence.Entity;

@Entity
public class Daisy extends Flower{
    public Daisy(int id, int price, String description){
        super( id, Type.DAISIES, Occasion.BIRTHDAY, Color.YELLOW, price, description);
    }

    public Daisy() {

    }
}
