package com.example.demo.service;

import com.example.demo.exception.PeopleNotFoundException;
import com.example.demo.model.Person;
import com.example.demo.repository.PersonRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class PersonServiceTest {
    @Mock
    private PersonRepository personRepository;
    @InjectMocks
    private PersonService personService;

    @Test
    public void testFindAll() {
        final var name = "John";
        final var age = 30;
        final var id = 1;

        when(personRepository.findAll()).thenReturn(List.of(
                Person.builder()
                        .id(id)
                        .name(name)
                        .age(age)
                        .build()
        ));
        final var people = personService.findAll();

        Assertions.assertEquals(1, people.size());
    }

    @Test
    public void testFindByName() {
        final var name = "John";
        final var age = 30;
        final var id = 1;

        when(personRepository.findByName(name)).thenReturn(List.of(
                Person.builder()
                        .id(id)
                        .name(name)
                        .age(age)
                        .build()
        ));
        final var people = personService.findByName(name);

        Assertions.assertEquals(name, people.get(0).getName());
    }

    @Test
    public void testFindByAge() {
        final var name = "John";
        final var age = 30;
        final var id = 1;

        when(personRepository.findByAge(age)).thenReturn(List.of(
                Person.builder()
                        .id(id)
                        .name(name)
                        .age(age)
                        .build()
        ));
        final var people = personService.findByAge(age);

        Assertions.assertEquals(age, people.get(0).getAge());
    }

    @Test
    public void testFindByNameAndAge() {
        final var name = "John";
        final var age = 30;
        final var id = 1;

        when(personRepository.findByNameAndAge(name, age)).thenReturn(List.of(
                Person.builder()
                        .id(id)
                        .name(name)
                        .age(age)
                        .build()
        ));
        final var people = personService.findByNameAndAge(name, age);

        Assertions.assertEquals(name, people.get(0).getName());
        Assertions.assertEquals(age, people.get(0).getAge());
    }

    @Test
    public void testThrowsExceptionWhenPeopleNotFound(){
        when(personRepository.findAll()).thenReturn(List.of());
        Assertions.assertThrows(PeopleNotFoundException.class, () -> personService.findAll());
    }
}
