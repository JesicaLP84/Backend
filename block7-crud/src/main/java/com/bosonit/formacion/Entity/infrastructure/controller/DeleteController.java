package com.bosonit.formacion.entity.infrastructure.controller;

import com.bosonit.formacion.entity.application.PersonServiceImp;
import com.bosonit.formacion.entity.domain.Person;
import com.bosonit.formacion.entity.infrastructure.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class DeleteController {

    @Autowired
    PersonServiceImp personService;

    @Autowired
    PersonRepository personRepository;

    @DeleteMapping("/delete/{id}") //the person is removed by ID and returns the deleted ID
    public ResponseEntity<Object> deletePerson(@PathVariable ("id") Long id){
        if(!personService.existsById(id))
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        personService.deletePerson(id);
        return ResponseEntity.accepted().body(id);
    }

}
