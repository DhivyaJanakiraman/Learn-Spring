package com.dhivya.spring.basics.componentscan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringLessonsComponentApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringLessonsComponentApplication.class);
	public static void main(String[] args) {
	
		try(AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringLessonsComponentApplication.class)){
			ComponentPersonDAO componentPersonDAO = applicationContext.getBean(ComponentPersonDAO.class);
			
			LOGGER.info("Test");
			LOGGER.info("{}", componentPersonDAO);	
		}
		
	} 

}
