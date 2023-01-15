package com.attornatus.dareattor.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.attornatus.dareattor.entities.People;
import com.attornatus.dareattor.repositories.PeopleRepository;

@RestController
@RequestMapping(value = "/peoples")
public class PeopleController {

	@Autowired
	private PeopleRepository repository;
	
	@GetMapping
	public ResponseEntity<List<People>> findAll() {
		List<People> list = repository.findAll();
		
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<People>  findAll(@PathVariable Long id) {
		People p = repository.findById(id).get();
		return ResponseEntity.ok().body(p);
	}
	
	@PostMapping
	public People insert(@RequestBody People p) {
		return repository.save(p);
	}
	
	@PutMapping(value = "/{id}")
	public void update(@RequestBody People p, @PathVariable Long id){
		if(id == p.getId()) {
			repository.save(p);
		}
	}
}
