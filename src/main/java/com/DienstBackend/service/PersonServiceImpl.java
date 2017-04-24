package com.DienstBackend.service;

import com.DienstBackend.dao.PersonDao;
import com.DienstBackend.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by iris on 23-11-16.
 */
@Service
public class PersonServiceImpl implements PersonService{

    @Autowired
    private PersonDao personDao;

    public void save(Person person){
        personDao.save(person);
    }

    public Person findByUsername(String username){
        return personDao.findByUsername(username);

    }

    public Person createPerson(Person person){
        Person localPerson = personDao.findByUsername(person.getUsername());
        return localPerson;
    }

   /* public void savePerson(Person person){
        personDao.savePerson(person);
    }*/

    public List<Person> findPersonList(){
        return personDao.findAll();
    }

    public List<String> findPersonUsernameList(){
        return personDao.findAll().stream().map(person ->person.getUsername()).collect(Collectors.toList());
    }
}
