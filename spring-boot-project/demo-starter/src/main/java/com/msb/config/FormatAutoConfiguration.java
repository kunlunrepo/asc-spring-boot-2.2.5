package com.msb.config;

import com.msb.service.FormatProcessor;
import com.msb.service.impl.JsonFormatProcessor;
import com.msb.service.impl.StringFormatProcessor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * description :
 *
 * @author kunlunrepo
 * date :  2023-07-05 15:42
 */
@Configuration
public class FormatAutoConfiguration {

	@ConditionalOnMissingClass("com.alibaba.fastjson.JSON")
	@Bean
	@Primary // 优先加载
	public FormatProcessor stringFormatProcessor() {
		return new StringFormatProcessor();
	}

	@ConditionalOnClass(name = "com.alibaba.fastjson.JSON")
	@Bean
	public FormatProcessor jsonFormatProcessor() {
		return new JsonFormatProcessor();
	}
}
