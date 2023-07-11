package com.msb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CloudApp {

	private static final Logger log = LoggerFactory.getLogger(CloudApp.class);


	public static void main(String[] args) {
		SpringApplication.run(CloudApp.class);
	}
}