package com.example.bookservice.service;

import com.example.bookservice.entity.Book;
import java.util.Optional;

public interface BookService {
    Optional<Book> findById(Integer id); // Метод для поиска книги по ID
}