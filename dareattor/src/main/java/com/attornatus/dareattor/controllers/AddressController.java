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

import com.attornatus.dareattor.entities.Address;
import com.attornatus.dareattor.repositories.AddressRepository;

@RestController
@RequestMapping(value = "/adresses")
public class AddressController {


	@Autowired
	AddressRepository repository;
	
	// displaying list of all address
	@GetMapping
	public ResponseEntity<List<Address>>findAll(){
		
		List<Address> list = repository.findAll();
		
		return ResponseEntity.ok().body(list);
	}

	// displaying address by id
	@GetMapping(value="/{id}")
	public ResponseEntity<Address> findById(@PathVariable Long id){
		Address Address = repository.findById(id).get();
		return ResponseEntity.ok().body(Address);
	}
	
	// inserting address
	@PostMapping
	public Address insert(@RequestBody Address d) {
		return repository.save(d);
	}
	@PutMapping(value = "/{id}")
	public void update(@RequestBody Address d, @PathVariable Long id){
		if(id == d.getId()) {
			repository.save(d);
			
		}
	}

}