package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Book;
import com.demo.repository.BookReporsitory;
@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookReporsitory bookrepo;
	
	
//	
//	public BookServiceImpl(BookReporsitory bookrepo) {
//		super();
//		this.bookrepo = bookrepo;
//	}

	@Override
	public List<Book> getAllBooks() {
		return bookrepo.findAll();
		
	}
	
	public Book savebook(Book book)
	{
		return bookrepo.save(book);
	}

}
