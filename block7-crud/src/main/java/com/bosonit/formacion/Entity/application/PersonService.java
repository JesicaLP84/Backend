package com.bosonit.formacion.entity.application;

import com.bosonit.formacion.entity.domain.Person;

import java.io.FileNotFoundException;
import java.util.List;


public interface PersonService {

    Person createPerson(Person person);

    Person getPerson(Long id) throws FileNotFoundException;

    List<Person> getPersons();

    Person updatePerson( Person person);

    void deletePerson(Long id);

    boolean existsById(Long id);


}
