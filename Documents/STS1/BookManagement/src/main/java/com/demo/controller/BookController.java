package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.demo.entity.Book;
import com.demo.service.BookService;

@Controller
public class BookController {
	
	@Autowired
	private BookService bookservice;

	
	@GetMapping("/book")
	public String listbook(Model model)
	{
		model.addAttribute("book", bookservice.getAllBooks());
		return "books";
	}
//@GetMapping("book/new")
//	public String Addbook(Model mode)
//	{
//		Book book=new Book();
//		mode.addAttribute("book",book);
//		return "bookadded";
//	}
	
//@PostMapping("/book")
//public String savebook(@ModelAttribute("book") Book book)
//{
//	 bookservice.savebook(book);
//	 return "redirect:book";
//  	
//}
//	


}