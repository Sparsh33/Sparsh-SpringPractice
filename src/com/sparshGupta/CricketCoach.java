package com.sparshGupta;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;
    private String name;
    private String email;

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public void setName(String name) {
        System.out.println("Inside name setter!");
        this.name = name;
    }

    public void setEmail(String email) {
        System.out.println("Inside email setter!");
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String getDailyWorkout() {
        return "Cricket is for lazy ass!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
