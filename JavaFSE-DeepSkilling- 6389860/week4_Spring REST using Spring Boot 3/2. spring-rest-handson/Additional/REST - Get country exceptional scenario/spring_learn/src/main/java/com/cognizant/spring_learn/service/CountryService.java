package com.cognizant.spring_learn.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cognizant.spring_learn.entities.Country;
import com.cognizant.spring_learn.service.exception.CountryNotFoundException;

@Service
public class CountryService {
	@Autowired
	@Qualifier("countryList")
	List<Country> countries;
	
	public Country getCountry(String code) throws CountryNotFoundException {
		try {
			Country matchedCountry = countries.stream().filter(
					eachCountry->eachCountry.getCode().equalsIgnoreCase(code)).findFirst().get();
			return matchedCountry;
		} catch (NoSuchElementException e) {
			throw new CountryNotFoundException("Country not found: " + code);
		} catch (Exception e) {
			throw new CountryNotFoundException("Unexpected error while retrieving country");
		} 
	} 
}
