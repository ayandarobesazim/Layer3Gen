package com.example.demo.serviceInterface.mapper;

import com.example.demo.model.Personphone;
import com.example.demo.controller.dto.PersonphoneDTO;
import org.mapstruct.Mapper;

/**
* Generated by Springboot-3layer-Generator at Dec 25, 2020, 8:12:32 PM
*/
@Mapper(componentModel = "spring")
public interface PersonphoneMapper {

    Personphone toEntity(PersonphoneDTO dto);

    PersonphoneDTO toDto(Personphone entity);

}