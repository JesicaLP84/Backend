package com.bosonit.formacion.entity.person.application;

import com.bosonit.formacion.entity.person.domain.Person;

import java.io.FileNotFoundException;

public interface PersonService {
    void createPerson(Person person);
    Person updatePerson(Person person);
    Person getPerson(String id) throws FileNotFoundException;
    void deletePerson(String id);
}
