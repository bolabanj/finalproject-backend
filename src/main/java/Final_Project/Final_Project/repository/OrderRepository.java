package Final_Project.Final_Project.repository;

import Final_Project.Final_Project.model.Order;
import jakarta.persistence.Entity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends CrudRepository<Order, String> {
    Order findByEmail(String email);

}
