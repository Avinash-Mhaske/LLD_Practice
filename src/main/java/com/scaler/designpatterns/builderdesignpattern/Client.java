package com.scaler.designpatterns.builderdesignpattern;

public class Client {

    public static void main(String[] args) {
        Builder builder = new Builder(); //created a helper class named builder class and set all the values.
        builder.setName("Avinash");
        builder.setAge(25);
        builder.setUnivName("pune");
        builder.setPsp(71.0);
        builder.setBatch("Feb2023");
        builder.setGradYear(2015);
        builder.setPhoneNumber("9999999999");

        Student student=new Student(builder);

        System.out.println("Debug");

    }
}
