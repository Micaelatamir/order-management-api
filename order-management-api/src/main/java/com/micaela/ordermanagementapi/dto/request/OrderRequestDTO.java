package com.micaela.ordermanagementapi.dto.request;

import java.math.BigDecimal;

public class OrderRequestDTO {
    private Long userId;
    private BigDecimal total;

    public OrderRequestDTO(){}

    public Long getUserId() {return userId;}

    public void setUserId(Long userId) {this.userId = userId;}

    public BigDecimal getTotal() {return total;}

    public void setTotal(BigDecimal price) {this.total = price;}
}
