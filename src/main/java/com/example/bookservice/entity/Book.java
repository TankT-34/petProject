package com.example.bookservice.entity;

import jakarta.persistence.*;

@Entity // Класс является сущностью JPA
@Table(name = "listofbooks")
public class Book {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "author", nullable = false)
    private String author;

    @Column(name = "pages", nullable = false)
    private Integer pages;

    // Обязательный конструктор по умолчанию (для Hibernate)
    public Book() {
    }

    // Конструктор для удобства
    public Book(String name, String author, Integer pages) {
        this.name = name;
        this.author = author;
        this.pages = pages;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }
}