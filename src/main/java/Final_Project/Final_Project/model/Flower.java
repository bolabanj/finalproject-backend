package Final_Project.Final_Project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema ="finalproject", name = "flower")
public class Flower {
    @Id
    private int id;
    private Type type;
    private Occasion occasion;
    int price;
    private String description;
    private Color color;
    public Flower(){
    }
    public Flower(int id, Type type, Occasion occasion, Color color, int price, String description){
        this.id = id;
        this.type = type;
        this.occasion = occasion;
        this.color = color;
        this.price = price;
        this.description = description;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Occasion getOccasion() {
        return occasion;
    }

    public void setOccasion(Occasion occasion) {
        this.occasion = occasion;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
