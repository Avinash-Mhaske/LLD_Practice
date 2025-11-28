package com.scaler.introtosemaphore.producerconsumermutex;

import java.util.ArrayDeque;
import java.util.Queue;

public class Client {

    public static void main(String[] args) throws InterruptedException {
        Queue<Object> store = new ArrayDeque<>();
        int maxSize = 6;

        Producer p1 = new Producer(store, maxSize, "p1");
        Producer p2 = new Producer(store, maxSize, "p2");
        Producer p3 = new Producer(store, maxSize, "p3");
        Producer p4 = new Producer(store, maxSize, "p4");
        Producer p5 = new Producer(store, maxSize, "p5");
        Producer p6 = new Producer(store, maxSize, "p6");

        Consumer c1=new Consumer(store, maxSize, "c1");
        Consumer c2=new Consumer(store, maxSize, "c2");
        Consumer c3=new Consumer(store, maxSize, "c3");
        Consumer c4=new Consumer(store, maxSize, "c4");
        Consumer c5=new Consumer(store, maxSize, "c5");

//6 threads created for 6 producers and 5 threads for 5 consumers running parallely
        Thread t1=new Thread(p1);
        t1.start();
        Thread t2=new Thread(p2);
        t2.start();
        Thread t3=new Thread(p3);
        t3.start();
        Thread t4=new Thread(p4);
        t4.start();
        Thread t5=new Thread(p5);
        t5.start();
        Thread t6=new Thread(p6);
        t6.start();

        Thread t7=new Thread(c1);
        t7.start();
        Thread t8=new Thread(c2);
        t8.start();
        Thread t9=new Thread(c3);
        t9.start();
        Thread t10=new Thread(c4);
        t10.start();
        Thread t11=new Thread(c5);
        t11.start();
    }
//    Result after 1st execution : In some places we can see that the store size is 7/0, which is greater than the maxSize. Also, noSuchElementException can be seen
//    Reason: If 2 producer and consumer try to access the respective if condition and find that the condition is true
//            Both the producer and consumer will add or remove the object, resulting in incorrect data (o/p) and sync problem.

//    Now add the synchronized in both Producer and consumer and execute main method
//    we will never get an exception, and it will infinitely keep executing.

}
