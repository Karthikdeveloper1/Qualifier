package com.autowire_byConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("autowire_byConstructor.xml");
        Car myCar= (Car) context.getBean("myCar");
        myCar.dispalyDetails();
    }
}
