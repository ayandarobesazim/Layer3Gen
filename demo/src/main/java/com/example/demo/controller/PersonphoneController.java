package com.example.demo.controller;

import com.example.demo.model.Personphone;
import com.example.demo.service.PersonphoneService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
* Generated by Springboot-3layer-Generator at 1 nov 2020, 11:10:29
*/
@RestController
@RequestMapping("/personphone/")
public class PersonphoneController implements CrudController<Personphone,java.lang.Integer>{

    @Autowired
    private PersonphoneService service;

    @Override
    public ResponseEntity<Personphone> create(@RequestBody Personphone entity) {
        return ResponseEntity.ok(service.create(entity));
    }

    @Override
    public ResponseEntity<Personphone> update(@RequestBody Personphone entity) {
        return ResponseEntity.ok(service.update(entity));
    }

    @Override
    public ResponseEntity<Page<Personphone>> read(
            @RequestBody Personphone entity,
            @RequestParam("page") Integer page,
            @RequestParam("size") Integer size) {
        Pageable pageable = PageRequest.of(page,size);
        return ResponseEntity.ok(service.read(entity,pageable));
    }

    @Override
    public ResponseEntity<Personphone> readOne(@PathVariable("id") java.lang.Integer primaryKey) {
        return ResponseEntity.ok(service.readOne(primaryKey));
    }

    @Override
    public void delete(java.lang.Integer primaryKey) {
        service.delete(primaryKey);
    }
}