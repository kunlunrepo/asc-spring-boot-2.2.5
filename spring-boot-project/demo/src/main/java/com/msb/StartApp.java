package com.msb;

import com.msb.anno.EnableDefineService;
import com.msb.spi.BaseData;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Iterator;
import java.util.ServiceLoader;

@SpringBootApplication
@EnableDefineService(name="msb")
public class StartApp {
	public static void main(String[] args) {

		spiTest();

		SpringApplication.run(StartApp.class);
		System.out.println("【demo】已启动");
	}

	// spi测试
	private static void spiTest() {
		System.out.println("====================SPI开始=================");
		ServiceLoader<BaseData> providers = ServiceLoader.load(BaseData.class);
		Iterator<BaseData> iterator = providers.iterator();
		while (iterator.hasNext()) {
			BaseData next = iterator.next();
			next.baseURL();
		}
		System.out.println("====================SPI结束=================");
	}
}