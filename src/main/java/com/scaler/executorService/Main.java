package com.scaler.executorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(10);
//  Here we have now created only 10 threads instead of keep creating unlimited thread as done in concurrency 2 Number printer class

        for (int i=1; i<=100; i++){// for 100 tasks we will ask executor service to assign it among 10 threads
            if(i==5 || i==10 || i==50 || i==99){
                System.out.println("Debug");
            }
            NumberPrinter numberPrinter = new NumberPrinter(i);
            executorService.submit(numberPrinter);
        }
//        see the result
//            here you see all 100 threads are distributed among 10 threads, also
//            we can see pool-1 (1 thread pool is created) - here all the threads are kept.

//        Now uncomment if condition and add debugger at sysout, and see the result at debug i=5,i=10 and i=50
//        observations: expand the executor service in console output
//            1. i=5 >> we can see the workers count =4 (workers are nothing but threads in the executorService)
//                      -queue size = 0 (coz till now only 4 tasks are executed and 5th is in progress)
//            2. i=10 >>  we can see the workers count =9.
//                      -queue size = 0 (coz till now only 9 tasks are executed and 10th is in progress)
//            3. i=50 >>  we can see the workers count =10. (max number of thread in thread pool)
//                      -queue size = 39 (coz till now 49 tasks are executed(10 assigned to 10 threads and remaining 39 should be in queue) and 50th is in progress)
//                       Note: the m/c is soo fast that the queue size can be seen zero. Add wait in the run method to see the queue size.
    }
}
