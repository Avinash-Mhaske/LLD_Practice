package com.scaler.designpatterns.adapter;

//1.2 here we will have methods that we need from 3rd party
public interface BankAPi {
    void sendMoney(String from, String to, int amount);
    void registerAccount(String accountNumber);
    long getBalance(String accountNumber);
}
