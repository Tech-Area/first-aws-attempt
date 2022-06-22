package com.techarea.firstawsattempt.service;

import com.techarea.firstawsattempt.Entity.Person;
import com.techarea.firstawsattempt.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person getById(Long id) {
        var x = personRepository.findById(id);
        return x.orElse(null);
    }

    public Person save(Person person) {
        return personRepository.save(person);
    }

}
