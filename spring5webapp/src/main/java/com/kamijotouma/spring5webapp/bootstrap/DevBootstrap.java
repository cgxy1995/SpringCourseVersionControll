package com.kamijotouma.spring5webapp.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.kamijotouma.spring5webapp.model.Author;
import com.kamijotouma.spring5webapp.model.Book;
import com.kamijotouma.spring5webapp.model.Publisher;
import com.kamijotouma.spring5webapp.repositories.AuthorRepository;
import com.kamijotouma.spring5webapp.repositories.BookRepository;
import com.kamijotouma.spring5webapp.repositories.PublisherRepository;
@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {
	private AuthorRepository authorRepository;
	private BookRepository bookRepository;
	private PublisherRepository publisherRepository;
	public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
		super();
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
		this.publisherRepository = publisherRepository;
	}
	@Override
	public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
		// TODO Auto-generated method stub
		initData();
	}
	private void initData() {
		Publisher press1 = new Publisher("press1", "USA");
		Publisher press2 = new Publisher("press2", "China");
		publisherRepository.save(press1);
		publisherRepository.save(press2);
		//Eric
		Author eric = new Author("Eric", "Evans");
		Book ddd = new Book("Domain Driven Design", "1234", press1);
		eric.getBooks().add(ddd);
		ddd.getAuthors().add(eric);
		authorRepository.save(eric);
		bookRepository.save(ddd);
		//Rod
		Author rod = new Author("Rod", "Johnson");
		Book noEJB = new Book("J2EE Development without EJB", "23444",press2);
		rod.getBooks().add(noEJB);
		authorRepository.save(rod);
		bookRepository.save(noEJB);
	}
}
