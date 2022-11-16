package com.bosonit.formacion.Person.PersonBean;

import com.bosonit.formacion.Person.Model.Person;
import com.bosonit.formacion.Person.PersonBean.Model.PersonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RequestMapping
@RestController
public class ControllerBean {

    @Autowired
//    @Qualifier
    private Person personBeanOne;

    @Autowired
//    @Qualifier
    private Person personBeanThree;



    @Autowired
    @Qualifier("personBeanTow")
    private PersonBean personBeanTow;

//    @GetMapping("controller/bean/bean1")
////    public String personBeanTow(@PathParam("personBeanTow") PersonBean personBeanTow ){
////        personBeanTow = new PersonBean(PersonBeanTow);
////        return "PersonTow" + personBeanTow.getName()+ personBeanTow.getAge+ personBeanTow.getPhone;
////    }




}
