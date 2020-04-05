package com.boilerplateapp.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.boilerplateapp.demo.model.Book;

public interface BookRepository extends CrudRepository<Book, Long>{

}
