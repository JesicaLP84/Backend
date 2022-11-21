package com.bosonit.formacion.personBean.Model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//I create a configuration class so that when you instantiate the controller you can create the object one by one
@Configuration
public class configurationBean {


    @Bean
    public PersonBean bean1() {
        PersonBean bean1 = new PersonBean();
        bean1.setName("Jessica");
        bean1.setCity("Alcalá de Guadaíra");
        bean1.setAge(38);
        return bean1;
    }

    @Bean
    public PersonBean bean2() {
        PersonBean bean1 = new PersonBean();
        bean1.setName("Christian");
        bean1.setCity("New York");
        bean1.setAge(46);
        return bean1;
    }

    @Bean
    public PersonBean bean3() {
        PersonBean bean1 = new PersonBean();
        bean1.setName("Malevo");
        bean1.setCity("Argentina");
        bean1.setAge(3);
        return bean1;
    }
}
