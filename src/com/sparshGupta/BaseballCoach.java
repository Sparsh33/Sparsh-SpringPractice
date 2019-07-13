package com.sparshGupta;

public class BaseballCoach implements Coach {

    private FortuneService fortuneService;

    public BaseballCoach (FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run 5 miles!";
    }

    @Override
    public String getDailyFortune() {
        //coach needs a helper so it is being used here
        return fortuneService.getFortune();
    }

}
