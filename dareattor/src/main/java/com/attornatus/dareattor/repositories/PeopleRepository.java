package com.attornatus.dareattor.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.attornatus.dareattor.entity.People;

public interface PeopleRepository extends JpaRepository<People, Long> {	

}
