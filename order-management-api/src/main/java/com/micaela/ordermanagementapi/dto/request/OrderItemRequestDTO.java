package com.micaela.ordermanagementapi.dto.request;
import java.math.BigDecimal;

public class OrderItemRequestDTO {
    private Long orderId;
    private Long productId;
    private Integer quantity;
    private BigDecimal total;

    public OrderItemRequestDTO(){}

    public Long getOrderId() {return orderId;}

    public void setOrderId(Long orderId) {this.orderId = orderId;}

    public Long getProductId() {return productId;}

    public void setProductId(Long productId) {this.productId = productId;}

    public Integer getQuantity() {return quantity;}

    public void setQuantity(Integer quantity) {this.quantity = quantity;}

    public BigDecimal getTotal() {return total;}

    public void setTotal(BigDecimal total) {this.total = total;}
}
