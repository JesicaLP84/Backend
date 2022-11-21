package com.bosonit.formacion.Person.Model;

import org.springframework.stereotype.Component;

@Component
public class Person {
    private  String name;
    private  String city;
    private int age;


    public Person(){}

    public Person(String name, String city, int age){
        this.name = name;
        this.city = city;
        this.age = age;
    }

    //I create the GET for API requests
    public  String getName() {
        return name;
    }
    public String getCity(){
        return city;
    }
    public int getAge(){
        return age;
    }



    public void setName(String name) {
        this.name = name;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
