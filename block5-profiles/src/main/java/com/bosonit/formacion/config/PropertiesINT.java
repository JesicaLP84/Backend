package com.bosonit.formacion.config;


import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.annotation.PostConstruct;

@Slf4j
@Configuration
@Profile("INTEGRATION")
public class PropertiesINT {

    @PostConstruct
    public void test(){
        log.info("INTEGRATION");
    }

}
