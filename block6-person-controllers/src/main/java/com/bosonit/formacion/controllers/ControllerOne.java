package com.bosonit.formacion.controllers;

import com.bosonit.formacion.city.model.City;
import com.bosonit.formacion.city.service.CityServiceImp;
import com.bosonit.formacion.person.model.Person;
import com.bosonit.formacion.person.service.PersonServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
@Configuration
public class ControllerOne {
    @Autowired
    CityServiceImp cityService;

    @Autowired
    PersonServiceImp personService;

    @Autowired
    Person person;

    @Autowired
    City city;


    //Operation individually for testing - I call the method to add the person passing the values through the headers of the request.
    @GetMapping("/controllerOne/addPerson")
    public String addPerson(@RequestHeader("name") String name, @RequestHeader("city") String city, @RequestHeader("age") int age ){

        person.setName(name);
        person.setCity(city);
        person.setAge(age);

        return "I added a person " + person.getName() + ", lives in "  + person.getCity() + " and has " + person.getAge() + " years";

    }
    //Method that the values are passed through the body with a post
    @PostMapping("controllerOne/addCity")
    public ResponseEntity<Object> createCity(@RequestBody City city){
        cityService.createCity(city);
        return new ResponseEntity<>("City created "  + city.getName()  + " with a population of "  + city.getPopulation(), HttpStatus.OK);
    }
}
