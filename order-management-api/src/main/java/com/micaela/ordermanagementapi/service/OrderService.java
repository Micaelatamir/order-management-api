package com.micaela.ordermanagementapi.service;
import com.micaela.ordermanagementapi.model.Order;
import com.micaela.ordermanagementapi.repository.OrderRepository;
import com.micaela.ordermanagementapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrderService{

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private UserRepository userRepository;

    //Buscar todos ordem
    public List<Order>findAll(){
        return  orderRepository.findAll();
    }
    //Buscar todos os ordem pelo id
    public Order findById(Long id){
        return  orderRepository.findById(id)
           .orElseThrow(() -> new RuntimeException("Ordem não encontrado!"));
    }
    //Salva ordem
    public Order save(Order order){
        return  orderRepository.save(order);
    }
    //Deletar ordem
    public void delete(Long id){
         orderRepository.deleteById(id);
    }

}