package com.example.demoproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoproject.entities.Country;
import com.example.demoproject.service.CountryService;

@RestController
public class CountryController {

	@Autowired
	private CountryService countryService;
	
	@GetMapping("/country")
	private List<Country> getAllCountry()
	{
		return countryService.getAll();
	}
	
	@GetMapping("/country/{id}")
	private Country getById(@PathVariable int countryId)
	{
		return countryService.getbyId(countryId);
	}
	
	@PostMapping("/country")
	private Country addCountry(@RequestBody Country country)
	{
		return countryService.addCountry(country);
	}
	
	@PutMapping("/country/{id}")
	private Country updateCountry(@RequestBody Country country,@PathVariable int countryId)
	{
		country.setCountryId(countryId);
		return countryService.updateCountry(country);
	}
	
	@DeleteMapping("/country/{id}")
	private void deleteCountry(@PathVariable int countryId)
	{
		countryService.deleteCountry(countryId);
	}
	
	
}















