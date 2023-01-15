package com.attornatus.dareattor;

import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.attornatus.dareattor.entities.Address;
import com.attornatus.dareattor.entities.People;
import com.attornatus.dareattor.repositories.AddressRepository;
import com.attornatus.dareattor.repositories.PeopleRepository;

@SpringBootApplication
public class DareattorApplication implements CommandLineRunner{

	@Autowired
	private PeopleRepository peopleRepository;
	@Autowired
	private AddressRepository addressRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(DareattorApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		People p1 = new People(null, "Abadias Source", new Date());
		People p2 = new People(null, "Thelsandro Antunes", new Date());
		
		Address ad1 = new Address(null, "Rua Leopoldo Bayma","133","69088-087", "Manaus",true, p2);
		Address ad2 = new Address(null, "Rua A","001","69000-011", "Rio de Janeiro",true, p1);
		Address ad3 = new Address(null, "Rua Leopoldo Bayma","002","69021-095", "Manaus",false, p2);
		Address ad4 = new Address(null, "Rua São Gonçalo","453","69022-000", "Rio de Janeiro",false, p1);
		
		p1.getAddress().addAll(Arrays.asList(ad2,ad4));
		p2.getAddress().addAll(Arrays.asList(ad1,ad3));
		
		peopleRepository.save(p1);
		peopleRepository.save(p2);
		
		addressRepository.save(ad1);
		addressRepository.save(ad2);
		addressRepository.save(ad3);
		addressRepository.save(ad4);
		
	}

}
