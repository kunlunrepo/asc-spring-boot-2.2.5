package com.msb;

import com.msb.config.MyDefineImportSelector;
import com.msb.event.MyEvent;
import com.study.bean.MyFactories;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * description :
 *
 * @author kunlunrepo
 * date :  2023-07-05 14:29
 */
@SpringBootApplication
public class FactoriesApp {

	private static final Logger log = LoggerFactory.getLogger(FactoriesApp.class);


	public static void main(String[] args) {
		ConfigurableApplicationContext ac = SpringApplication.run(FactoriesApp.class, args);
		// 获取factories的bean
		MyFactories myFactories = ac.getBean(MyFactories.class);
		log.info(myFactories.study());
		ac.publishEvent(new MyEvent(new Object()));
	}
}
