package com.example.demo.service;

import com.example.demo.model.People;
import com.example.demo.repository.PeopleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PeopleService {

    private final PeopleRepository peopleRepository;

    public List<People> findAll() {
        return peopleRepository.findAll();
    }

    public List<People> findByName(String name) {
        return peopleRepository.findByName(name);
    }

    public List<People> findByAge(int age) {
        return peopleRepository.findByAge(age);
    }

    public List<People> findByNameAndAge(String name, int age) {
        return peopleRepository.findByNameAndAge(name, age);
    }
}
