package com.scaler.designpatterns.prototype;

//1.2 Step 2: create a clone method that will be common to all the classes that want the copy of prototype
public interface Prototype<T> {

    T clone();

}
