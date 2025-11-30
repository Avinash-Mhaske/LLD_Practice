package com.scaler.priorityqueue;

import java.util.PriorityQueue;
//Step 1 : Define the Car Class with Comparable, compareTo, and toString methods.
//Step 2 : Add Cars to PriorityQueue(client class)
//Step 3: Poll Elements One by One. >> The poll() method removes and returns the head of the queue (the smallest element according to natural order).
public class Car implements Comparable<Car>{
    int speed;
    int power;
    String name;

    public Car(int speed, int power, String name) {
        this.speed = speed;
        this.power = power;
        this.name = name;
    }

    @Override
    public int compareTo(Car other) {
//        return this.speed-other.speed;
        return other.speed-this.speed; //If we want a Max Heap
    }

    @Override
    public String toString() {
        return "("+ this.speed + " "+ this.power+" "+ this.name+")  ";
    }

}
