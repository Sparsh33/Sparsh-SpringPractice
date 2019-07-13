package com.sparshGupta;

public class HappyFortuneService implements FortuneService {

    public HappyFortuneService() {
        System.out.println("Inside HappyFortuneService Constructor!");
    }

    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }

}

