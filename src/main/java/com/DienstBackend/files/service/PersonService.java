package com.DienstBackend.files.service;

import com.DienstBackend.files.domain.Person;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by iris on 23-11-16.
 */

public interface PersonService {
    Person findByUsername(String username);

    void save (Person person);

    Person createPerson(Person person);

    Person savePerson(Person person);

    List<Person> findPersonList();
}
