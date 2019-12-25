package com.dhivya.spring.basics.springlessons.properties;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.dhivya.spring.basics.springlessons.basic.BinarySearchImpl;

@Configuration
@ComponentScan("com.dhivya.spring.basics.springlessons.properties")
//app.properties
@PropertySource("classpath:app.properties")
public class SpringLessonsPropertiesApplication {
	
	public static void main(String[] args) {
	
		try(AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(SpringLessonsPropertiesApplication.class)){
			SomeExternalService service = applicationContext.getBean(SomeExternalService.class);
			
			System.out.println(service.returnServiceUrl());
		}
		
//		applicationContext.close();
	}

}
