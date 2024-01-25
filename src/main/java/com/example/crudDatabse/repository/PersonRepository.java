package com.example.crudDatabse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.crudDatabse.models.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person,Long> {

} 
