package com.example.demo.controller;

import com.example.demo.model.Orders;
import com.example.demo.serviceInterface.OrdersService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
* Generated by Springboot-3layer-Generator at Dec 25, 2020, 8:12:32 PM
*/
@RestController
@RequestMapping("/orders/")
public class OrdersController implements CrudController<Orders,java.lang.Integer>{

    @Autowired
    private OrdersService service;

    @Override
    public ResponseEntity<Orders> create(@RequestBody Orders entity) {
        return ResponseEntity.ok(service.create(entity));
    }

    @Override
    public ResponseEntity<Orders> update(@RequestBody Orders entity) {
        return ResponseEntity.ok(service.update(entity));
    }

    @Override
    public ResponseEntity<Page<Orders>> read(
            @RequestBody Orders entity,
            @RequestParam("page") Integer page,
            @RequestParam("size") Integer size) {
        Pageable pageable = PageRequest.of(page,size);
        return ResponseEntity.ok(service.read(entity,pageable));
    }

    @Override
    public ResponseEntity<Orders> readOne(@PathVariable("id") java.lang.Integer primaryKey) {
        return ResponseEntity.ok(service.readOne(primaryKey));
    }

    @Override
    public void delete(java.lang.Integer primaryKey) {
        service.delete(primaryKey);
    }
}