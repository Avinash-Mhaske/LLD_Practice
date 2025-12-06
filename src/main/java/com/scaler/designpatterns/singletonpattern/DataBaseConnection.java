package com.scaler.designpatterns.singletonpattern;

public class DataBaseConnection {

    private static volatile DataBaseConnection instance;

    private DataBaseConnection(){}

    public static DataBaseConnection getInstance() {
        if (instance == null){
            synchronized (DataBaseConnection.class){ //lock.lock(); Using lock instead of synchronized keyword.
                if(instance==null){
                    instance=new DataBaseConnection();
                }
                //lock.unlock();
            }
        }
        return instance;
    }
}
