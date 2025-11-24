package com.scaler.conncurrecny2;

public class NumberPrinter implements Runnable {
    //Problem statement: Print nos.from 1 to 100 each from a separate thread

    private int number;

    NumberPrinter(int number){
        this.number=number;
    }

    @Override
    public void run() {
        System.out.println("number "+ number+" is printed by : " + Thread.currentThread().getName());

    }



}
