package com.micaela.ordermanagementapi.model;
import java.util.List;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

   @ManyToOne
   @JoinColumn(name="user_id")
   private User user;

    @Column(nullable = false)
    private BigDecimal total;

    @Column(name = "order_date")
    private LocalDateTime orderDate;

    @OneToMany(mappedBy = "order")
    private List<OrderItem> items;

    public Order () {}

    public Order (User user, BigDecimal total){

        this.user = user;
        this.total = total;

    }

    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    public User  getUser (){return user;}
    public void setUser(User user) {this.user = user;}

    public BigDecimal getTotal() {return total;}
    public void setTotal(BigDecimal total) {this.total = total;}

    public LocalDateTime getOrderDate() { return orderDate; }
    public void setOrderDate(LocalDateTime orderDate) { this.orderDate = orderDate; }

    public List<OrderItem> getItems() { return items; }
    public void setItems(List<OrderItem> items) { this.items = items; }

}
