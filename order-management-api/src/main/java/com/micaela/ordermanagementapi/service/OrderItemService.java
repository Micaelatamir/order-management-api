package com.micaela.ordermanagementapi.service;
import com.micaela.ordermanagementapi.model.OrderItem;
import com.micaela.ordermanagementapi.repository.OrderItemRepository;
import com.micaela.ordermanagementapi.repository.OrderRepository;
import com.micaela.ordermanagementapi.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrderItemService{

    @Autowired
    private OrderItemRepository orderItemRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private ProductRepository productRepository;

    //Listar todos os itens
    public List<OrderItem>findAll(){
    return orderItemRepository.findAll();
    }

    //Listar todos os itens pelo id
    public OrderItem findById(Long id){
       return orderItemRepository.findById(id)
           .orElseThrow(() ->new RuntimeException("item não encontrado!"));
    }

    //Salvar item
    public OrderItem save(OrderItem orderItem){
        return orderItemRepository.save(orderItem);
    }
    public void delete(Long id){
        orderItemRepository.deleteById(id);
    }
}