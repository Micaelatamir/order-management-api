package com.micaela.ordermanagementapi.dto.request;

import java.math.BigDecimal;

public class OrderRequestDTO {
    private Long userId;
    private BigDecimal total;

    public OrderRequestDTO(){}

    public Long getUserId() {return userId;}

    public void setUserId(Long userId) {this.userId = userId;}

    public BigDecimal getPrice() {return total;}

    public void setPrice(BigDecimal price) {this.total = price;}
}
