package com.bookstore.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "books")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Book {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "name", nullable = false, columnDefinition = "text")
    private String name;

    @Column(name = "author", nullable = false, columnDefinition = "text")
    private String author;

    @Column(name = "pages", nullable = false)
    private Integer pages;
}