package com.example.BookInventoryManagement.Presentation;

import com.example.BookInventoryManagement.Business.Book;
import com.example.BookInventoryManagement.Persistence.BookRepository;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api")
public class BookController {
    
    BookRepository bookRepository;

    @PostMapping("/inventories")
    public ResponseEntity<Book> addBook(@RequestBody Book book) {
        Book newBook = bookRepository.save(new Book(book.getInventorycount()));
        return new ResponseEntity<>(bookRepository.save(newBook), HttpStatus.CREATED);
    }

    @PutMapping("/inventories/{id}")
    public void updateBook(@PathVariable int id, @RequestBody Book book) {
        Book newBook = bookRepository.findById(id).
                orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Book not found"));
        newBook.setId(book.getId());
        newBook.setInventorycount(book.getInventorycount());
        bookRepository.save(newBook);
    }

    @DeleteMapping("/inventories/{id}")
    public ResponseEntity<HttpStatus> deleteTutorial(@PathVariable int id) {
        bookRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
