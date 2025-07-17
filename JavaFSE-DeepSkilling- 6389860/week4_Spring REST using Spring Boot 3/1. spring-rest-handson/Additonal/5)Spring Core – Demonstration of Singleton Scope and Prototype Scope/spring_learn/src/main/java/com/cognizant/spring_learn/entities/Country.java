package com.cognizant.spring_learn.entities;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country {
	private static final Logger LOGGER = LoggerFactory.getLogger(Country.class);
	private String code;
	private String name;

	public Country() {
		super();
		LOGGER.debug("Inside Country Constructor.");
		// TODO Auto-generated constructor stub
	}
	public String getCode() {
		LOGGER.debug("Inside getCode()");
		return code;
	}
	public void setCode(String code) {
		LOGGER.debug("Inside setCode() - Setting code to {}", code);
		this.code = code;
	}
	public String getName() {
		LOGGER.debug("Inside getName()");
		return name;
	}
	public void setName(String name) {
		LOGGER.debug("Inside setName() - Setting name to {}", name);
		this.name = name;
	}
	@Override
	public String toString() {
		return "Country [code=" + code + ", name=" + name + "]";
	}
	
}
