package com.example.demo.controller;

import java.io.IOException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Book;
import com.example.demo.service.BookService;

@Controller

@RestController
@RequestMapping("/rest")
public class BookController 
{
	public static final Logger logger = LoggerFactory.getLogger(BookController.class);
	
	@Autowired
	private BookService bookService;
	
	@RequestMapping(value="/list_books" , method = RequestMethod.GET)
	public ModelAndView ListBooks(ModelAndView model) throws IOException {
		List<Book> listBooks = bookService.getAllBooks();
		model.addObject("listBooks", listBooks);
		model.setViewName("books");
		
		return model;
	}
	

}
