package com.luv2code.springdemo;

public class BaseballCoach implements Coach{	
	//Define private field for the dependency
	private FortuneService fortuneService;
	
	//Define a constructor for dependency injection
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practise";
	}

	@Override
	public String getDailyFortune() {
		//Use my FortuneService to a fortune
		return fortuneService.getFortune();
	}
}
