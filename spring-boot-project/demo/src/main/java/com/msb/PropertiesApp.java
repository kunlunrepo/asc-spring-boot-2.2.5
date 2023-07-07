package com.msb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * description :
 *
 * @author kunlunrepo
 * date :  2023-07-07 16:22
 */
@SpringBootApplication
public class PropertiesApp {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(PropertiesApp.class, args);

	}
}
