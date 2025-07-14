package com.cognizant.orm_learn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.repository.CountryRepository;

import jakarta.transaction.Transactional;

@Service
public class CountryService  {
	
	@Autowired
	private CountryRepository countryRepo;
	
	@Transactional
	public List<Country> getAllCountries(){
		List<Country> countries = countryRepo.findAll();
		return countries;
	}
	
	@Transactional
	public Country getCountryByCode(String code) {
		Country country = countryRepo.findById(code).get();
		return country;
	}
	
	@Transactional
	public void addCountry(Country country) {
		countryRepo.save(country);
		return ;
	}
	
	@Transactional
	public void updateCountry(Country updatedCountry) {
		countryRepo.save(updatedCountry);
		return ;
	}
	
	@Transactional
	public void deleteCountry(String code) {
		countryRepo.deleteById(code);
		return ;
	}
	
	@Transactional
	public List<Country> getCountriesLike(String name){
		List<Country> countries = countryRepo.findByNameLike(name+"%");
		return countries;
	}
	
	
}























