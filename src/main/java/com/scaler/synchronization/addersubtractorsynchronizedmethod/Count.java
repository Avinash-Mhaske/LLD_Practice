package com.scaler.synchronization.addersubtractorsynchronizedmethod;

public class Count {

    private int value=0;

    public int getValue(){
        return value;
    }

    public synchronized void addValue(int i){
        this.value +=i;
    }
}
