package com.scaler.comparator;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Client {
//Step 1 >> create a Client class with main method for execution.
//Step 2 >> create a Car class (base class for which we need to do sorting) with constructor and toString.
//Step 3 >> create a class that implements Comparator<Car> and write the minHeap or Max heap logic.
//Step 4 >> In Client class create an obj of PQ for whatever type of sorting we need (speed based or power based)
//    eg PriorityQueue<Car> carPriorityQueue = new PriorityQueue<>(new CarSpeedComparator());

    static class Car{
        int speed;
        int power;
        String name;

        public Car(int speed, int power, String name) {
            this.speed = speed;
            this.power = power;
            this.name = name;
        }
        @Override
        public String toString() {
            return "("+ this.speed + " "+ this.power+" "+ this.name+")  ";
        }

    }
    static class CarPowerComparator implements Comparator<Car>{
//  comparator implemented Power class
        @Override
        public int compare(Car o1, Car o2) {
            return o1.power- o2.power;
            //o1 < o2 >> returns +ve
            //o1 > o2 >> returns -ve
            //o1 = o2 >> returns zero
        }
    }

    static class CarSpeedComparator implements Comparator<Car>{
//  comparator implemented speed class
        @Override
        public int compare(Car o1, Car o2) {
            return o1.speed - o2.speed;
            //o1 < o2 >> returns +ve
            //o1 > o2 >> returns -ve
            //o1 = o2 >> returns zero
        }
    }

    public static void main(String[] args) {
//        PriorityQueue<Car> carPriorityQueue = new PriorityQueue<>(new CarPowerComparator());//for power comparator
        PriorityQueue<Car> carPriorityQueue = new PriorityQueue<>(new CarSpeedComparator());//for speed comparator
        carPriorityQueue.add(new Car(10, 100, "A"));
        carPriorityQueue.add(new Car(20, 50, "B"));
        carPriorityQueue.add(new Car(80, 500, "C"));
        carPriorityQueue.add(new Car(40, 200, "D"));
        carPriorityQueue.add(new Car(200, 150, "E"));
        carPriorityQueue.add(new Car(100, 400, "F"));
        carPriorityQueue.add(new Car(50, 300, "G"));

        for (Car car : carPriorityQueue) {
            System.out.print(car.toString());
        }
    }
}
