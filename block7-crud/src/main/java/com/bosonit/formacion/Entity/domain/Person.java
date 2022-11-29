package com.bosonit.formacion.entity.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity //Package where the class representing the database table is created - notation to indicate that it is an entity
@Table(name = "person") // The table de person is created
public class Person {

    @Id //Primary key of the table
    @GeneratedValue(strategy = GenerationType.AUTO) //The id field is autonumeric
    @Column(name = "id", nullable = false)
    private Long id;


    @Column
    @NonNull
    private String name;

    @Column
    @NonNull
    private int age;

    @Column
    @NonNull
    private String population;

    public Long getId() {
        return id;
    }
    public void setId(){ this.id = id;}

    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }


    public String getPopulation() {
        return population;
    }
    public void setPopulation(String population) {
        this.population = population;
    }

}
