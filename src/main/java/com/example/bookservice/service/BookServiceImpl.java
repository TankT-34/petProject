package com.example.bookservice.service;

import com.example.bookservice.entity.Book;
import com.example.bookservice.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.bookservice.service.BookService;

import java.util.Optional;

@Service // Аннотация отмечает класс как сервисный компонент Spring
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Autowired // Внедрение зависимости BookRepository через конструктор
    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Optional<Book> findById(Integer id) {
        // Используем стандартный метод репозитория
        return bookRepository.findById(id);
    }
}