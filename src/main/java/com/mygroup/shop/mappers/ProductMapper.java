package com.mygroup.shop.mappers;

import com.mygroup.shop.dtos.ProductDto;
import com.mygroup.shop.entities.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    @Mapping(source = "category.id", target = "categoryId")
    ProductDto toDto(Product product);
}
