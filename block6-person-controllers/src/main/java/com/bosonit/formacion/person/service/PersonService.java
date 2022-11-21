package com.bosonit.formacion.person.service;

import com.bosonit.formacion.person.model.Person;

public interface PersonService {
    public abstract Person createPerson(Person person);

    Person getPerson(Person person);

    public abstract void updatePerson(String name, String city, String age, Person person);
    public abstract void deletePerson(String name);


    String getPerson();

    String getName();

    int getAge();
}
