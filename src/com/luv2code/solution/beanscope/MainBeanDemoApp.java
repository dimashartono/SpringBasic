package com.luv2code.solution.beanscope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.ifapp.Coach;

public class MainBeanDemoApp {

	public static void main(String[] args) {
		
		
		// load spring configuration 
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("com/luv2code/solution/beanscope/beanScope-applicationContext.xml");
		
		// retrieve bean 
		Coach theCoach = context.getBean("myBasketCoach", BasketCoach.class);
		
		Coach secondCoach = context.getBean("myBasketCoach", BasketCoach.class);
		
		// prototype check 
		boolean result = theCoach == secondCoach;
		
		// print result 
		System.out.println("Result : " + result);
		
		// close 
		context.close();
		

	}

}
