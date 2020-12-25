package com.example.demo.controller;

import com.example.demo.model.Users;
import com.example.demo.controller.dto.UsersDTO;
import com.example.demo.serviceInterface.UsersService;
import com.example.demo.serviceInterface.mapper.UsersMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
* Generated by Springboot-3layer-Generator at Dec 25, 2020, 8:12:32 PM
*/
@RestController
@RequestMapping("/users-dto/")
public class UsersControllerDTO implements CrudController<UsersDTO,java.lang.Integer>{

    @Autowired
    private UsersService service;

    @Autowired
    private UsersMapper mapper;

    @Override
    public ResponseEntity<UsersDTO> create(@RequestBody UsersDTO dto) {
       Users entity = mapper.toEntity(dto);
       entity = service.create(entity);
       return ResponseEntity.ok(mapper.toDto(entity));
    }

    @Override
    public ResponseEntity<UsersDTO> update(@RequestBody UsersDTO dto) {
      Users entity = mapper.toEntity(dto);
       entity = service.update(entity);
       return ResponseEntity.ok(mapper.toDto(entity));
    }

    @Override
    public ResponseEntity<Page<UsersDTO>> read(
            @RequestBody UsersDTO dto,
            @RequestParam("page") Integer page,
            @RequestParam("size") Integer size) {
        Pageable pageable = PageRequest.of(page,size);
        Users entity = mapper.toEntity(dto);
        Page<UsersDTO> pages = service.read(entity, pageable).map(mapper::toDto);
        return ResponseEntity.ok(pages);
    }

    @Override
    public ResponseEntity<UsersDTO> readOne(@PathVariable("id") java.lang.Integer primaryKey) {
         Users entity = service.readOne(primaryKey);
         return ResponseEntity.ok(mapper.toDto(entity));
    }

    @Override
    public void delete(java.lang.Integer primaryKey) {
        service.delete(primaryKey);
    }
}