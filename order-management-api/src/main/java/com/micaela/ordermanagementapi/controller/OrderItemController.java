package com.micaela.ordermanagementapi.controller;
import com.micaela.ordermanagementapi.model.OrderItem;
import com.micaela.ordermanagementapi.service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/order-items")
public class OrderItemController {

@Autowired
private OrderItemService orderItemService;

@GetMapping
public List<OrderItem>findAll(){return orderItemService.findAll();}

@GetMapping("/{id}")
public OrderItem findById(@PathVariable Long id){
    return orderItemService.findById(id);
}

@PostMapping
public OrderItem save(@RequestBody OrderItem orderItem){
    return  orderItemService.save(orderItem);
}



@DeleteMapping("/{id}")
public void delete(@PathVariable Long id){
    orderItemService.delete(id);
}

}
