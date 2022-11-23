package com.bosonit.formacion.entity.person.infrastructure.repository;

import com.bosonit.formacion.entity.person.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Integer> {
}
