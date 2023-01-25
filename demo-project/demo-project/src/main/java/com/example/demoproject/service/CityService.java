package com.example.demoproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoproject.entities.City;
import com.example.demoproject.repository.CityRepository;

@Service
public class CityService {

	@Autowired
	private CityRepository cityRepository;
	
	public List<City> getAll()
	{
		return cityRepository.findAll();
	}
	
	public City getbyId(int cityId)
	{
		return cityRepository.findById(cityId).get();
	}
	
	public City add(City city)
	{
		return cityRepository.save(city);
	}
	
	public City update(City city)
	{
		return cityRepository.save(city);
	}
	public boolean delete(int cityId)
	{
		 cityRepository.deleteById(cityId);
		 return true;
	}
	
	
	
}
