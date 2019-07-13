package com.sparshGupta;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAppLiterals {
    public static void main(String[] args) {

        //initialise the context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve beans from the container
        CricketCoach cricketCoach = context.getBean("myCricketCoach", CricketCoach.class);

        //call methods
        System.out.println(cricketCoach.getDailyWorkout());
        System.out.println(cricketCoach.getDailyFortune());
        System.out.println(cricketCoach.getName());
        System.out.println(cricketCoach.getEmail());

        //close context
        context.close();
    }
}
