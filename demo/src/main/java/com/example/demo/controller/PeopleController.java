package com.example.demo.controller;

import com.example.demo.model.People;
import com.example.demo.repository.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PeopleController {

    @Autowired
    private PeopleRepository peopleRepository;
    @GetMapping("/people")
    public List<People> getPeople() {
        return peopleRepository.findAll();
    }

    @GetMapping("/people2")
    public List<People> getPeople(@RequestParam String name) {
        return peopleRepository.findByName(name);
    }

    @GetMapping("/people3")
    public List<People> getPeople(@RequestParam int age) {
        return peopleRepository.findByAge(age);
    }
    @GetMapping("/people4")
    public List<People> getPeople(@RequestParam String name, @RequestParam int age) {
        return peopleRepository.findByNameAndAge(name, age);
    }
}
