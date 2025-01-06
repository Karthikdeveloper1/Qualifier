package com.componentandcomponentScan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("component&componentscan.xml");
        Employee employee=context.getBean("employee", Employee.class);
        // instead typecasting employee like shown below we can write like this also
       // Employee employee=(Employee) context.getBean("employee");
        System.out.println(employee.toString());
    }
}
