package com.springlifecycle;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration  // remove or comment it when you are using annotation based config because there also we have use @configuration annotation
public class AppConfig {
	
	
	@Bean
	Allocator allocator(){
	return new Manager();  // Its returning Manager object where bean name as "manager"
	}
	
	@Bean
	Delegate delegate(Allocator allocator)
	{
		//Spring will inject the Allocator bean here (manager)
	return new Delegate(allocator);
	}
	


}