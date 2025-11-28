package com.scaler.introtosemaphore.producerconsumerusingsemaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable {

    private Queue<Object> store;
    private  int maxSize;
    private String name;
    Semaphore producerSemaphore;
    Semaphore consumerSemaphore;

    Producer(Queue<Object> store, int maxSize, String name,  Semaphore producerSemaphore, Semaphore consumerSemaphore){
        this.store=store;
        this.maxSize=maxSize;
        this.name=name;
        this.consumerSemaphore=consumerSemaphore;
        this.producerSemaphore=producerSemaphore;
    }

    @Override
    public void run() {
        while(true) {
            try {
                producerSemaphore.acquire(); // if the producerSemaphore > 0 then only it will enter.
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
                System.out.println(name+" is producing the shirt. Size of the store is : "+store.size());
                store.add(new Object());
                consumerSemaphore.release();// notify the consumer
            }
    }
}
