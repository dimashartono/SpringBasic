package com.luv2code.solution.beanscope;

import java.util.Random;

import com.luv2code.ifapp.FortuneService;

public class RandomFortuneService implements FortuneService {
	
	
	private String[] fortune = {
			"Good luck!",
			"Come on bro!",
			"Never give up!"
	};
	
	private Random random = new Random();

	@Override
	public String getFortune() {
		
		int index = random.nextInt(fortune.length);
		return fortune[index];
	}

}
