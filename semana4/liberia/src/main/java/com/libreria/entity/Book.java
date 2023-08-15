package com.libreria.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_book")
    private int id;

    @Column(name="title")
    private String title;

    @Column(name="autor")
    private String autor;

    @Column(name="year")
    private int year;

    @Column(name="price")
    private Double price;


    public Book() {
    }

    public Book(int id, String title, String autor, int year, Double price) {
        this.id = id;
        this.title = title;
        this.autor = autor;
        this.year = year;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrece(Double precio) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", autor='" + autor + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
