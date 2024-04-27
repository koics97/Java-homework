package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "people")
@Getter
@Setter
@Builder
public class Person {
    @Id
    private int id;
    private String name;
    private int age;
    private String workplace;
}
