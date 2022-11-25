package com.bosonit.formacion.entity.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "person") // Se crea la table de person
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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

    public Long id() {
        return id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String population() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public Long getId() {
        return id;
    }


}
