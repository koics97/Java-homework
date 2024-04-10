package com.example.demo.controller;

import com.example.demo.model.People;
import com.example.demo.service.PeopleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PeopleController {

    private final PeopleService peopleService;

    @GetMapping("/people")
    public List<People> getPeople() {
        return peopleService.findAll();
    }

    @GetMapping("/people2")
    public List<People> getPeople(@RequestParam String name) {
        return peopleService.findByName(name);
    }

    @GetMapping("/people3")
    public List<People> getPeople(@RequestParam int age) {
        return peopleService.findByAge(age);
    }

    @GetMapping("/people4")
    public List<People> getPeople(@RequestParam String name, @RequestParam int age) {
        return peopleService.findByNameAndAge(name, age);
    }
}
