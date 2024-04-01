package com.api.rest;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class ApirestJavaApplication {
	private static Logger logger= LoggerFactory.getLogger(ApirestJavaApplication.class);
	public static void main(String[] args) {

		SpringApplication.run(ApirestJavaApplication.class, args);
		logger.debug("Mi mensaje debug");
		logger.info("Mi mensaje info");
		logger.warn("mi mensaje warning");
	}

}
