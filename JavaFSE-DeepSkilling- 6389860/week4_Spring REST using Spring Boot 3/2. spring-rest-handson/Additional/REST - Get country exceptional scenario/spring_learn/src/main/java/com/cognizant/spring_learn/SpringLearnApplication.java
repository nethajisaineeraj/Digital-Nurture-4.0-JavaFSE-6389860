package com.cognizant.spring_learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;


@ImportResource("classpath:country.xml")
@SpringBootApplication
public class SpringLearnApplication {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

//	public static void displayCountry() {
//		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
//		Country country = context.getBean("country", Country.class);
//		LOGGER.debug("Country : {}", country.toString());
//		Country anotherCountry = context.getBean("country", Country.class);
//		LOGGER.debug("Another Country : {}", anotherCountry.toString());
//	}
	
//	public static void displayCountries() {
//	    ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
//	    List<Country> countries = (List<Country>) context.getBean("countryList");
//	    LOGGER.debug("Country List: {}", countries);
//	}

	public static void main(String[] args) {
		SpringApplication.run(SpringLearnApplication.class, args);
		LOGGER.info("Inside main");
		//displayCountry();
		//displayCountries();
		
	}

}














