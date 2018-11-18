package com.example.demomssql.controller;

import com.example.demomssql.model.Book;
import com.example.demomssql.repository.BookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@CrossOrigin
public class BookController {

    private static final Logger log = LoggerFactory.getLogger(BookController.class);


    @Autowired
    private BookRepository bookRepository;

    @GetMapping(path = "/getBooks")
    public ResponseEntity<List<Book>> getAllBooks(){
        return ResponseEntity.status(HttpStatus.OK).body(bookRepository.findAll());
    }

    @PostMapping(path = "/saveBook")
    public ResponseEntity<?> saveBook(@RequestBody Book bookJson){
        bookRepository.save(bookJson);
        return ResponseEntity.status(HttpStatus.OK).build();
    }


}
