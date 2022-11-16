package com.bosonit.formacion.Person.Service;

import com.bosonit.formacion.Person.Model.Person;

public interface PersonService {

    public abstract Person createPerson(Person person);

    Person getPerson(Person person);

    public abstract void updatePerson(String name, String city, String age, Person person);
    public abstract void deletePerson(String name);


    String getPerson();

    String getName();

    int getAge();
}
