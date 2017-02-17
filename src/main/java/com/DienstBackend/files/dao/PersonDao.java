package com.DienstBackend.files.dao;

import com.DienstBackend.files.domain.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by iris on 21-11-16.
 */
public interface PersonDao extends CrudRepository<Person, Long> {
    Person findByUsername(String username);
    List<Person> findAll();
}
