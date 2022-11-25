package com.bosonit.formacion.entity.application;

import com.bosonit.formacion.entity.domain.Person;

import java.io.FileNotFoundException;
import java.util.Optional;

public interface PersonService {

    Person createPerson(Person person);

    Person updatePerson(Person person);

    Person getPerson(String id) throws FileNotFoundException;

    void deletePerson(String id);


}
