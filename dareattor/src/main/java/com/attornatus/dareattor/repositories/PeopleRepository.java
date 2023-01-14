package com.attornatus.dareattor.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.attornatus.dareattor.entity.People;

@Component
public class PeopleRepository {
	
	private Map<Long, People> map = new HashMap<>(); 

	public void save(People obj) {
		map.put(obj.getId(), obj);
		
	}
	public People findById(Long id) {
		return map.get(id);
	}
	public List<People> findAll(){
		return new ArrayList<People>(map.values());
	}
}
