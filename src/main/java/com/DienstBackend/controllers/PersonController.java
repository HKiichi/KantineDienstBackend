package com.DienstBackend.controllers;

import com.DienstBackend.domain.Person;
import com.DienstBackend.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import java.security.Principal;

/**
 * Created by iris on 21-11-16.
 */
@Controller
@RequestMapping
public class PersonController {

    @Autowired
    PersonService personService;

    @RequestMapping(value = "/profile", method = RequestMethod.GET)
    public String profile(Principal principal, Model model){
        Person person = personService.findByUsername(principal.getName());

        model.addAttribute("person", person);

        return "profile";
    }

    @RequestMapping(value = "/profile", method = RequestMethod.POST)
    public String profilePost(@ModelAttribute("person") Person newPerson, Model model){
       Person person = personService.findByUsername(newPerson.getUsername());
        person.setUsername(newPerson.getUsername());

        model.addAttribute("person", person);
        personService.savePerson(person);

        return "profile";
    }

}
