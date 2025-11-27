package com.scaler.synchronization.adderSubtractor;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Count count=new Count();

        Adder adder = new Adder(count);
        Subtractor subtractor = new Subtractor(count);

        Thread t1=new Thread(adder);
        Thread t2=new Thread(subtractor);

        t1.start();
        t2.start();
//  Till here t1 and t2 may or may not have executed.We can not print the output.
//  Hence, we have join method to make main thread to wait till t1 and t2 get completed.
        t1.join();
        t2.join();

//  Using join does not guarantee output '0' because it only asks the next thread(main)
//  to wait till t1 and t2 ends their execution. It does not manage execution of t1 and t2.
        System.out.println("count : " +count.value);

    }
}
