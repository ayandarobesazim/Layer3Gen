package com.example.demo.service.impl;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;
import com.example.demo.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
* Generated by Springboot-3layer-Generator at Jan 23, 2023, 12:20:38 PM
*/
@Service
public class BookServiceBean implements BookService {

    @Autowired
    private BookRepository repository;

    @Override
    public Book create(Book entity) {
        return repository.save(entity);
    }

    @Override
    public Book update(Book entity) {
        return repository.save(entity);
    }

    @Override
    public Page<Book> read(Book entity, Pageable pageable) {
        Example<Book> example = Example.of(entity);
        return repository.findAll(example,pageable);
    }

    @Override
    public Book readOne(java.lang.Integer primaryKey) {
        return repository.getOne(primaryKey);
    }

    @Override
    public void delete(java.lang.Integer primaryKey) {
        repository.deleteById(primaryKey);
    }
}