package com.example.demo.service.impl;

import com.example.demo.model.Order;
import com.example.demo.repository.OrderRepository;
import com.example.demo.service.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
* Generated by Springboot-3layer-Generator at Jan 23, 2023, 12:20:38 PM
*/
@Service
public class OrderServiceBean implements OrderService {

    @Autowired
    private OrderRepository repository;

    @Override
    public Order create(Order entity) {
        return repository.save(entity);
    }

    @Override
    public Order update(Order entity) {
        return repository.save(entity);
    }

    @Override
    public Page<Order> read(Order entity, Pageable pageable) {
        Example<Order> example = Example.of(entity);
        return repository.findAll(example,pageable);
    }

    @Override
    public Order readOne(java.lang.Integer primaryKey) {
        return repository.getOne(primaryKey);
    }

    @Override
    public void delete(java.lang.Integer primaryKey) {
        repository.deleteById(primaryKey);
    }
}