package com.msb.config;

import com.msb.bean.HelloFormatTemplate;
import com.msb.properties.HelloProperties;
import com.msb.service.FormatProcessor;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * description :
 *
 * @author kunlunrepo
 * date :  2023-07-05 15:55
 */
@Configuration
@Import(FormatAutoConfiguration.class)
@EnableConfigurationProperties(HelloProperties.class)
public class HelloAutoConfiguration {

	@Bean
	public HelloFormatTemplate helloFormatTemplate(HelloProperties helloProperties, FormatProcessor formatProcessor){
		return new HelloFormatTemplate(helloProperties, formatProcessor);
	}
}
