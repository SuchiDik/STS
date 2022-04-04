package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Book;
import com.example.repository.BookRepository;
import com.example.service.BookService;

@RestController
public class BookController {
	
	@Autowired
	BookService bservice;
	
	@GetMapping("/get")
	public Iterable<Book> findAllBooks() {
	    return bservice.findAllBooks();
	}
	
	
	
	@GetMapping("/new")
    public String addBooksShowPage(Model model)
    {
        model.addAttribute("book",new Book());
        return "new";
    }

    @PostMapping("/new")
    public String addBooks(Book book)
    {

        bservice.saveBook(book.getName());
        //bookRepository.save(book);
        return "redirect:show-listof-all-books";
    }
}
