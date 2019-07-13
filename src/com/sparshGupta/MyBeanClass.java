package com.sparshGupta;

public class MyBeanClass {

    MyBeanClass() {
        System.out.println("Inside the MyBeanClass.");
    }

    public void initializeMyBean() {
        System.out.println("Bean has been initialized!");
    }

    public void destroyMyBean() {
        System.out.println("Bean has been destroyed!");
    }

}
