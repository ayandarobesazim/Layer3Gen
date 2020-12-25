package com.example.demo.serviceInterface.mapper;

import com.example.demo.model.Books;
import com.example.demo.controller.dto.BooksDTO;
import org.mapstruct.Mapper;

/**
* Generated by Springboot-3layer-Generator at Dec 25, 2020, 8:12:32 PM
*/
@Mapper(componentModel = "spring")
public interface BooksMapper {

    Books toEntity(BooksDTO dto);

    BooksDTO toDto(Books entity);

}