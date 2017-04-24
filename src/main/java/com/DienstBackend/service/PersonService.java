package com.DienstBackend.service;

import com.DienstBackend.domain.Person;

import java.util.List;

/**
 * Created by iris on 23-11-16.
 */

public interface PersonService {
    Person findByUsername(String username);

    void save (Person person);

    Person createPerson(Person person);

 /*   void savePerson(Person person);*/

    List<Person> findPersonList();

    List<String> findPersonUsernameList();
}
