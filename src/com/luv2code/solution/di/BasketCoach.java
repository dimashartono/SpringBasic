package com.luv2code.solution.di;

import com.luv2code.ifapp.Coach;
import com.luv2code.ifapp.FortuneService;

public class BasketCoach implements Coach {
	
	
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
	
	
	

}
