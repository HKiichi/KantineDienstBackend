package com.DienstBackend.service;

import com.DienstBackend.dao.PersonDao;
import com.DienstBackend.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public Person savePerson(Person person){
        return personDao.save(person);
    }

    public List<Person> findPersonList(){
        return personDao.findAll();
    }
}
