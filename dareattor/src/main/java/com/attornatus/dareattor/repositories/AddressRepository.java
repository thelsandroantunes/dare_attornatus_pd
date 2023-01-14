package com.attornatus.dareattor.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.attornatus.dareattor.entity.Address;

@Component
public class AddressRepository {
	
	private Map<Long, Address> map = new HashMap<>(); 

	public void save(Address obj) {
		map.put(obj.getId(), obj);
		
	}
	public Address findById(Long id) {
		return map.get(id);
	}
	public List<Address> findAll(){
		return new ArrayList<Address>(map.values());
	}

}
