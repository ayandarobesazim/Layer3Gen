package com.example.demo.repository;

import com.example.demo.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
* Generated by Springboot-3layer-Generator at Jan 23, 2023, 12:20:38 PM
*/
@Repository
public interface BookRepository extends JpaRepository<Book, java.lang.Integer> {

}