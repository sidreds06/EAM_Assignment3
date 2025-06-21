package com.library.service;


import com.library.model.Book;
import com.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public Mono<Book> createBook(Book book) {
        return bookRepository.save(book);
    }

    public Flux<Book> getAllBooks() {
        return bookRepository.findAll();
    }
}
