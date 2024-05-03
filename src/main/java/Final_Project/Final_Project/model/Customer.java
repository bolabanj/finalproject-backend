package Final_Project.Final_Project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(schema = "finalproject" , name = "customer" )
public class Customer {

    private  String password;


    @Id
    private  String username;
    public Customer(){}
    public Customer(String username, String password){

        this.username = username;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String email) {
        this.username = email;
    }
}
