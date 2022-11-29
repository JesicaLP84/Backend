package com.bosonit.formacion.entity.infrastructure.controller;

import com.bosonit.formacion.entity.application.PersonServiceImp;
import com.bosonit.formacion.entity.domain.Person;
import com.bosonit.formacion.entity.infrastructure.repository.PersonRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController //Package where the class that acts as a Rest handler is created, that is, expose the APIs that are defined.
@RequestMapping("person")
public class PutController {

    @Autowired
    PersonServiceImp personService;
    @Autowired
    PersonRepository personRepository;


    @PutMapping("/{id}") // Put an updated person by Id
    public ResponseEntity<Person> updatePerson(@PathVariable("id") Long id, @RequestBody Person person){

        Optional<Person> personDTO = personRepository.findById(id);
        if(personDTO.isPresent()){
            Person _person = personDTO.get();
            _person.setName(person.getName());
            _person.setAge(person.getAge());
            _person.setPopulation(person.getPopulation());
            return new ResponseEntity<Person>(personService.updatePerson(_person), HttpStatus.OK);
        }else{
            return new ResponseEntity<Person>(HttpStatus.NOT_FOUND); // indicates error 404 in Postman
        }
    }

}
