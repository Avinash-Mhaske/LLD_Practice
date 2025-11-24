package com.scaler.conncurrecny2;

import com.scaler.conncurrecny1.HelloWorldPrinter;

public class Main {

    public static void main(String[] args) {

        for (int i=1; i<=100; i++){
            NumberPrinter numberPrinter = new NumberPrinter(i);
            Thread thread1 = new Thread(numberPrinter); // Step 2/3:created threaded and assigned the task
            thread1.start(); // step 4: start the thread
        }

    }
}
