package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.ifapp.Coach;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		// load the spring configuration file 
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container 
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		// call method the bean 
		System.out.println(theCoach.getDailyWorkout());
		
		// call fortune 
		System.out.println(theCoach.getDailyFortune());
		
		// close context 
		context.close();

	}

}
