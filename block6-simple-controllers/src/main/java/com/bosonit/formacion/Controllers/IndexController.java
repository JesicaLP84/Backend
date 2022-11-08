package com.bosonit.formacion.Controllers;


import com.bosonit.formacion.Class.Person;
import org.springframework.web.bind.annotation.*;

//Tells the Person class that their methods will be focused on receiving requests
@RestController
public class IndexController {

    //I use it for GET requests where the user resource is obtained -- IMPORTANT THE VALUE IS USERS
    @GetMapping("/users/{user}")
    public String user(@PathVariable("user") String name){
        return "Hello, I'm " + name;
    }

    //I use it for POST requests where you get the resource of adding user adding one more year
    @PostMapping("/usersadd")
    public String personAdd(@RequestBody Person person){
        return "The age of" + person.getName() + " has increased " + (person.getAge() + 1);
    }

}




