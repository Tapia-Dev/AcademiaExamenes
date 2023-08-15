package com.libreria.dao;

import com.libreria.entity.Book;

import java.util.List;

public interface BookDAO {

    List<Book> findAll();

    Book findById(int id);

    Book save(Book book);

    void deleteById(int id);
}
