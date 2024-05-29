package edu.elibrary.controller;

import edu.elibrary.model.Book;
import edu.elibrary.repository.BookRepository;
import edu.elibrary.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/getBooks")
    public List<Book> getBooks() {
        return bookService.getBooks();
    }

    @PostMapping("/uploadBook")
    public Book uploadBook(@RequestBody MultipartFile file,Book book) {
        book.setFilePath(file.getOriginalFilename());
        // logic to save book to the database and upload file to server
         return bookService.save(book);
    }
}