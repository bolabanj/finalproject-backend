package Final_Project.Final_Project.repository;


import Final_Project.Final_Project.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer>{
    Customer findByUsername(String username);
    List<Customer> findAll();
}
