package com.DienstBackend.controllers;

import com.DienstBackend.domain.Person;
import com.DienstBackend.service.PersonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by iris on 21-11-16.
 */
@RestController
public class HomeController {

    @Autowired
    PersonService personService;
    //  Person person;

    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @RequestMapping("/logout")
    public String logout() {
        return "logout";
    }

    @RequestMapping(value = "/signup", method = RequestMethod.POST, produces = {"application/json"})
    public Person signupPost(@RequestBody Person person) {

        //Person person = new Person(firstName, lastName, email,username, password);
        //model.addAttribute("person", person);
        // System.out.println(person.toString());
        personService.save(person);

        System.out.println(person.getFirstName());
        return person;
    }

    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public List<String> signup() {

        return personService.findPersonUsernameList();
    }

   /* @RequestMapping(value = "/login", method = RequestMethod.POST)
    public LoginResponse login(@RequestBody UserLogin login)
            throws ServletException {
        if (login.name == null || person.getUsername() != login.name) {
            throw new ServletException("Invalid login");
        }
        return new LoginResponse(Jwts.builder().setSubject(login.name)
                .claim("roles", person.getUsername()).setIssuedAt(new Date())
                .signWith(SignatureAlgorithm.HS256, "secretkey").compact());
    }

    @SuppressWarnings("unused")
    private static class UserLogin {
        public String name;
        public String password;
    }

    @SuppressWarnings("unused")
    private static class LoginResponse {
        public String token;

        public LoginResponse(final String token) {
            this.token = token;
        }
    } */
}


