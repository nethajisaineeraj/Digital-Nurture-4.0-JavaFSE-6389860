package com.cognizant.spring_learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.spring_learn.entities.Country;



@SpringBootApplication
public class SpringLearnApplication {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);
	
//	public static void displayDate() {
//		LOGGER.info("START");
//		AbstractApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");
//		SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);
//		try {
//			Date parsedDate = format.parse("31/12/2018");
//			LOGGER.debug(parsedDate.toString());
//			System.out.println(parsedDate);
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println("Error occured: "+e.getMessage());
//		}
//		LOGGER.info("END");
//	}
	
	public static void displayCountry() {
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		Country country = context.getBean("country", Country.class);
		LOGGER.debug("Country : {}", country.toString());
	}
	

	public static void main(String[] args) {
		SpringApplication.run(SpringLearnApplication.class, args);
		LOGGER.info("Inside main");
		//displayDate();
		displayCountry();
	}

}

