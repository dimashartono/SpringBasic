package com.luv2code.springdemo;

import com.luv2code.ifapp.FortuneService;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your lucky day!";
	}

}
