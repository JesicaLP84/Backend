package com.bosonit.formacion.Controllers;

import com.bosonit.formacion.City.Model.City;
import com.bosonit.formacion.Person.Model.Person;
import com.bosonit.formacion.City.CityService;
import com.bosonit.formacion.Person.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RequestMapping
@RestController
public class ControllerTwo  {


    @Autowired
    Person person;

    @Autowired
    PersonService personService;

    @Autowired
    City city;

    @Autowired
    CityService cityService;


    @GetMapping("/controllerTow/getPerson")
    public String getPerson() {

        return "He añadido a una Persona llamada " + person.getName() + ", vive en " + "" + person.getCity() + " y tiene " + (person.getAge() * 2 ) + " años";
    }

    @GetMapping("/controllerOne/getCity")
    public ResponseEntity<Object> getCity(){
        return new ResponseEntity<>(cityService.getCities(), HttpStatus.OK);
    }

}
