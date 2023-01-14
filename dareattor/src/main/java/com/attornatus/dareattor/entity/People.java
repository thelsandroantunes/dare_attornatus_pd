package com.attornatus.dareattor.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class People implements Serializable{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private Date birthDate;
	private Long id;
	
	@JsonIgnore
	List<Address> address = new ArrayList<>();
	
	public People() {
		
	}
	public People(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public People(Long id, String name, Date birthDate) {
		super();
		this.name = name;
		this.birthDate = birthDate;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
		
	public List<Address> getAddress() {
		return address;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		People other = (People) obj;
		return Objects.equals(id, other.id);
	}

}
