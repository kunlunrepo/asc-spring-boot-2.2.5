package com.msb.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description :
 *
 * @author kunlunrepo
 * date :  2023-07-07 18:07
 */
@RestController
public class UserController {

	@Value("${bobo.user.name}")
	private String userName;

	@Value("${bobo.user.age}")
	private Integer userAge;

	@Value("${spring.application.name}")
	private String appName;

	@GetMapping("/query")
	public String query() {
		return userName + ":" + userAge + ":" + appName;
	}

}
