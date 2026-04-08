package com.micaela.ordermanagementapi.dto.response;
import com.micaela.ordermanagementapi.model.Order;
import com.micaela.ordermanagementapi.model.OrderItem;

import java.math.BigDecimal;


public class OrderItemResponseDTO {

    private Long id;
    private OrderResponseDTO order;
    private ProductResponseDTO product;
    private Integer quantity;
    private BigDecimal total;

    public OrderItemResponseDTO(OrderItem orderItem){
        this.id = orderItem.getId();
        this.order = new OrderResponseDTO(orderItem.getOrder());
        this.product = new ProductResponseDTO(orderItem.getProduct());
        this.quantity = orderItem.getQuantity();
        this.total = orderItem.getTotal();
    }


    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public OrderResponseDTO getOrder() { return order; }
    public void setOrder(OrderResponseDTO order) { this.order = order; }

    public ProductResponseDTO getProduct() { return product; }
    public void setProduct(ProductResponseDTO product) { this.product = product; }

    public Integer getQuantity() {return quantity;}

    public void setQuantity(Integer quantity) {this.quantity = quantity;}

    public BigDecimal getTotal() {return total;}

    public void setTotal(BigDecimal total) {this.total = total;}
}
