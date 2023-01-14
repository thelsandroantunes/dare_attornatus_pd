package com.attornatus.dareattor.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.attornatus.dareattor.entity.People;
import com.attornatus.dareattor.repositories.PeopleRepository;

@RestController
@RequestMapping(value = "/peoples")
public class PeopleResource {
	
	@Autowired
	private PeopleRepository peopleRepository;
	
	@GetMapping
	public ResponseEntity<List<People>>findAll(){
		
		List<People> list = peopleRepository.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	
	@GetMapping(value="/{id}")
	public ResponseEntity<People> findById(@PathVariable Long id){
		People people = peopleRepository.findById(id).get();
		return ResponseEntity.ok().body(people);
	}

}
