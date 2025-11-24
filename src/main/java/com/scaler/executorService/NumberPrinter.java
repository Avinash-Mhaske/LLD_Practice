package com.scaler.executorService;

public class NumberPrinter implements Runnable {
    //Problem statement: Print nos.from 1 to 100 each from a separate thread

    private int number;

    NumberPrinter(int number){
        this.number=number;
    }

    @Override
    public void run() {
        System.out.println("number "+ number+" is printed by : " + Thread.currentThread().getName());
//         below try catch is added to see the queue size. uncomment it when you reach the Main class debug condition for 5 10 50 and 99.
//        try {
//            Thread.sleep(10000);
//        }
//        catch (InterruptedException e){
//            throw new RuntimeException(e);
//        }
    }



}
