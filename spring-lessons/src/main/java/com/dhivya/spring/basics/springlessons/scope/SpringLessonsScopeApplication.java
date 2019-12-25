package com.dhivya.spring.basics.springlessons.scope;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringLessonsScopeApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringLessonsScopeApplication.class);
	public static void main(String[] args) {
	
		try(AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringLessonsScopeApplication.class)){
			PersonDAO personDao = applicationContext.getBean(PersonDAO.class);
			PersonDAO personDao2 = applicationContext.getBean(PersonDAO.class);
		
			LOGGER.info("{}", personDao);
			LOGGER.info("{}", personDao.getJdbcConnection());
			
			LOGGER.info("{}", personDao2);
			LOGGER.info("{}", personDao2.getJdbcConnection());
		}
		
	} 

}
