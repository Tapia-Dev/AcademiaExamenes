package com.libreria.dao;


import com.libreria.entity.Book;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDaoImp implements BookDAO {


    private EntityManager entityManager;


    @Autowired
    public BookDaoImp(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }

    @Override
    public List<Book> findAll() {
        TypedQuery<Book> theQuery = entityManager.createQuery("from Book", Book.class);
        List<Book> books = theQuery.getResultList();
        return books;
    }

    @Override
    public Book findById(int id) {
        Book book = entityManager.find(Book.class, id);
        return book;
    }

    @Override
    public Book save(Book book) {
        Book lubroNuevo = entityManager.merge(book);
        return lubroNuevo;
    }

    @Override
    public void deleteById(int id) {
        Book book = entityManager.find(Book.class, id);
        entityManager.remove(book);

    }
}
