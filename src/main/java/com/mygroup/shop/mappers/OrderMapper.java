package com.mygroup.shop.mappers;

import com.mygroup.shop.dtos.OrderDto;
import com.mygroup.shop.entities.Order;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderMapper {
    OrderDto toDto(Order order);
}
