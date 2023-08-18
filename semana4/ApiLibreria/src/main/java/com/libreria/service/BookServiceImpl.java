package com.libreria.service;

import com.libreria.dao.BookDAO;
import com.libreria.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDAO bookDAO;


    @Override
    public List<Book> findAll() {
        return bookDAO.findAll();
    }

    @Override
    public Book findById(int id) {
        return bookDAO.findById(id);
    }


    @Transactional
    @Override
    public Book save(Book book) {
        return bookDAO.save(book);
    }


    @Transactional
    @Override
    public void deleteById(int id) {
        bookDAO.deleteById(id);

    }
}
