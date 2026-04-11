package com.micaela.ordermanagementapi.service;

import com.micaela.ordermanagementapi.exception.ResourceNotFoundException;
import com.micaela.ordermanagementapi.model.Order;
import com.micaela.ordermanagementapi.model.OrderItem;
import com.micaela.ordermanagementapi.model.Product;
import com.micaela.ordermanagementapi.repository.OrderItemRepository;
import com.micaela.ordermanagementapi.repository.OrderRepository;
import com.micaela.ordermanagementapi.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrderItemService {

    @Autowired
    private OrderItemRepository orderItemRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private ProductRepository productRepository;

    public List<OrderItem> findAll() {
        return orderItemRepository.findAll();
    }

    public OrderItem findById(Long id) {
        return orderItemRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Item não encontrado!"));
    }

    public Order findOrderById(Long id) {
        return orderRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Pedido não encontrado!"));
    }

    public Product findProductById(Long id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Produto não encontrado!"));
    }

    public OrderItem save(OrderItem orderItem) {
        return orderItemRepository.save(orderItem);
    }

    public void delete(Long id) {
        orderItemRepository.deleteById(id);
    }
}