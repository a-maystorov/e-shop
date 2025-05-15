package com.mygroup.shop.dtos;

import java.math.BigDecimal;

public class OrderItemDto {
    private OrderProductDto product;
    private int quantity;
    private BigDecimal totalPrice;
}
