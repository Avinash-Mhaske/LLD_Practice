package com.scaler.introtosemaphore.producerconsumermutex;

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
            synchronized (store) {//lock
                if (store.size() > 0) {
                    System.out.println(name + " is consuming the shirt. Size of the store is : " + store.size());
                    store.remove();
                }
            }//release the lock
        }
    }
}
