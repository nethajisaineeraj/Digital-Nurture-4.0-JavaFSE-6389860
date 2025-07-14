package com.cognizant.orm_learn.service;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cognizant.orm_learn.model.Country;

@SpringBootTest
class CountryServiceTest {
	
	@Autowired
	private CountryService countryService;
	
	@Test
	void findByCodeMethod(){
		String code = "XY";
		Country country= countryService.getCountryByCode(code);
		System.out.println(country);
	}

	@Test
	void addCountrymethod() {
		Country country = new Country();
		country.setCode("XY");
		country.setName("ABCD");
		countryService.addCountry(country);
	}
	
	@Test
	void updateCountrymethod() {
		Country country = countryService.getCountryByCode("XY");
		country.setName("EFGHI");
		countryService.updateCountry(country);
	}
	
	@Test
	void deleteCountryByIdMethod() {
		String code = "XY";
		countryService.deleteCountry(code);
		System.out.println("Country Deleted Successfully......");
	}
	
	@Test
	void findCountriesLikeMethod() {
		String name = "Ma";
		List<Country> countries = countryService.getCountriesLike(name);
		
		countries.forEach(eachCountry -> {
			System.out.println(eachCountry);
		});
	}
	
}
























