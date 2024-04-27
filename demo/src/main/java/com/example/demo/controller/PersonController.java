package com.example.demo.controller;

import com.example.demo.model.Person;
import com.example.demo.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PersonController {

    private final PersonService personService;

    @GetMapping("/people")
    public List<Person> getPeople() {
        return personService.findAll();
    }

    @GetMapping("/people2")
    public List<Person> getPeople(@RequestParam String name) {
        return personService.findByName(name);
    }

    @GetMapping("/people3")
    public List<Person> getPeople(@RequestParam int age) {
        return personService.findByAge(age);
    }

    @GetMapping("/people4")
    public List<Person> getPeople(@RequestParam String name, @RequestParam int age) {
        return personService.findByNameAndAge(name, age);
    }
}
