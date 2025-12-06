package com.scaler.designpatterns.builderdesignpattern;

public class Student {
    String name;
    int age;
    String univName;
    double psp;
    String batch;
    int gradYear;
    String phoneNumber;

    public Student(Builder builder){
        //validations start
        if(builder.getAge() < 20){
            throw new RuntimeException("Age should not be less than 20");
        }
        if(builder.getPsp() < 72.0){
            throw new RuntimeException("psp should not be less than 72.0");
        }
        //All other validations will come here one by one
        //once all validations are passed we set the student object value
        this.name=builder.getName();
        this.age=builder.getAge();
        this.gradYear= builder.getGradYear();
        //all attributes should come here.
    }
}
