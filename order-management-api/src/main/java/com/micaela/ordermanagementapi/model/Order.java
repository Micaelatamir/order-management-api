package com.micaela.ordermanagementapi.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "order")
public class Order {
    @id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable= false, unique= true)
    private int price;

    public Order () {
    }
    public Order (id, name, price){
        this.id = id;
        this.name = name;
        this.price = price ;
    }
    @PrePersist
}

