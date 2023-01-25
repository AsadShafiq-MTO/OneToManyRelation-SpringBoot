package com.example.demoproject.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class City {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cityId;
	
	private String name;

	public City() {
		super();
		// TODO Auto-generated constructor stub
	}

	public City(int cityId, String name) {
		super();
		this.cityId = cityId;
		this.name = name;
	}
	

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
	
}
