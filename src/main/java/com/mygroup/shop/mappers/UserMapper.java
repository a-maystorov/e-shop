package com.mygroup.shop.mappers;

import com.mygroup.shop.dtos.RegisterUserRequest;
import com.mygroup.shop.dtos.UpdateUserRequest;
import com.mygroup.shop.dtos.UserDto;
import com.mygroup.shop.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto(User user);

    User toEntity(RegisterUserRequest request);

    void update(UpdateUserRequest request, @MappingTarget User user);
}
