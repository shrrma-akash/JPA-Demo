package com.Myself.jpademo;

import javax.persistence.*;

public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookId;

    private String title;

    private int price;

    @ManyToOne
    @JoinColumn
    Author author;
    public Book(){

    }
    public Book(int bookId, String title, int price) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
    }
}
