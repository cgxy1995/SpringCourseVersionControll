package com.kamijotouma.spring5webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kamijotouma.spring5webapp.repositories.BookRepository;

@Controller
public class BookController {
	private BookRepository bookRepository;
	
	public BookController(BookRepository bookRepository) {
		System.out.println("book controller created");
		this.bookRepository = bookRepository;
	}
	@RequestMapping("/books")
	public String getBooks(Model model) {
		System.out.println("getbooks called");
		model.addAttribute("books", bookRepository.findAll());
		return "books";
	}
}
