package com.techarea.firstawsattempt.controller;

import com.techarea.firstawsattempt.Entity.Person;
import com.techarea.firstawsattempt.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class PersonController {

    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    public Person getById(@RequestParam(value = "id") Long id) {
        return personService.getById(id);
    }

    @PostMapping
    public Person save(@RequestBody Person person) {
        return personService.save(person);
    }
}
