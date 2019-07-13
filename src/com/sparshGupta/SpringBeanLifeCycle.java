package com.sparshGupta;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBeanLifeCycle {
    public static void main(String[] args) {

        //Initialize the context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //Retrieve beans from the container
        MyBeanClass bean = context.getBean("myBean", MyBeanClass.class);

        //calling bean methods

        //close the context
        context.close();
    }
}
