package com.autogen.example.controller;

import com.autogen.example.controller.dto.PersonphoneDTO;
import com.autogen.example.model.Personphone;
import com.autogen.example.service.PersonphoneService;
import com.autogen.example.service.mapper.PersonphoneMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
* Generated by Springboot-3layer-Generator at 27 ott 2020, 19:52:19
*/
@RestController
@RequestMapping("/personphone-dto/")
public class PersonphoneControllerDTO implements CrudController<PersonphoneDTO,java.lang.Integer>{

    @Autowired
    private PersonphoneService service;

    @Autowired
    private PersonphoneMapper mapper;

    @Override
    public ResponseEntity<PersonphoneDTO> create(@RequestBody PersonphoneDTO dto) {
       Personphone entity = mapper.toEntity(dto);
       entity = service.create(entity);
       return ResponseEntity.ok(mapper.toDto(entity));
    }

    @Override
    public ResponseEntity<PersonphoneDTO> update(@RequestBody PersonphoneDTO dto) {
      Personphone entity = mapper.toEntity(dto);
       entity = service.update(entity);
       return ResponseEntity.ok(mapper.toDto(entity));
    }

    @Override
    public ResponseEntity<Page<PersonphoneDTO>> read(
            @RequestBody PersonphoneDTO dto,
            @RequestParam("page") Integer page,
            @RequestParam("size") Integer size) {
        Pageable pageable = PageRequest.of(page,size);
        Personphone entity = mapper.toEntity(dto);
        Page<PersonphoneDTO> pages = service.read(entity, pageable).map(mapper::toDto);
        return ResponseEntity.ok(pages);
    }

    @Override
    public ResponseEntity<PersonphoneDTO> readOne(@PathVariable("id") java.lang.Integer primaryKey) {
         Personphone entity = service.readOne(primaryKey);
         return ResponseEntity.ok(mapper.toDto(entity));
    }

    @Override
    public void delete(java.lang.Integer primaryKey) {
        service.delete(primaryKey);
    }
}