package com.scaler.lambdas;

import com.scaler.comparator.Client;

import java.util.*;

//P3.1
public class DemoCarSorting {

    static class Car implements Comparable<Car>{
        int speed;
        int price;
        String brand;

        public Car(int speed, int price, String brand) {
            this.speed = speed;
            this.price = price;
            this.brand = brand;
        }

        @Override
        public int compareTo(Car other) {
            return this.speed - other.speed;
        }

        @Override
        public String toString() {
            return "(speed: "+ this.speed + " Price: "+ this.price+" brand: "+ this.brand+") \n ";
        }
    }

    static class CarSpeedComparator implements Comparator<Car> {
        //  comparator implemented speed class
        @Override
        public int compare(Car o1, Car o2) {
            return o1.speed- o2.speed;
            //o1 < o2 >> returns +ve
            //o1 > o2 >> returns -ve
            //o1 = o2 >> returns zero
        }
    }
    public static void main(String[] args) {

        Car c1=new Car(10, 1000000, "A");
        Car c2=new Car(20, 500000, "B");
        Car c3=new Car(50, 5000000, "C");
        Car c4=new Car(40, 160000, "S");
        Car c5=new Car(200, 1800000, "D");
        Car c6=new Car(80, 4000000, "J");

        List<Car> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);
        list.add(c5);
        list.add(c6);

        Collections.sort(list);

        System.out.println(list);
//  sorting will be done on basis of speed. comparable is used up here

        CarSpeedComparator speedComparator=new CarSpeedComparator();
                Collections.sort(list, speedComparator);
        System.out.println(list);
//  sorting will be done on basis of speed. comparator is used up here

        Comparator<Car> comparator=(car1, car2) -> {
//            return car1.speed - car2.speed; // Ascending order sorting speed
            return car2.speed - car1.speed; // descending order sorting speed
        };
        Collections.sort(list, comparator);
        System.out.println(list);
//  Sorting of list is done here on basis of speed Using Lambda with comparator.
//        We can just change the speed to price we can get price based sorting
//        If we want the sorting in descending the reverse the order while subtracting.
    }
}
