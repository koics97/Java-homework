package com.example.demo.service;

import com.example.demo.exception.PeopleNotFoundException;
import com.example.demo.model.Person;
import com.example.demo.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepository personRepository;

    public List<Person> findAll() {
        final var people = personRepository.findAll();
        if(people.isEmpty()) {
            throw new PeopleNotFoundException("People not found");
        }
        return personRepository.findAll();
    }

    public List<Person> findByName(String name) {
        final var people = personRepository.findByName(name);
        if(people.isEmpty()) {
            throw new PeopleNotFoundException("No people found with name: " + name);
        }
        return personRepository.findByName(name);
    }

    public List<Person> findByAge(int age) {
        final var people = personRepository.findByAge(age);
        if(people.isEmpty()) {
            throw new PeopleNotFoundException("No people found with age: " + age);
        }
        return personRepository.findByAge(age);
    }

    public List<Person> findByNameAndAge(String name, int age) {
        final var people = personRepository.findByNameAndAge(name, age);
        if(people.isEmpty()) {
            throw new PeopleNotFoundException("No people found with name: " + name + " and age: " + age);
        }
        return personRepository.findByNameAndAge(name, age);
    }
}
