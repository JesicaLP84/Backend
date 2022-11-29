package com.bosonit.formacion.entity.infrastructure.controller.DTO;

import com.bosonit.formacion.entity.domain.Person;
import lombok.Data;

import java.io.Serializable;

@Data //Package where the class is created that is limited to being a transfer object between the client and the server.
public class PersonDTO implements Serializable {
    private String name;
    public PersonDTO getPerson(Person person){
        this.setName(person.getName());
        return new PersonDTO();
    }
}
