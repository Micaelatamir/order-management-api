package com.micaela.ordermanagementapi.repository;
import com.micaela.ordermanagementapi.model.OrderItem;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}