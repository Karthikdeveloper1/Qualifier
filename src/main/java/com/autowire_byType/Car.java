package com.autowire_byType;

public class Car {
    private Specification specification;

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    public void dispalyDetails(){
        System.out.println("Car Details : "+specification.toString());
    }
}
