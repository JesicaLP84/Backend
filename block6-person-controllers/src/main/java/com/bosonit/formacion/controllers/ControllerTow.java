package com.bosonit.formacion.controllers;

import com.bosonit.formacion.city.model.City;
import com.bosonit.formacion.city.service.CityService;
import com.bosonit.formacion.person.service.PersonService;
import com.bosonit.formacion.person.model.Person;
import com.bosonit.formacion.person.service.PersonServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@Configuration
public class ControllerTow {
    @Autowired
    Person person;

    @Autowired
    PersonServiceImp personService;

    @Autowired
    City city;

    @Autowired
    CityService cityService;


    //Method to obtain the person who had previously been created by multiplying his age by two
    @GetMapping("/controllerTow/getPerson")
    public String getPerson() {

        return "I got a person named " + person.getName() + ", live in " + "" + person.getCity() + " and has " + (person.getAge() * 2 ) + " years";
    }

    //Method to obtain the list of cities created through the Postman
    @GetMapping("/controllerOne/getCity")
    public ResponseEntity<Object> getCity(){
        return new ResponseEntity<>(cityService.getCities(), HttpStatus.OK);
    }
}
