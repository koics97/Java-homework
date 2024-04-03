package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "something")
@Getter
@Setter
public class People {
    @Id
    private int id;
    private String name;
    private int age;
    private String workplace;
}
