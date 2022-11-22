package com.bosonit.formacion.infrastructure.controller;

import com.bosonit.formacion.model.Greeting;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;


@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    //I make a GET request on the URL to get a response with a JSON representation of a greeting
    //I changed the value of defaultValue to show us People.
    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "People") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }


    //POST request: sending a JSON object in the body and receiving that same JSON object in the response.
    @PostMapping("/greeting")
    public Greeting greeting(@RequestBody Greeting greeting){
        return greeting;
    }

    // GET request: sending parameters in the path (http://localhost:8080/user/{id})
    @GetMapping("/user/{id}")
    public String users(@RequestParam("id") String id){
        return "The people with ID " + id;
    }

    //PUT: sending Request Params (http://localhost:8080/post?var1=1&var2=2)
    //If Map is used I get all the parameters saved in the URL and I can access them more easily
    @PutMapping(value="/post")
    public String hola(@RequestParam Map<String,String> var) {
        return var.toString();
    }

}
