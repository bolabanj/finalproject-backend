package Final_Project.Final_Project.model;

import jakarta.persistence.Entity;

@Entity
public class Rose extends Flower{
    public Rose(int id, int price, String description){
        super(id,Type.ROSES, Occasion.MOTHERSDAY, Color.RED, price, description);
    }
    public Rose(int id,Occasion occasion,  Color color, int price, String description){
        super(id, Type.ROSES, occasion, color, price, description);
    }

    public Rose() {

    }
}
