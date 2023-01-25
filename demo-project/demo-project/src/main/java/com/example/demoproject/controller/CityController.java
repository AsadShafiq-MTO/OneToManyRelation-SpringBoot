package com.example.demoproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoproject.entities.City;
import com.example.demoproject.service.CityService;

//@Controller
@RestController
public class CityController {

	@Autowired
	private CityService cityService;
	
//	@RequestMapping("/Home")
//	private String classes()
//	{
//		return "Welcome";
//	}
	
	@GetMapping("/city")
	private List<City> getAll()
	{
		return cityService.getAll();
	}
	
	@GetMapping("/city/{id}")
	private City getbyId(@PathVariable int cityId)
	{
		return cityService.getbyId(cityId);
	}
	
	@PostMapping("/city")
	private City addCity(@RequestBody City city)
	{
		return cityService.update(city);
	}
	
	@PutMapping("/city/{id}")
	private City updateCity(@RequestBody City city,@PathVariable int cityId)
	{
		city.setCityId(cityId);
		return cityService.update(city);
	}
	@DeleteMapping("/city/{id}")
	private void deleteCity(@PathVariable int cityId)
	{
		 cityService.delete(cityId);
	}
	
	
	
	
	
	
	
	
	
	
}
