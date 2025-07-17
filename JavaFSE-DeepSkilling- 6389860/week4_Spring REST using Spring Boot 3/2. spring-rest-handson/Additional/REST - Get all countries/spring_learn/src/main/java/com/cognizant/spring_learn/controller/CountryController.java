package com.cognizant.spring_learn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.spring_learn.entities.Country;

@RestController
public class CountryController {
	
	@Autowired
	@Qualifier("in")
	Country india;
	
	@Autowired
	@Qualifier("countryList")
	List<Country> countries;
	
	@RequestMapping(value="/country", method=RequestMethod.GET)
	public Country getCountryIndia() {
		return india;
	}
	
	@RequestMapping(value="/countries", method = RequestMethod.GET)
	public List<Country> getAllCountries(){
		return countries;
	}
}


















