package com.scaler.priorityqueue;

import com.scaler.introtosemaphore.producerconsumer.Consumer;
import com.scaler.introtosemaphore.producerconsumer.Producer;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class Client {
    public static void main(String[] args) {
//        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>();

//        priorityQueue.add(50);
//        priorityQueue.add(5);
//        priorityQueue.add(10);
//        priorityQueue.add(20);
//        priorityQueue.add(15);
//        priorityQueue.add(30);
//        priorityQueue.add(40);
//        priorityQueue.add(25);

//        for (Integer integer : priorityQueue){
//            System.out.print(integer+" ");
//        }
//  By default this is a min Heap i.e smaller root to higher

        PriorityQueue<Car> carPriorityQueue=new PriorityQueue<>();
        carPriorityQueue.add(new Car(10, 100, "A"));
        carPriorityQueue.add(new Car(20, 50, "B"));
        carPriorityQueue.add(new Car(50, 500, "C"));
        carPriorityQueue.add(new Car(40, 160, "S"));
        carPriorityQueue.add(new Car(200, 180, "D"));
        carPriorityQueue.add(new Car(80, 400, "J"));

        for (Car car : carPriorityQueue){
            System.out.print(car.toString());
        }
        System.out.println();
//    When we run we will get the clas cast exception
//    Now make Car class implement Comparable Interface and override the compareTo method.
//    Run, this class, the sorting is done on the basis of speed.
//    This may not look ascending on basis of speed, but if we poll elements 1 by 1 from the PQ we will get them in ascending order.
//        Add below code and rerun the code
        while (!carPriorityQueue.isEmpty()) {
            Car car = carPriorityQueue.poll();
            System.out.print("("+car.speed + " -> " + car.name+") ");
        }
//  Here all the car objects are removed from the PQ using poll method and hence it is empty.
    }
//  If we want a Max Heap just reverse the order in the compareTo method in car class
}
