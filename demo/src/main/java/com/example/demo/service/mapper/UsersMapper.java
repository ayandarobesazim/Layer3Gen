package com.example.demo.service.mapper;

import com.example.demo.model.Users;
import com.example.demo.controller.dto.UsersDTO;
import org.mapstruct.Mapper;

/**
* Generated by Springboot-3layer-Generator at Dec 25, 2020, 5:57:46 PM
*/
@Mapper(componentModel = "spring")
public interface UsersMapper {

    Users toEntity(UsersDTO dto);

    UsersDTO toDto(Users entity);

}