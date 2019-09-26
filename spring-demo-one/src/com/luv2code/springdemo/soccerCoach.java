package com.luv2code.springdemo;

public class soccerCoach implements Coach{
	private FortuneService fortuneService;
	
	//Define a constructor for dependency injection
	public soccerCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes kicking a ball";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it" + fortuneService.getFortune();
	}
}
