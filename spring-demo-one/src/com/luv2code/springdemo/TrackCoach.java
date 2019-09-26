package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}
	
	//Define a constructor for dependency injection
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
		
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes running";
	}

	@Override
	public String getDailyFortune() {
		//Use my FortuneService to a fortune
		return fortuneService.getFortune();
	}
	
	//Init Method
	public void doMyStartupStuff() {
		System.out.println("Do startup stuff");
	}
	
	//Destroy Method
	public void doMyDestroyStuff() {
		System.out.println("Do destroy stuff");
	}
}
