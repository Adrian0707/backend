package com.muzeaback.back.DTO;


import com.muzeaback.back.Entity.UserEntity;

import org.mapstruct.Mapper;


import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDTO toDto(UserEntity userEntity);
    UserEntity toEntity(UserDTO userDTO);

}
