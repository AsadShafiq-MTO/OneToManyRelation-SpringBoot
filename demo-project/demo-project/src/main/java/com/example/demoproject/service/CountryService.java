package com.example.demoproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoproject.entities.Country;
import com.example.demoproject.repository.CountryRepository;

@Service
public class CountryService {

	@Autowired
	private CountryRepository countryRepository;
	
	
	public List<Country>  getAll()
	{
		return countryRepository.findAll();
	}
	
	public Country getbyId(int countryId)
	{
		return countryRepository.findById(countryId).get();
	}
	
	public Country addCountry(Country country)
	{
		
		return countryRepository.save(country);
	}
	public Country updateCountry(Country country)
	{
		
		return countryRepository.save(country);
	}
	public boolean deleteCountry(int countryId)	{
		
		 countryRepository.deleteById(countryId);
		 return true;
	}
}









