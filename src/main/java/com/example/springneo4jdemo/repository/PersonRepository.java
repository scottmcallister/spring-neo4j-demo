package com.example.springneo4jdemo.repository;

import com.example.springneo4jdemo.entities.Person;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by scottmcallister on 2018-03-19.
 */
public interface PersonRepository extends CrudRepository<Person, Long> {
    Person findByName(String name);
}
