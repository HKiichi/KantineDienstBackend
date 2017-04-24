package com.DienstBackend.dao;

import com.DienstBackend.domain.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by iris on 21-11-16.
 */
public interface PersonDao extends CrudRepository<Person, Long> {
    Person findByUsername(String username);
    List<Person> findAll();


   }
