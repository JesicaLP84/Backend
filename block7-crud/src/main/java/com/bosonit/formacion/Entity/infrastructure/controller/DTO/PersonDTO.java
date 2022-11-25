package com.bosonit.formacion.entity.infrastructure.controller.DTO;

import com.bosonit.formacion.entity.domain.Person;
import lombok.Data;

import java.io.Serializable;

@Data
public class PersonDTO implements Serializable {
    private String name;
    public PersonDTO getPerson(Person person){
        this.setName(person.getName());
        return new PersonDTO();
    }
}
