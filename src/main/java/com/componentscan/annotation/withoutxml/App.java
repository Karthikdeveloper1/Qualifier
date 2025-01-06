package com.componentscan.annotation.withoutxml;

//import com.componentandcomponentScan.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
        // for component configuration without using xml
        // we write AnnotationConfigApplicationContext((AppConfig.class) (AppConfig is a class where we do
        // configuration instead of xml)) instead of ClassPathXmlApplicationContext
        Employee employee=context.getBean("employee",Employee.class);
        System.out.println(employee.toString());
    }
}
