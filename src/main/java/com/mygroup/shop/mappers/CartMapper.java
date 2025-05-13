package com.mygroup.shop.mappers;

import com.mygroup.shop.dtos.CartDto;
import com.mygroup.shop.dtos.CartItemDto;
import com.mygroup.shop.entities.Cart;
import com.mygroup.shop.entities.CartItem;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CartMapper {
    @Mapping(target = "totalPrice", expression = "java(cart.getTotalPrice())")
    CartDto toDto(Cart cart);

    @Mapping(target = "totalPrice", expression = "java(cartItem.getTotalPrice())")
    CartItemDto toDto(CartItem cartItem);
}
