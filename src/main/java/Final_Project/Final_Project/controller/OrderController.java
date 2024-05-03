package Final_Project.Final_Project.controller;

import Final_Project.Final_Project.model.Order;
import Final_Project.Final_Project.repository.OrderRepository;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
@RestController
@RequestMapping("/orders")
@CrossOrigin
public class OrderController {
    private final OrderRepository orderRepository;
    public OrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @PostMapping
    public boolean addOrder(@RequestBody Order order) {
        System.out.println(order.getAddress());
        try{
            orderRepository.save(order);
            return true;

        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
    @GetMapping("/{id}")
    public Order getOrder(@PathVariable String id) {
        try{
            return orderRepository.findByEmail(id);
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}
