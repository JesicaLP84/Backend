package com.bosonit.formacion.Service;


import com.bosonit.formacion.Class.Person;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class PersonServiceImp implements PersonService{
//    private static Map<String, Person> personRepo = new HashMap<>();
//    static {
//        Person person = new Person();
//        person.setName();
//        person.setCity();
//        person.setAge();
//        personRepo.put(person.getName(), person);
//    }


    @Override
    public Person createPerson(Person person) {
//        personRepo.put(person.getName(), person);
        Person personNew = new Person();
        return person;

    }

    @Override
    public Person getPerson(Person person) {
        return person;
    }

    @Override
    public void updatePerson(String name, String city, String age, Person person) {

    }

    @Override
    public void deletePerson(String name) {

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
    public String getAge() {
        return null;
    }





}
