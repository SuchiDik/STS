package com.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Book {
	@Column
	String bookname;
	@Column
	String title;
	@Column
	String author;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(String bookname, String title, String author) {
		super();
		this.bookname = bookname;
		this.title = title;
		this.author = author;
	}
	
	
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [bookname=" + bookname + ", title=" + title + ", author=" + author + "]";
	}
	
	

}
