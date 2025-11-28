package com.scaler.introtosemaphore.producerconsumerusingsemaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{

    private Queue<Object> store;
    private  int maxSize;
    private String name;
    Semaphore producerSemaphore;
    Semaphore consumerSemaphore;

    Consumer(Queue<Object> store, int maxSize, String name,  Semaphore producerSemaphore, Semaphore consumerSemaphore){
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
                consumerSemaphore.acquire(); // if the consumerSemaphore > 0 then only it will enter.
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(name+" is consuming the shirt. Size of the store is : "+store.size());
            store.remove();
            producerSemaphore.release();
        }
        }
}
