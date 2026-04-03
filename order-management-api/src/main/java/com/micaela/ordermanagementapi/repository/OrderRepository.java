package com.micaela.ordermanagementapi.repository;
import com.micaela.ordermanagementapi.model.Order;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}