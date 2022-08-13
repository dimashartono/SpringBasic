package com.luv2code.solution.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.ifapp.Coach;

public class MainIoc {

	public static void main(String[] args) {
		
		// load spring configuration file 
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("com/luv2code/solution/ioc/applicationContext.xml");
		
		// retrieve bean from spring container 
		Coach theCoach = context.getBean("myFootballCoach", FootballCoach.class);
		
		// call method on the bean 
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		// close the context 
		context.close();
		
	}

}
