package com.luv2code.solution.ioc;

import com.luv2code.ifapp.Coach;

public class FootballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Dibble every time in everywhere!";
	}

	@Override
	public String getDailyFortune() {
		return "Tomorrow is your lucky day!";
	}

}
