package com.cognizant.spring_learn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.spring_learn.entities.Country;
import com.cognizant.spring_learn.service.CountryService;
import com.cognizant.spring_learn.service.exception.CountryNotFoundException;

@RestController
public class CountryController {
	
	@Autowired
	@Qualifier("in")
	Country india;
	
	@Autowired
	@Qualifier("countryList")
	List<Country> countries;
	
	@Autowired
	CountryService countryService;
	
	@RequestMapping(value="/country", method=RequestMethod.GET)
	public Country getCountryIndia() {
		return india;
	}
	
	@RequestMapping(value="/countries", method = RequestMethod.GET)
	public List<Country> getAllCountries(){
		return countries;
	}
	
	@GetMapping("/countries/{code}")
	public Country getCountry(@PathVariable String code) throws CountryNotFoundException {
		Country matchedCountry = countryService.getCountry(code);
		return matchedCountry;
	}
}


















