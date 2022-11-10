package com.bosonit.formacion.Controllers;

import com.bosonit.formacion.Class.Person;
import com.bosonit.formacion.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping
public class ControllerOne {

    @Autowired
    PersonService personServices;

    @Autowired
    Person person;

    //Funcionamiento de forma individual para probarlo
    @GetMapping("/controllerOne/addPerson")
    public String addPerson(@RequestHeader("name") String name, @RequestHeader("city") String city, @RequestHeader("age") int age ){

        person.setName(name);
        person.setCity(city);
        person.setAge(age);

        return "He añadido a una Persona llamada " + person.getName() + ", vive en " + "" + person.getCity() + " y tiene " + person.getAge() + " años";

    }


}


