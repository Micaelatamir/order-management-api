package com.micaela.ordermanagementapi.controller;
import com.micaela.ordermanagementapi.model.User;
import com.micaela.ordermanagementapi.dto.request.OrderRequestDTO;
import com.micaela.ordermanagementapi.dto.response.OrderResponseDTO;
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
public List<OrderResponseDTO> findAll() {
    return orderService.findAll()
       .stream()
       .map(OrderResponseDTO::new)
       .toList();
    }
@GetMapping("/{id}")
    public OrderResponseDTO findById(@PathVariable Long id) {
     return new OrderResponseDTO(orderService.findById(id));
}

@PostMapping
public OrderResponseDTO save(@RequestBody OrderRequestDTO dto) {
    User user = orderService.findUserById(dto.getUserId());
    Order order = new Order(user, dto.getTotal());
    return new OrderResponseDTO(orderService.save(order));

}

@DeleteMapping("/{id}")
public void delete(@PathVariable Long id){
    orderService.delete(id);
}
}

