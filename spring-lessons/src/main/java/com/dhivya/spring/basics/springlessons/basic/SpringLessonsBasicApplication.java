package com.dhivya.spring.basics.springlessons.basic;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.dhivya.spring.basics.springlessons.basic.BinarySearchImpl;

@Configuration
@ComponentScan("com.dhivya.spring.basics.springlessons.basic")
public class SpringLessonsBasicApplication {
	
	// what are the beans?
	// where are the beans?
	// what are the dependencies of a bean?

	public static void main(String[] args) {
		
//		BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
//		int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 3);
//		System.out.println(result);
		try(AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(SpringLessonsBasicApplication.class)){
			BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
			
			BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);
			
			System.out.println(binarySearch);
			System.out.println(binarySearch1);
			int result = binarySearch.binarySearch(new int[] {12,15, 20}, 3);
			System.out.println(result);
		}
		
//		applicationContext.close();
	}

}
