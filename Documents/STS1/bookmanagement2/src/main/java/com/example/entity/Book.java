package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book1")
public class Book {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private long id;
	    @Column
	    private String name;
		public Book() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Book(long id, String name) {
			super();
			this.id = id;
			this.name = name;
		}
		public Book(String name) {
			super();
			this.name = name;
		}
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		@Override
		public String toString() {
			return "Book [id=" + id + ", name=" + name + "]";
		}

	  
	}

