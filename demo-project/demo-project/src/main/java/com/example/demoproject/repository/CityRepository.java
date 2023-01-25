package com.example.demoproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demoproject.entities.City;

@Repository
public interface CityRepository extends JpaRepository<City,Integer> {

}
