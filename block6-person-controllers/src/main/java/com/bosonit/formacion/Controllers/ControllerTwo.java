package com.bosonit.formacion.Controllers;

import com.bosonit.formacion.Class.Person;
import com.bosonit.formacion.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RequestMapping
@RestController
public class ControllerTwo  {


    @Autowired
    Person person;

    @Autowired
    PersonService personService;


    @GetMapping("/controllerTow/getPerson")
    public String getPerson() {

        return "He añadido a una Persona llamada " + person.getName() + ", vive en " + "" + person.getCity() + " y tiene " + (person.getAge() * 2 ) + " años";
    }

//
}
