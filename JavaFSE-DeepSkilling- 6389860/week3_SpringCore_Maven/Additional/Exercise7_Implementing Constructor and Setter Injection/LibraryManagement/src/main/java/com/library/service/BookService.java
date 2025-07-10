package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
	
	private BookRepository bookRepository;
	
	public BookService(BookRepository bookRepository) {
		super();
		System.out.println("constructor injection...");
		this.bookRepository = bookRepository;
	}
	
	public BookService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setBookRepository(BookRepository bookRepository) {
		System.out.println("setter injection...");
		this.bookRepository = bookRepository;
	}
	
	public BookRepository getBookRepository() {
		return bookRepository;
	}


	@Override
	public String toString() {
		return "BookService [bookrepo=" + bookRepository + "]";
	}
}
