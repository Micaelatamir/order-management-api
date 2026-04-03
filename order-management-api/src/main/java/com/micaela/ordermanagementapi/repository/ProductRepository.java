package com.micaela.ordermanagementapi.repository;
import com.micaela.ordermanagementapi.model.Product;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    Example<? extends Product> id(Long id);
}