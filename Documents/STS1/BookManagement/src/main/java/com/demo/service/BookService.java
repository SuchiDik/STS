package com.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.entity.Book;

@Service
public interface BookService {
	
	public abstract List<Book> getAllBooks();

	public abstract Book savebook(Book book);

}
