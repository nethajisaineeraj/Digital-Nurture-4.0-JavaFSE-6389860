package com.cognizant.spring_learn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cognizant.spring_learn.entities.Country;

@Service
public class CountryService {
	@Autowired
	@Qualifier("countryList")
	List<Country> countries;
	
	public Country getCountry(String code) {
		System.out.println(countries);
		Country matchedCountry = countries.stream().filter(
				eachCountry->eachCountry.getCode().equalsIgnoreCase(code)).findFirst().get();
		return matchedCountry;
	}
}
