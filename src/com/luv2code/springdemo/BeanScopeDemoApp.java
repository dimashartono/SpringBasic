package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.ifapp.Coach;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		
		// load spring configuration file 
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanLifecyle-applicationContext.xml");
		
		// retrieve bean from spring container  
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		// call method daily  
		System.out.println(theCoach.getDailyWorkout());
		
		// close 
		context.close();

	}

}
