package com.example.demo.service.mapper;

import com.example.demo.model.Book;
import com.example.demo.controller.dto.BookDTO;
import org.mapstruct.Mapper;

/**
* Generated by Springboot-3layer-Generator at Jan 23, 2023, 12:19:32 PM
*/
@Mapper(componentModel = "spring")
public interface BookMapper {

    Book toEntity(BookDTO dto);

    BookDTO toDto(Book entity);

}