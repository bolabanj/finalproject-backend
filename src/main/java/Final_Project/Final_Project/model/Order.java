package Final_Project.Final_Project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema= "finalproject", name = "orders")
public class Order {

    @Id
    private String email;
    private String date;
    private String address;
    private Integer price;

    public Order() {

    }

    public Order(String deliveryDate, String deliveryAddress, Integer price, String email) {
        this.email = email;
        this.date = deliveryDate;
        this.address = deliveryAddress;
        this.price = price;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
