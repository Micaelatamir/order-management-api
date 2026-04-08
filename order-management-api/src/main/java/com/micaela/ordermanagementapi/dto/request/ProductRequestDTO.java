package com.micaela.ordermanagementapi.dto.request;
import java.math.BigDecimal;

public class ProductRequestDTO {
    private String name;
    private BigDecimal price;
    public ProductRequestDTO(){}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public BigDecimal getPrice() {return price;}

    public void setPrice(BigDecimal price) {this.price = price;}
}
