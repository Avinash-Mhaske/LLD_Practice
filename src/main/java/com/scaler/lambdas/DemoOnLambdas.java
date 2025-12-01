package com.scaler.lambdas;

import java.util.function.BiPredicate;
import java.util.function.Consumer;

//P2.
//Here we will see the ways of implementing methods of predefined FI.
public class DemoOnLambdas {

    public static void main(String[] args) {
//  Way 2 we have already seen
        Consumer<String>  consumer1= new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("Hello "+ s);
            }
        };
        consumer1.accept("Brother");

//  Way 3 : using Lambdas
//  () pass the function arguments
//  -> this is a lambda expression
        Consumer<String> consumer2=(str) -> {
            System.out.println("Hello "+str);
        };
        consumer2.accept("Avin");

    BiPredicate<String, String> biPredicate=(s1, s2) -> {
        return s1.length() > s2.length();
    };
        System.out.println(biPredicate.test("Hello", "hey"));
}
//Now lets see the sorting of cars that we did using Comparable and Comparator/ New class P3 series
}