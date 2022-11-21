package com.bosonit.formacion.personBean;

import com.bosonit.formacion.personBean.Model.PersonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping
@Configuration
public class ControllerBean {

    //In this case, I name bean1 and in endopoint makes the request through the variable that I indicate
    @Autowired
    @Qualifier("bean1")
    PersonBean personBean;

    //with the annotation @Qualifer we can specify to Spring what to use, I leave commented as it would be if we name each one
//    @Autowired
////  @Qualifier("bean2")
//    PersonBean bean2;
//
//    @Autowired
////  @Qualifier("bean3")
//    PersonBean bean3;


    @GetMapping("/bean/{bean}")
    public String getBean(@PathVariable("bean") String beanNumber) {
        return "Hello, this is " + personBean.getName() + " " + personBean.getCity() + " " + personBean.getAge();

    }

}
