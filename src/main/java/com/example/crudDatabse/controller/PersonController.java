package com.example.crudDatabse.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.crudDatabse.models.Person;
import com.example.crudDatabse.services.PersonService;



@RestController
public class PersonController {

	@Autowired
	private PersonService personService; 
	
//get data
	@GetMapping("/getAll")
	public List<Person> getAllPersons(){
		return personService.getAllPersons(); 
	}
	
	
//	post data
	 @PostMapping("/postData")
		public Person savePerson(@RequestBody Person person )
		 {
			return personService.savePerson(person);
		 }
			
			
//delete data
	  @DeleteMapping("/{id}")
		public void deletePerson(@PathVariable Long  id) {
		  	personService.deletePerson(id);
		}
			
//update data
	  @PutMapping("/{id}")
	  public Person updatePerson(@PathVariable Long  id, @RequestBody Person updatedPerson) 
	  {
		
		  	return personService.updatePerson(id, updatedPerson);
		}
	  
	 
}
