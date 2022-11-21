package com.bosonit.formacion.person.service;

import com.bosonit.formacion.person.model.Person;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImp implements PersonService {



    @Override
    public Person createPerson(Person person) {
        Person personNew = new Person();
        return person;

    }

    @Override
    public void updatePerson(String name, String city, String age, Person person) {
    }

    @Override
    public void deletePerson(String name) {

    }

    @Override
    public Person getPerson(Person person) {
        return person;
    }

    @Override
    public String getPerson() {
        return null;
    }
    @Override
    public String getName() {
        return null;
    }
    @Override
    public int getAge() {
        return getAge();
    }
}
