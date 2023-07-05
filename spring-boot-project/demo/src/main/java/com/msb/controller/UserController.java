package com.msb.controller;

import com.msb.bean.HelloFormatTemplate;
import com.msb.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description :
 *
 * @author kunlunrepo
 * date :  2023-07-05 16:12
 */
@RestController
public class UserController {

	@Autowired
	private HelloFormatTemplate helloFormatTemplate;

	@GetMapping("/format")
	public String format() {
		User user = new User();
		user.setName("BoBo");
		user.setAge(18);
		return helloFormatTemplate.doFormat(user);
	}
}
