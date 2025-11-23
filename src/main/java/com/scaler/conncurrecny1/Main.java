package com.scaler.conncurrecny1;

public class Main {

    public static void main(String[] args) {
        // printing the default thread
        //java by default creates a default thread called as main thread.
        System.out.println("Hello class is running on thread : " + Thread.currentThread().getName());

//    Steps involved to create a thread
//    1. create a task that you want to execute in seperate thread.
//         -Your task class has to implements Runnable interface (here HelloWorldPrinter)
//             Implement run metnod
//              -inside this run method write the code to perform the task that we want to execute on new thread
//    2. create a thread
//    3. Assign the task to the thread.
//    4. start the thread

    HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
    Thread thread1 = new Thread(helloWorldPrinter); // Step 2/3:created threaded and asssigned the task
    thread1.start(); // step 4: start the

        System.out.println("Hello class is running on thread : " + Thread.currentThread().getName());
//  Imp : here we have 3 theads executing main, thread-0, main
//        The sequence can not be controlled we can even get thread-0 statement at first line.
//        Threads are independent and hence sequence is not gauranteed. We can give priority to make sure the sequence.

//        Lets try few more threads.
        Thread thread2 = new Thread(helloWorldPrinter); // Step 2/3:created threaded and asssigned the task
        thread2.start();

        Thread thread3 = new Thread(helloWorldPrinter); // Step 2/3:created threaded and asssigned the task
        thread3.start();

        Thread thread4 = new Thread(helloWorldPrinter); // Step 2/3:created threaded and asssigned the task
        thread4.start();

        Thread thread5 = new Thread(helloWorldPrinter); // Step 2/3:created threaded and asssigned the task
        thread5.start();
}
}
