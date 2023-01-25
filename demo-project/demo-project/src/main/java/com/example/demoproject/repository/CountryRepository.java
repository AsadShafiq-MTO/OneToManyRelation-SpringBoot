package com.example.demoproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demoproject.entities.Country;

public interface CountryRepository extends JpaRepository<Country, Integer> {

	
}
