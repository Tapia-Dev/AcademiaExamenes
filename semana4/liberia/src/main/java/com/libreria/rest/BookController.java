package com.libreria.rest;


import com.libreria.entity.Book;
import com.libreria.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BookController {


    private BookService bookService;


    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    // http://localhost:8080/api/books
    @GetMapping("/books")
    public List<Book> findAll(){
        return bookService.findAll();
    }


    // http://localhost:8080/api/books/4
    @GetMapping("/books/{id}")
    public Book getLibro(@PathVariable int id){
        Book book = bookService.findById(id);
        if(book == null){
            throw  new RuntimeException("No se encontro" + id);
        }
        return book;
    }

    // http://localhost:8080/api/add
    @PostMapping("/add")
    public Book addBook(@RequestBody Book book){
        book.setId(0);
        Book bookNuevo = bookService.save(book);
        return bookNuevo;
    }


    // http://localhost:8080/api/update
    @PutMapping("/update")
    public Book updateBook(@RequestBody Book book){
        Book bookAct = bookService.save(book);
        return bookAct;
    }


    // http://localhost:8080/api/delete/6
    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable int id){

        Book book = bookService.findById(id);
        if(book == null){
            throw  new RuntimeException("Not found "  + id);
        }
        bookService.deleteById(id);
        return "Delete sucessfull " + id;
    }



}
