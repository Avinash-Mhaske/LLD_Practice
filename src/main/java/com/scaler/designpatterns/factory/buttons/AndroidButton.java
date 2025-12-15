package com.scaler.designpatterns.factory.buttons;

//1.4
public class AndroidButton implements Button{

    @Override
    public void click() {
        System.out.println("Android button clicking");
    }
}
