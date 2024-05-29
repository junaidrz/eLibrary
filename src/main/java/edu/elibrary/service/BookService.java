package edu.elibrary.service;

import edu.elibrary.model.Book;
import edu.elibrary.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service

public class BookService {
    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book save(Book book) {
        return bookRepository.save(book);
    }

    public List<Book> getBooks() {
        return (List<Book>) bookRepository.findAll();
    }

    public Book uploadBook(MultipartFile file , Book book) {
        // logic to save book to the database and upload file to server
        return bookRepository.save(book);
    }
}