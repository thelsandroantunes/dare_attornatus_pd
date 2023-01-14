package com.attornatus.dareattor.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.attornatus.dareattor.entity.Address;
import com.attornatus.dareattor.repositories.AddressRepository;

@RestController
@RequestMapping(value = "/adresses")
public class AddressResource {
	
	@Autowired
	private AddressRepository addressRepository;
	
	@GetMapping
	public ResponseEntity<List<Address>>findAll(){
		
		List<Address> list = addressRepository.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Address> findById(@PathVariable Long id){
		Address Address = addressRepository.findById(id);
		return ResponseEntity.ok().body(Address);
	}

}
