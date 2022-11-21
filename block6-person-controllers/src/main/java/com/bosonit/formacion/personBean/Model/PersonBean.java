package com.bosonit.formacion.personBean.Model;

import org.springframework.stereotype.Component;

@Component
public class PersonBean {

    private  String name;
    private  String city;
    private int age;

    public PersonBean(String name, String city, int age){
        this.name = name;
        this.city = city;
        this.age = age;
    }

    public PersonBean(){}

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }


    public String getCity() {
        return city;
    }

    public int getAge() {
        return age;
    }
}
