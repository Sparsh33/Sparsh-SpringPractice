package com.sparshGupta;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {

    public static void main(String[] args) {

        //initialise the context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");


        //retrieve the bean
        Coach coach = context.getBean("myCoach", Coach.class);
        //Coach coach = context.getBean("myCoach", Coach.class);


        //call bean methods
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());


        //close the context
        context.close();
    }
}
