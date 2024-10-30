package com.tddstudy.TDD.practice.person;

import java.util.concurrent.atomic.AtomicLong;

public class PersonService implements IPersonService{
    @Override
    public Person createPerson(Person person) {
        if(person == null){
            throw new IllegalArgumentException("Person cannot be null");
        }
        //simulando acesso ao banco de dados
        var id = new AtomicLong().incrementAndGet();
        person.setId(id);

        return person;
    }
}
