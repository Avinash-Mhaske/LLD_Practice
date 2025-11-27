package com.scaler.synchronization.adderSubtractorMutex;

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
            lock.lock();
            count.value +=1; //this part updates the shared resource and hence it has to be in the critical section.
            lock.unlock();
        }

    }
}
