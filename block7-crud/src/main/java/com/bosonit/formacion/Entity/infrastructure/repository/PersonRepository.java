package com.bosonit.formacion.entity.infrastructure.repository;


import com.bosonit.formacion.entity.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //Package in which the class is created that has as a particularity that extends of JpaRepository
// which allows to manage the fundamental CRUD operations.
// With @Repository I indicate the main methods select, create, update, delete
public interface PersonRepository extends JpaRepository<Person, Long>{

    //CrudRepository allows you to search by field according to the entity
    PersonRepository findById(Person person);

}
