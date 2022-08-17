package com.luv2code.solution.beanscope;

import org.springframework.beans.factory.DisposableBean;

import com.luv2code.ifapp.Coach;
import com.luv2code.ifapp.FortuneService;

public class BasketCoach implements Coach, DisposableBean {
	
	
	private FortuneService fortuneService;
	

	public BasketCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Dribble your ball!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Basket Coach: Call destroy method");
	}
	
	
	// initialize method 
	public void myStartupStuff() {
		System.out.println("Basket Coach: Call init method");
	}
}
