package com.bookstore.service;

import com.bookstore.model.Book;

public interface BookService {
    Book getBookById(Long id);  // Переименовали findById → getBookById
}