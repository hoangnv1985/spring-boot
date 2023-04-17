package com.example.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootOneToManyApplication {
	private static final Logger logger = LogManager.getLogger(SpringBootOneToManyApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootOneToManyApplication.class, args);
		logger.info("Finish start up");
	}

}
