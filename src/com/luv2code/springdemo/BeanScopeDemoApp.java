package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.ifapp.Coach;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		
		// load spring configuration file 
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScrope-applicationContext.xml");
		
		// retrieve bean from spring container  
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach aplhaCoach = context.getBean("myCoach", Coach.class);
		
		// check if are they same 
		boolean result = (theCoach == aplhaCoach);
		
		// print result 
		System.out.println("Pointing to the same object: " + result);
		
		System.out.println("Memory location for theCoach: " + theCoach);
		
		System.out.println("Memory location for aplhaCoach: " + aplhaCoach);
		
		// close 
		context.close();

	}

}
