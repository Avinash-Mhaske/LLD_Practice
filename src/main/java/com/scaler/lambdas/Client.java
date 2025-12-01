package com.scaler.lambdas;
//P1.3
public class Client{

    public static void main(String[] args) {

//  Way1 of calling interface method
        DemoFuncInterface way1=new DemoClass();
        way1.fun();

//  In way2 java says you can create an object of Functional interface but,
//  we need to provide the method implementation here in itself.
        DemoFuncInterface way2=new DemoFuncInterface() {
            @Override
            public void fun() {
                System.out.println("way 2 of implementing fun method of FI");
            }
        };
        way2.fun();

//  Way3 Using lambda function. Check the DemoOnLambdas for way 3.
        DemoFuncInterface way3= () -> {};
    }
}
