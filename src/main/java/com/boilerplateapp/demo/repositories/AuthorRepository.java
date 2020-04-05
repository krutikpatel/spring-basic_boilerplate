package com.boilerplateapp.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.boilerplateapp.demo.model.Author;

/*
 * knote: provide Class for which we are creating this repo, and its ID firld type
 * Spring will provide/create implementation
 */
public interface AuthorRepository extends CrudRepository<Author, Long>{

}
