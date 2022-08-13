package com.luv2code.solution.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.ifapp.Coach;

public class MainDi {

	public static void main(String[] args) {
		
		
		// load spring configuration 
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("com/luv2code/solution/di/applicationContext.xml");
		
		// retrieve bean 
		Coach theCoach = context.getBean("myBasketCoach", BasketCoach.class);
		
		// call method 
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		// close 
		context.close();
		

	}

}
