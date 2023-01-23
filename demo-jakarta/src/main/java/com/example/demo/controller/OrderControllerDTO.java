package com.example.demo.controller;

import com.example.demo.model.Order;
import com.example.demo.controller.dto.OrderDTO;
import com.example.demo.service.OrderService;
import com.example.demo.service.mapper.OrderMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
* Generated by Springboot-3layer-Generator at Jan 23, 2023, 12:19:32 PM
*/
@RestController
@RequestMapping("/order-dto/")
public class OrderControllerDTO implements CrudController<OrderDTO,java.lang.Integer>{

    @Autowired
    private OrderService service;

    @Autowired
    private OrderMapper mapper;

    @Override
    public ResponseEntity<OrderDTO> create(@RequestBody OrderDTO dto) {
       Order entity = mapper.toEntity(dto);
       entity = service.create(entity);
       return ResponseEntity.ok(mapper.toDto(entity));
    }

    @Override
    public ResponseEntity<OrderDTO> update(@RequestBody OrderDTO dto) {
      Order entity = mapper.toEntity(dto);
       entity = service.update(entity);
       return ResponseEntity.ok(mapper.toDto(entity));
    }

    @Override
    public ResponseEntity<Page<OrderDTO>> read(
            @RequestBody OrderDTO dto,
            @RequestParam("page") Integer page,
            @RequestParam("size") Integer size) {
        Pageable pageable = PageRequest.of(page,size);
        Order entity = mapper.toEntity(dto);
        Page<OrderDTO> pages = service.read(entity, pageable).map(mapper::toDto);
        return ResponseEntity.ok(pages);
    }

    @Override
    public ResponseEntity<OrderDTO> readOne(@PathVariable("id") java.lang.Integer primaryKey) {
         Order entity = service.readOne(primaryKey);
         return ResponseEntity.ok(mapper.toDto(entity));
    }

    @Override
    public void delete(java.lang.Integer primaryKey) {
        service.delete(primaryKey);
    }
}