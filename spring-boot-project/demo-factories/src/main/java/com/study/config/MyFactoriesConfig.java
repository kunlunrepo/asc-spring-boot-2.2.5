package com.study.config;

import com.study.bean.MyFactories;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * description :
 *
 * @author kunlunrepo
 * date :  2023-07-05 14:21
 */
@Configuration
public class MyFactoriesConfig {

	@Bean
	public MyFactories myFactories() {
		return new MyFactories();
	}
}
