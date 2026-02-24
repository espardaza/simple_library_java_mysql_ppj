package com.project.library.service;

import com.project.library.entity.Book;
import com.project.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    // Function to retrieve a list of books
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    // Book saving function
    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }
}
