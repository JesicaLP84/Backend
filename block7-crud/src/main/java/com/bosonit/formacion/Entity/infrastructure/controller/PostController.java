package com.bosonit.formacion.entity.infrastructure.controller;

import com.bosonit.formacion.entity.application.PersonServiceImp;
import com.bosonit.formacion.entity.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("person")
public class PostController {
    @Autowired
    PersonServiceImp personService;

    @PostMapping("/newPerson")
    public ResponseEntity<Object> postPerson(@RequestBody Person person){
            personService.createPerson(person);
            return new ResponseEntity<>(person, HttpStatus.OK);
        // return new ResponseEntity<>("Person created is "  + person.getName() + " with ID: " + person.getId(), HttpStatus.OK);
    }
}
