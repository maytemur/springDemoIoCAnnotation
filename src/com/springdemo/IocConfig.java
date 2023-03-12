package com.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.springdemo")
//Main java dosyasında Xml yerine artık bu class!ı kullanacağımızı bildirmemiz gerekiyor
@PropertySource("classpath:values.properties")
public class IocConfig {
	@Bean
	public ICustomerDal database() {
		return new MySqlCustomerDal();
	}
	@Bean
	public ICustomerService service() {
		return new CustomerManager(database());
	}

}