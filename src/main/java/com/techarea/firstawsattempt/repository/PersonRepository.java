package com.techarea.firstawsattempt.repository;

import com.techarea.firstawsattempt.Entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
