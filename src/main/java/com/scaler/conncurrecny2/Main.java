package com.scaler.conncurrecny2;

import com.scaler.conncurrecny1.HelloWorldPrinter;

public class Main {

    public static void main(String[] args) {

        for (int i=1; i<=100; i++){
            NumberPrinter numberPrinter = new NumberPrinter(i);
            Thread thread1 = new Thread(numberPrinter); // Step 2/3:create thread and assigned the task. This will create 100 threads
            thread1.start(); // step 4: start the thread
//      Execute and see the result: 100 threads are printing the numbers 1 to 100
//      Also the sequence is random : because we can not control the CPU thread execution sequence.
        }
    }
}
