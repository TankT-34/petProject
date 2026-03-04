package com.bookstore.service;

import com.bookstore.model.Book;
import java.util.List;

public interface BookService {
    Book getBookById(Integer id);
    List<Book> getAllBooks();
}