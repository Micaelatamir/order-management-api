package com.micaela.ordermanagementapi.controller;
import com.micaela.ordermanagementapi.dto.request.OrderItemRequestDTO;
import com.micaela.ordermanagementapi.dto.response.OrderItemResponseDTO;
import com.micaela.ordermanagementapi.dto.response.ProductResponseDTO;
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
public List<OrderItemResponseDTO> findAll() {
    return orderItemService.findAll()
       .stream()
       .map(OrderItemResponseDTO::new)
       .toList();
     }

@GetMapping("/{id}")
public OrderItemResponseDTO findById(@PathVariable Long id) {
    return new OrderItemResponseDTO(orderItemService.findById(id));
    }

@PostMapping
public OrderItemResponseDTO save(@RequestBody OrderItemRequestDTO dto) {
     OrderItem orderItem = new OrderItem();
     orderItem.setQuantity(dto.getQuantity());
     orderItem.setTotal(dto.getTotal());
      return new OrderItemResponseDTO(orderItemService.save(orderItem));
}

@DeleteMapping("/{id}")
public void delete(@PathVariable Long id){
    orderItemService.delete(id);
}

}
