package com.micaela.ordermanagementapi.controller;
import com.micaela.ordermanagementapi.model.Order;
import com.micaela.ordermanagementapi.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

@Autowired
private OrderService orderService;

@GetMapping
public List<Order> findAll(){return orderService.findAll();
}
@GetMapping("{/id}")
public Order findById(@PathVariable Long id){return orderService.findById(id);}

@PostMapping
public Order save(@RequestBody Order order){
    return  orderService.save(order);
}

@DeleteMapping("{/id}")
public void delete(@PathVariable Long id){
    orderService.delete(id);
}
}

