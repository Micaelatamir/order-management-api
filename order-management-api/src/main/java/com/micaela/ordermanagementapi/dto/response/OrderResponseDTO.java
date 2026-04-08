package com.micaela.ordermanagementapi.dto.response;
import com.micaela.ordermanagementapi.model.Order;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class OrderResponseDTO {

    private Long id;
    private UserResponseDTO user;
    private BigDecimal total;
    private LocalDateTime orderDate;

    public OrderResponseDTO(Order order) {
        this.id = order.getId();
        this.user = new UserResponseDTO(order.getUser());
        this.total = order.getTotal();
        this.orderDate = order.getOrderDate();
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public UserResponseDTO getUser() { return user; }
    public void setUser(UserResponseDTO user) { this.user = user; }

    public BigDecimal getTotal() { return total; }
    public void setTotal(BigDecimal total) { this.total = total; }

    public LocalDateTime getOrderDate() { return orderDate; }
    public void setOrderDate(LocalDateTime orderDate) { this.orderDate = orderDate; }
}