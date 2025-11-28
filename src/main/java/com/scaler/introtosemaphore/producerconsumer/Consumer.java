package com.scaler.introtosemaphore.producerconsumer;

import java.util.Queue;

public class Consumer implements Runnable{

    private Queue<Object> store;
    private  int maxSize;
    private String name;

    Consumer(Queue<Object> store, int maxSize, String name){
        this.store=store;
        this.maxSize=maxSize;
        this.name=name;
    }

    @Override
    public void run() {
        while(true) {
            if (store.size() > 0) {
                System.out.println(name+" is consuming the shirt. Size of the store is : "+store.size());
                store.remove();
            }
        }
        // Reason for adding the while loop: If we have only one consumer,
        // then we can not empty all the 6 empty slots, coz if condition will execute only once.
        // Now this while loop will make sure that the if condition is checked till consumer consumes the filled slots
    }
}
