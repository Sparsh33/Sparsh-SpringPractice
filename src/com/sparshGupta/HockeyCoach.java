package com.sparshGupta;

public class HockeyCoach implements Coach {

    private FortuneService fortuneService;

    public HockeyCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return  "Run 10 miles!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
