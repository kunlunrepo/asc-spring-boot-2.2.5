package com.msb;

import com.msb.anno.EnableDefineService;
import com.msb.config.MyDefineImportSelector;
import com.msb.service.CacheService;
import com.msb.service.LoggerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * description :
 *
 * @author kunlunrepo
 * date :  2023-07-05 09:59
 */
@SpringBootApplication
@EnableDefineService(packages = {"com.msb.service.CacheService","com.msb.service.LoggerService"})
public class EnableDemoTest {

	private static final Logger log = LoggerFactory.getLogger(MyDefineImportSelector.class);

	public static void main(String[] args) {
		ConfigurableApplicationContext ca = SpringApplication.run(EnableDemoTest.class, args);
		log.info("【Bean】--- {}", ca.getBean(CacheService.class));
		log.info("【Bean】--- {}", ca.getBean(LoggerService.class));
	}
}
