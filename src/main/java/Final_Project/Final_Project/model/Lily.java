package Final_Project.Final_Project.model;

import jakarta.persistence.Entity;

@Entity
public class Lily extends Flower{

    public Lily(){

    }
    public Lily(int id, int price, String description){
        super(id, Type.LILIES, Occasion.BIRTHDAY, Color.WHITE, price, description);
    }
}
