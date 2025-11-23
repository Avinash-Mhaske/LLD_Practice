package com.scaler.conncurrecny1;

public class HelloWorldPrinter implements Runnable{
    //After we implement the Runnable interface
    // java will understand that this class will run on a new theread

    @Override
    public void run() {
        System.out.println("Hello world! is printed by : " + Thread.currentThread().getName());

    }



}
