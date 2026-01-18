package com.example.bookservice.repository;

import com.example.bookservice.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
    // Все основные методы (findById, save, findAll, deleteById) уже есть в JpaRepository,
    // поэтому не нужно писать реализацию. Spring Data JPA создаёт ее сам.
}