package com.example.BookInventoryManagement.Persistence;

import com.example.BookInventoryManagement.Business.Book;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
    
}
