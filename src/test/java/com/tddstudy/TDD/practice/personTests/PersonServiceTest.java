package com.tddstudy.TDD.practice.personTests;

import com.tddstudy.TDD.practice.person.IPersonService;
import com.tddstudy.TDD.practice.person.Person;
import com.tddstudy.TDD.practice.person.PersonService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonServiceTest {

    Person person;
    IPersonService service;

    @BeforeEach
    void setup(){
        person = new Person(
                "Keith", "Moon", "Wembley, UK", "male", "keith@mail.com"
        );

        service = new PersonService();
    }


    @Test
    void createPerson_ShouldReturnNonNullPersonInstance(){

        Person actual = service.createPerson(person);

        assertNotNull(actual);

    }

    @Test
    void createPerson_ShouldReturnPersonWithMatchingAttributes() {

        Person actual = service.createPerson(person);

        assertAll(
                () -> assertEquals(person.getFirstName(), actual.getFirstName()),
                () -> assertEquals(person.getLastName(), actual.getLastName()),
                () -> assertEquals(person.getAddress(), actual.getAddress()),
                () -> assertEquals(person.getGender(), actual.getGender()),
                () -> assertEquals(person.getEmail(), actual.getEmail())
                );
    }

    @Test
    void createPerson_ShouldReturnNonNullID(){
        Person actual = service.createPerson(person);
        System.out.println(person.getId());
        assertNotNull(actual.getId());
    }
}
