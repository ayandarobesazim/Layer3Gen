package com.autogen.example.service.mapper;

import com.autogen.example.model.Carts;
import com.autogen.example.controller.dto.CartsDTO;
import org.mapstruct.Mapper;

/**
* Generated by Springboot-3layer-Generator at 27 ott 2020, 19:52:19
*/
@Mapper(componentModel = "spring")
public interface CartsMapper {

    Carts toEntity(CartsDTO dto);

    CartsDTO toDto(Carts entity);

}