package com.luv2code.springdemo;

public class FootballCoach implements Coach {
	
	private FortuneService fortuneService;
	

	public FootballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Shoot the ball to terget every minutes";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}
	
	

}
