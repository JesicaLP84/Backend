package com.bosonit.formacion.Person.PersonBean.Model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonBean {

    public String getAge;
    public String getPhone;
    //creación de los atributos
    private String name;
    private int age;
    private int phone;

    //creación del objeto
    public PersonBean(String name, int age, int phone){
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public PersonBean() {

    }

    @Bean
    public PersonBean personBeanOne(){
        PersonBean personBeanOne = new PersonBean("Jessica", 38, 153153153);
        return personBeanOne;
    }

    @Bean
    public PersonBean personBeanTow(){
        PersonBean personBeanTow = new PersonBean("Christian" , 46, 564564564);
        return personBeanTow;
    }

    @Bean
    public PersonBean personBeanThree(){
        PersonBean personBeanThree = new PersonBean("Malevo", 3, 123456789);
        return personBeanThree;
    }

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int age() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int phone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }
}
