package Final_Project.Final_Project.repository;

import Final_Project.Final_Project.model.Flower;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface FlowerRepository extends CrudRepository<Flower, Integer> {
    List<Flower> findAll();

}
