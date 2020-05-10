package com.ps.springdemo;

public class TrackCoach implements Coach {

	// define a private field for the dependency
	private FortuneService fortuneService;
	
	public TrackCoach() {}
	
	// define a constructor for dependency injection
	public TrackCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run a hard 10km";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it: " + fortuneService.getFortune();
	}

	// add an init method
	public void doMyStartup() {
		System.out.println("TrackCoach: inside doMyStartup method");
	}
	
	// add a destroy method
	public void doMyCleanup() {
		System.out.println("TrackCoach: inside doMyCleanup method");
	}
	
}
