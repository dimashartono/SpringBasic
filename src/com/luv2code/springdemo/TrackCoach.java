package com.luv2code.springdemo;

import com.luv2code.ifapp.Coach;
import com.luv2code.ifapp.FortuneService;

public class TrackCoach implements Coach {
	
	
	private FortuneService fortuneService;

	public TrackCoach() {
		
	}

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Come on "+ fortuneService.getFortune();
	}
	
	
	// add initialization method 
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside mothod doMyStartupStuff");
	}
	
	// add destroy method
	public void doMyCelanupStuff() {
		System.out.println("TrackCoach: inside method doMyCelanupStuff");
	}

}
