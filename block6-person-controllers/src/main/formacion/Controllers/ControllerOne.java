package com.bosonit.formacion.Controllers;

import com.bosonit.formacion.City.Model.City;
import com.bosonit.formacion.Person.Model.Person;
import com.bosonit.formacion.City.CityServiceImp;
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
    Person person;

    @Autowired
    City city;


    //Funcionamiento de forma individual para probarlo
    @GetMapping("/controllerOne/addPerson")
    public String addPerson(@RequestHeader("name") String name, @RequestHeader("city") String city, @RequestHeader("age") int age ){

        person.setName(name);
        person.setCity(city);
        person.setAge(age);

        return "He añadido a una Persona llamada " + person.getName() + ", vive en " + "" + person.getCity() + " y tiene " + person.getAge() + " años";

    }

    @PostMapping("controllerOne/addCity")
    public ResponseEntity<Object> createCity(@RequestBody City city){
        cityService.createCity(city);
        return new ResponseEntity<>("Ciudades creadas", HttpStatus.OK);
    }


}


