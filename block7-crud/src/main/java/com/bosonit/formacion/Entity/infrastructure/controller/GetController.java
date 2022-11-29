package com.bosonit.formacion.entity.infrastructure.controller;

import com.bosonit.formacion.entity.application.PersonService;
import com.bosonit.formacion.entity.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.FileNotFoundException;
import java.util.List;

@RestController
@RequestMapping("/person")
public class GetController {

    @Autowired
    private PersonService personService;

    @GetMapping("/{id}")
    public ResponseEntity<Person> personById(@PathVariable("id") long id) throws FileNotFoundException {
        if(!personService.existsById(id))
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        personService.getPerson(id);
        return new ResponseEntity<>(personService.getPerson(id),HttpStatus.OK);
    }

    @GetMapping("/all")
    public List<Person> allPersons(){
        return personService.getPersons();
    }

}
