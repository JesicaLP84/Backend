package com.bosonit.formacion.entity.infrastructure.repository;


import com.bosonit.formacion.entity.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{

    PersonRepository findById(Person person);
}
