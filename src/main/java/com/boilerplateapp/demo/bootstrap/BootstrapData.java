package com.boilerplateapp.demo.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.boilerplateapp.demo.model.Author;
import com.boilerplateapp.demo.model.Book;
import com.boilerplateapp.demo.repositories.AuthorRepository;
import com.boilerplateapp.demo.repositories.BookRepository;

/*
 * knote: SpringBoot applications can have zero or many CommandLineRunner. 
 * 			It is not replacement of main method. 
 * 
 * 		Notice Component annotation too.
 */
@Component
public class BootstrapData implements CommandLineRunner{

	private final AuthorRepository authorRepo;
	private final BookRepository bookRepo;
	
	/*
	 * knote: autowired by constructor
	 */
	public BootstrapData(AuthorRepository authorRepo, BookRepository bookRepo) {
		this.authorRepo = authorRepo;
		this.bookRepo = bookRepo;
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Author a1 = new Author("krutik","patel");
		Author a2 = new Author("khushi","patel");
		
		Book b1 = new Book("Book1", "ISBN1");
		Book b2 = new Book("Book2", "ISBN2");
		
		a1.getBooks().add(b1);
		a2.getBooks().add(b2);
		
		b1.getAuthors().add(a1);
		b2.getAuthors().add(a2);
		
		authorRepo.save(a1);
		authorRepo.save(a2);
		
		bookRepo.save(b1);
		bookRepo.save(b2);
		
		System.out.println("Author repo count = "+authorRepo.count());
		System.out.println("Book repo count = "+bookRepo.count());
	}
	
}
