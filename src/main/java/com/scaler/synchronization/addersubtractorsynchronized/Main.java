package com.scaler.synchronization.addersubtractorsynchronized;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Count count=new Count();
        Lock lock=new ReentrantLock(); //ReentrantLock is most used type of Lock.

        Adder adder = new Adder(count, lock);
        Subtractor subtractor = new Subtractor(count, lock);

        Thread t1=new Thread(adder);
        Thread t2=new Thread(subtractor);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("count : " +count.value);

//  Note:As we are using lock here we will always get a '0' output.

    }
}
