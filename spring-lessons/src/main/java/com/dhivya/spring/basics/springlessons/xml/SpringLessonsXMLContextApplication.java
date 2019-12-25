package com.dhivya.spring.basics.springlessons.xml;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringLessonsXMLContextApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringLessonsXMLContextApplication.class);
	public static void main(String[] args) {
		
		try(ClassPathXmlApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml")){
			
			LOGGER.info("Beans loaded - {} ", (Object)applicationContext.getBeanDefinitionNames());
			
			XMLPersonDAO personDao = applicationContext.getBean(XMLPersonDAO.class);
			LOGGER.info("{} {}",personDao, personDao.getXMLJdbcConnectionn());
		}
		
//		applicationContext.close();
	}

}
