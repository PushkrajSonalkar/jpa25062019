package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Book;

public interface BookService 
{  
	public void addBook(Book book);
	
	public Optional<Book> getBook(Integer bookId);
	
	public Book updateBook(Integer BookId,Book book);

	public void deleteBook(Integer bookId);

	public List<Book> getAllBooks();		
}
