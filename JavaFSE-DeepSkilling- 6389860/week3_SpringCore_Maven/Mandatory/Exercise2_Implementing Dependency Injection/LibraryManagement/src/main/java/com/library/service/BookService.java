package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
	
	private BookRepository bookRepository;

	public void setBookRepository(BookRepository bookRepository) {
		System.out.println("setBookRepository is executed");
		this.bookRepository = bookRepository;
	}



	@Override
	public String toString() {
		return "BookService [bookrepo=" + bookRepository + "]";
	}
}
