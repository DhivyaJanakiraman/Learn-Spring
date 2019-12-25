package com.dhivya.spring.basics.springlessons.basic.cdi;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringLessonsBasicCDIApplication {
	private static  Logger LOGGER = LoggerFactory.getLogger(SpringLessonsBasicCDIApplication.class);
	public static void main(String[] args) {

		try(AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringLessonsBasicCDIApplication.class)){
			SomeCDIBusiness cdiBusiness = applicationContext.getBean(SomeCDIBusiness.class);
			
			LOGGER.info("{} dao-{}", cdiBusiness, cdiBusiness.getSomeCdiDao());	
		}
		
		
	}

}
