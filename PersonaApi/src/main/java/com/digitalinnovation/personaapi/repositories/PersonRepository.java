package com.digitalinnovation.personaapi.repositories;

import com.digitalinnovation.personaapi.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Long> {
}
