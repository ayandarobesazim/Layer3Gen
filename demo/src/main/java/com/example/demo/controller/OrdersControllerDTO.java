package com.example.demo.controller;

import com.example.demo.model.Orders;
import com.example.demo.controller.dto.OrdersDTO;
import com.example.demo.serviceInterface.OrdersService;
import com.example.demo.serviceInterface.mapper.OrdersMapper;

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
@RequestMapping("/orders-dto/")
public class OrdersControllerDTO implements CrudController<OrdersDTO,java.lang.Integer>{

    @Autowired
    private OrdersService service;

    @Autowired
    private OrdersMapper mapper;

    @Override
    public ResponseEntity<OrdersDTO> create(@RequestBody OrdersDTO dto) {
       Orders entity = mapper.toEntity(dto);
       entity = service.create(entity);
       return ResponseEntity.ok(mapper.toDto(entity));
    }

    @Override
    public ResponseEntity<OrdersDTO> update(@RequestBody OrdersDTO dto) {
      Orders entity = mapper.toEntity(dto);
       entity = service.update(entity);
       return ResponseEntity.ok(mapper.toDto(entity));
    }

    @Override
    public ResponseEntity<Page<OrdersDTO>> read(
            @RequestBody OrdersDTO dto,
            @RequestParam("page") Integer page,
            @RequestParam("size") Integer size) {
        Pageable pageable = PageRequest.of(page,size);
        Orders entity = mapper.toEntity(dto);
        Page<OrdersDTO> pages = service.read(entity, pageable).map(mapper::toDto);
        return ResponseEntity.ok(pages);
    }

    @Override
    public ResponseEntity<OrdersDTO> readOne(@PathVariable("id") java.lang.Integer primaryKey) {
         Orders entity = service.readOne(primaryKey);
         return ResponseEntity.ok(mapper.toDto(entity));
    }

    @Override
    public void delete(java.lang.Integer primaryKey) {
        service.delete(primaryKey);
    }
}