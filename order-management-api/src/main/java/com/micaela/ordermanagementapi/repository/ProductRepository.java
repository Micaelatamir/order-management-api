package com.micaela.ordermanagementapi.repository;
import com.micaela.ordermanagementapi.model.Product;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}