package com.example.crudDatabse.services;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.crudDatabse.models.Person;
import com.example.crudDatabse.repository.PersonRepository;

@Service
public class PersonService {
	
//	JPA Function
	@Autowired
	private PersonRepository personRepository;
	
//get data
	public List<Person> getAllPersons(){
		return personRepository.findAll();
	}
	
//get data by id
	public Person getPersonById(Long id) {
		return  personRepository.findById(id).orElse(null);
	}
	
//post data
	public Person savePerson(Person person) {
		return personRepository.save(person);
	}
	
//delete data
	public void deletePerson(Long id) {
		personRepository.deleteById(id);
	}
	
//update data
		public Person updatePerson(Long id, Person updatedPerson) {
//			Optional<Person> existingPersonOptional = personRepository.findById(id);
//			
//			if(existingPersonOptional.isPresent()) 
//			{
//				Person existingPerson = existingPersonOptional.get();
//				 existingPerson.setName(updatedPerson.getName());
//				 existingPerson.setAge(updatedPerson.getAge());
//				 
//				 return personRepository.save(existingPerson);
//			}
//			else {
//				return null;
//			}
			
			Person exist = personRepository.findById(id).orElse(null);
			if(exist != null) {
				exist.setName(updatedPerson.getName());
				exist.setAge(updatedPerson.getAge());
				return personRepository.save(exist);
			} else {
				return null;
			}
			
		}	
}
