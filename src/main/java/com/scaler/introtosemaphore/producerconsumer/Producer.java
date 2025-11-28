package com.scaler.introtosemaphore.producerconsumer;

import java.util.Queue;

public class Producer implements Runnable {

    private Queue<Object> store;
    private  int maxSize;
    private String name;

    Producer(Queue<Object> store, int maxSize, String name){
        this.store=store;
        this.maxSize=maxSize;
        this.name=name;
    }

    @Override
    public void run() {
        while(true) {
            if (store.size() < maxSize) {
                System.out.println(name+" is producing the shirt. Size of the store is : "+store.size());
                store.add(new Object());
            }
        }
        // Reason for adding the while loop: If we have only one producer,
        // then we can not fill all the 6 empty slots, coz if condition will execute only once.
        // Now this while loop will make sure that the if condition is checked till all slots are filled
    }
}
