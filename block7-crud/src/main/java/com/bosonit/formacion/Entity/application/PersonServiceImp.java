package com.bosonit.formacion.entity.application;

import com.bosonit.formacion.entity.domain.Person;
import com.bosonit.formacion.entity.infrastructure.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.util.List;

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
    public Person updatePerson( Person person){
        personRepository.save(person);
        return person;
    }

    @Override
    public Person getPerson(Long id) throws FileNotFoundException {
        return personRepository.findById(id).orElseThrow(()-> new FileNotFoundException("Usuario no encontrado"));
    }

    @Override
    public List<Person> getPersons() {
        return personRepository.findAll();
    }


    @Override
    public void deletePerson(Long id) {
        personRepository.deleteById(id);
    }

    @Override
    public boolean existsById(Long id) {
        return personRepository.existsById(id);
    }

}
