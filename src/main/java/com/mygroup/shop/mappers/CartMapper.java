package com.mygroup.shop.mappers;

import com.mygroup.shop.dtos.CartDto;
import com.mygroup.shop.entities.Cart;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CartMapper {
    CartDto toDto(Cart cart);
}
