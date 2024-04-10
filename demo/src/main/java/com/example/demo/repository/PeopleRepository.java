package com.example.demo.repository;

import com.example.demo.model.People;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.Period;
import java.util.List;

public interface PeopleRepository extends JpaRepository<People, Integer> {
    List<People> findByName(String name);

    List<People> findByAge(int age);

    List<People> findByNameAndAge(String name, int age);
}
