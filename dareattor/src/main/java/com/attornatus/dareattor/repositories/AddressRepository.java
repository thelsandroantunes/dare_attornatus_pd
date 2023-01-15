package com.attornatus.dareattor.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.attornatus.dareattor.entities.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

} 
