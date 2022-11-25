package com.bosonit.formacion.entity.application;

import com.bosonit.formacion.entity.domain.Person;
import com.bosonit.formacion.entity.infrastructure.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.util.Optional;

@Service
public class PersonServiceImp implements PersonService{

    @Autowired
    PersonRepository personRepository;

    @Override
    public Person createPerson(Person person) {
        personRepository.save(person);
        return person;
    }

    @Override
    public Person updatePerson(Person person){
        personRepository.save(person);
        return person;
    }

    @Override
    public Person getPerson(String id) throws FileNotFoundException {
        return null;
    }

    @Override
    public void deletePerson(String id) {

    }




}
