package com.scaler.synchronization.addersubtractorsynchronized;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable{

    private Count count;
    private Lock lock;

    Adder(Count count, Lock lock){
        this.count=count;
        this.lock=lock;
    }

    @Override
    public void run() {

        for (int i=1;i<=10000;i++){
            synchronized (Count.class){ // this line is similar to lock.lock();
                count.value +=i;
            }// this (closing braces) line is similar to lock.unlock();
        }

    }
}
