package com.autogen.example.service;

import com.autogen.example.model.Carts;
import com.autogen.example.repository.CartsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
* Generated by Springboot-3layer-Generator at 27 ott 2020, 19:52:19
*/
@Service
public class CartsService implements CrudService<Carts,java.lang.Integer> {

    @Autowired
    private CartsRepository repository;

    @Override
    public Carts create(Carts entity) {
        return repository.save(entity);
    }

    @Override
    public Carts update(Carts entity) {
        return repository.save(entity);
    }

    @Override
    public Page<Carts> read(Carts entity, Pageable pageable) {
        Example<Carts> example = Example.of(entity);
        return repository.findAll(example,pageable);
    }

    @Override
    public Carts readOne(java.lang.Integer primaryKey) {
        return repository.getOne(primaryKey);
    }

    @Override
    public void delete(java.lang.Integer primaryKey) {
        repository.deleteById(primaryKey);
    }
}