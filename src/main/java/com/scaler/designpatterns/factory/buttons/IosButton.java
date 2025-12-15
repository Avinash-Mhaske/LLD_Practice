package com.scaler.designpatterns.factory.buttons;

//1.5
public class IosButton implements Button{

    @Override
    public void click() {
        System.out.println("Clicking Ios button");
    }
}
