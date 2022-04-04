package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.entity.Book;
import com.example.repository.BookRepository;


public class BookService {

	@Autowired
    private BookRepository bookrepo;
        
   
    public Iterable<Book> findAllBooks() {
       return bookrepo.findAll();
    }

  
    public Optional<Book> findBookById(long id) {
       return bookrepo.findById(id);
    }

   
    public Book saveBook(Book book) {
		return bookrepo.save(book);
        
    }
}


